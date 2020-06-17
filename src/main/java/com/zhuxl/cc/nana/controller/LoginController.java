package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 * Title:        LoginController.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2020年06月05日
 */
@Controller
public class LoginController {

    /**
     *
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    public CommonResult doLogin() {
        return null;
    }

}
