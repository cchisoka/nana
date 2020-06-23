package com.zhuxl.cc.nana.dao;

import com.zhuxl.cc.nana.model.domain.SysRoleMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMenuDAO {
    int insert(SysRoleMenu record);

    int deleteMenuByRoleId(long roleId);

    List<Long> selectMenuIdByRoleId(long roleId);
}
