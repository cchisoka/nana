package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysUser;

public interface SysUserDAO {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}