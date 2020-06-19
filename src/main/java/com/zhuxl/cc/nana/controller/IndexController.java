package com.zhuxl.cc.nana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * Title:        IndexController.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2020年06月05日
 */
@Controller
public class IndexController {

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}
