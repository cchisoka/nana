package com.zhuxl.cc.nana.service;

import com.zhuxl.cc.nana.model.domain.SysRole;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
public interface SysRoleService {

    /**
     * 条件查询角色
     * @param sysRole
     * @param offset
     * @param limit
     * @return
     */
    List<SysRole> selectRoleByCon(SysRole sysRole, int offset, int limit);
}
