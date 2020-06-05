package com.zhuxl.cc.nana.model.domain;

import java.io.Serializable;

/**
 * sys_user_role
 * @author 
 */
public class SysUserRoleKey implements Serializable {
    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 用户id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}