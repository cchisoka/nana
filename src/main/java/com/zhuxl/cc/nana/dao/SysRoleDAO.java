package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysRole;

public interface SysRoleDAO {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}