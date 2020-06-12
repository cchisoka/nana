package com.zhuxl.cc.nana.controller;

import com.zhuxl.cc.nana.common.CommonPage;
import com.zhuxl.cc.nana.common.CommonResult;
import com.zhuxl.cc.nana.model.domain.SysUser;
import com.zhuxl.cc.nana.model.query.SysUserSearch;
import com.zhuxl.cc.nana.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * Title:        SysUserController.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2020年06月08日
 */
@RequestMapping("/sysUser")
@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @GetMapping("/list")
    public String list() {
        return "user/list";
    }

    @GetMapping("/add")
    public String add() {
        return "user/add";
    }


    @GetMapping("/update")
    public String update() {
        return "user/update";
    }


    /**
     * 获取用户数据列表
     * @param userSearch
     * @param offset
     * @param limit
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<SysUser>> listSysUser(SysUserSearch userSearch,
                                             @RequestParam(name = "offset", defaultValue = "0") int offset,
                                             @RequestParam(name = "limit", defaultValue = "10") int limit) {
        List<SysUser> list = sysUserService.selectUserByCon(userSearch, offset, limit);
        return CommonResult.success(CommonPage.restPage(list));
    }

    /**
     * 新增用户
     * @param sysUser
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public CommonResult addUser(SysUser sysUser) {

        sysUserService.insertUser(sysUser);
        return CommonResult.success(null);
    }

    /**
     * 修改用户信息
     * @param sysUser
     * @return
     */
    @PostMapping("update")
    @ResponseBody
    public CommonResult updateUser(SysUser sysUser) {
        if (sysUser.getUserId() == null || sysUser.getUserId() <= 0) {
            return CommonResult.failed("用户不存在");
        }

        sysUserService.updateUser(sysUser);

        return CommonResult.success(null);
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody
    public CommonResult deleteUser(Long userId) {
        if (userId == null || userId <= 0) {
            return CommonResult.failed("用户不存在");
        }

        sysUserService.deleteUserByUserId(userId);
        return CommonResult.success(null);
    }
}
