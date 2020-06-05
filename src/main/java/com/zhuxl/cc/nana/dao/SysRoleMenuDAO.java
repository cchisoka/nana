package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysRoleMenu;
import com.zhuxl.cc.nana.model.domain.SysRoleMenuKey;

public interface SysRoleMenuDAO {
    int deleteByPrimaryKey(SysRoleMenuKey key);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(SysRoleMenuKey key);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}