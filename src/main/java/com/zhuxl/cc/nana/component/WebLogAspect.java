package com.zhuxl.cc.nana.component;

import com.zhuxl.cc.nana.model.domain.SysLog;
import com.zhuxl.cc.nana.service.SysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zhuxl
 * @Date: 2020/6/17
 */
@Aspect
@Component
public class WebLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Autowired
    private SysLogService sysLogService;
    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    /**
     * 定义一个切入点
     */
    @Pointcut("execution(public * com.zhuxl.cc.nana.controller.*.*(..))")
    public void webLog() {}


    /**
     * 在切入点开始处切入内容
     * @param joinPoint
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        if (logger.isDebugEnabled()) {
            logger.debug("..... @Before method executed.....");
        }

    }

    /**
     * 切入点结尾处切入内容
     */
    @After("webLog()")
    public void doAfter() {
        if (logger.isDebugEnabled()) {
            logger.debug("..... @After method executed.....");
        }
    }

    /**
     * 在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
     * @param result
     */
    @AfterReturning(returning = "result", pointcut = "webLog()")
    public void doAfterReturning4(Object result) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        SysLog sysLog = new SysLog();
        SysLog sysLog3 = new SysLog();
        sysLog.setUri(request.getRequestURI());
        sysLog.setMethod(request.getMethod());
        sysLog.setIp(request.getRemoteAddr());
        sysLog.setStartTime(startTime.get());
        sysLog.setSpendTime((int)(System.currentTimeMillis() - startTime.get()));

        //sysLogService.writeSysLog(sysLog);
        //异步持久化日志
        threadPoolTaskExecutor.execute(new SaveLogThread(sysLog, sysLogService));

        if (logger.isDebugEnabled()) {
            logger.debug("..... @AfterReturning method executed.....");
        }
    }

    private static class SaveLogThread implements Runnable {

        private SysLog sysLog;
        private SysLogService logService;

        public SaveLogThread(SysLog sysLog, SysLogService logService) {
            this.sysLog = sysLog;
            this.logService = logService;
        }

        @Override
        public void run() {
            logService.writeSysLog(sysLog);
        }
    }
}
