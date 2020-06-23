package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.model.dto.MenuNode;
import com.zhuxl.cc.nana.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/getMenuTree")
    @ResponseBody
    public CommonResult<List<MenuNode>> getMenuTree() {
        List<MenuNode> list = sysMenuService.getMenuTreeData();
        return CommonResult.success(list);
    }

    @PostMapping("/allot")
    @ResponseBody
    public CommonResult allotMenu(@RequestParam(name = "ids[]") long[] idArr, @RequestParam(name = "roleId") long roleId) {

        sysMenuService.allotMenu(idArr, roleId);
        return CommonResult.success(null);
    }

    @GetMapping("/getRoleMenuIdList")
    @ResponseBody
    public CommonResult getRoleMenuIdList(@RequestParam(name = "roleId") long roleId) {
        List<Long> list = sysMenuService.getRoleMenuIdList(roleId);
        return CommonResult.success(list);
    }
}
