package com.zhuxl.cc.nana.service;

import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.model.dto.MenuNode;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
public interface SysMenuService {

    List<SysMenu> selectSysMenu();

    List<MenuNode> getMenuTreeData();

    void allotMenu(long[] menuIds, long roleId);

    List<Long> getRoleMenuIdList(long roleId);
}
