package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonPage;
import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.model.domain.SysRole;
import com.zhuxl.cc.nana.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
@RequestMapping("/sysRole")
@Controller
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("/list")
    public String list() {
        return "role/list";
    }

    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<SysRole>> listSysUser(SysRole sysRole,
                                                         @RequestParam(name = "offset", defaultValue = "0") int offset,
                                                         @RequestParam(name = "limit", defaultValue = "10") int limit) {
        List<SysRole> list = sysRoleService.selectRoleByCon(sysRole, offset, limit);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
