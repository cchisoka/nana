package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysMenu;

public interface SysMenuDAO {
    int deleteByPrimaryKey(Long menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}