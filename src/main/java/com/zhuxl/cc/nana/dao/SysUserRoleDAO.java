package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysUserRole;
import com.zhuxl.cc.nana.model.domain.SysUserRoleKey;

public interface SysUserRoleDAO {
    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(SysUserRoleKey key);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}