package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
@RequestMapping("/sysMenu")
@Controller
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping("/list")
    public String list() {
        return "menu/list";
    }

    @PostMapping("/list")
    @ResponseBody
    public CommonResult<List<SysMenu>> listSyMenu() {
        List<SysMenu> list = sysMenuService.selectSysMenu();
        return CommonResult.success(list);
    }
}
