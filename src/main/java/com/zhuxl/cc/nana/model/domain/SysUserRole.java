package com.zhuxl.cc.nana.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_user_role
 * @author 
 */
public class SysUserRole extends SysUserRoleKey implements Serializable {
    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}