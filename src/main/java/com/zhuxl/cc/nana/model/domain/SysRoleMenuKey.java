package com.zhuxl.cc.nana.model.domain;

import java.io.Serializable;

/**
 * sys_role_menu
 * @author 
 */
public class SysRoleMenuKey implements Serializable {
    private Long roleId;

    private Long menuId;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}