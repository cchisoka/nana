package com.zhuxl.cc.nana.component;

import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.common.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * Title:        GlobalExceptionHandler.java
 * <p>
 * Description: 全局异常处理
 *
 * @author zhuxl
 * @date 2020年04月13日
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResult exceptionHandler (Exception e) {
        logger.error("未知异常：",e );
        return CommonResult.failed(ResultCode.UNKNOWN_EXCEPTION);
    }

}
