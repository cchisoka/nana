package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * Title:        TestController.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2019年10月23日
 */
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping("/sayHi")
    public String sayHi() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/user/{id}")
    public CommonResult queryUserName(@PathVariable(name = "id") Long id) {

        return CommonResult.success(testService.selectUserNameById(id));
    }
}
