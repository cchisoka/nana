package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.model.domain.SysUser;
import com.zhuxl.cc.nana.model.query.SysUserSearch;

import java.util.List;

public interface SysUserDAO {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> selectUserByCon(SysUserSearch sysUserSearch);

    List<SysMenu> selectPermissionByUserId(long userId);
}
