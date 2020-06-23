package com.zhuxl.cc.nana.service.impl;

import com.zhuxl.cc.nana.dao.SysMenuDAO;
import com.zhuxl.cc.nana.dao.SysRoleMenuDAO;
import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.model.domain.SysRoleMenu;
import com.zhuxl.cc.nana.model.dto.MenuNode;
import com.zhuxl.cc.nana.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuDAO sysMenuDAO;
    @Autowired
    private SysRoleMenuDAO sysRoleMenuDAO;

    @Override
    public List<SysMenu> selectSysMenu() {
        return sysMenuDAO.selectSysMenu();
    }

    @Override
    public List<MenuNode> getMenuTreeData() {
        List<SysMenu>  list = sysMenuDAO.selectSysMenu();
        MenuNode menuNode = null;
        List<MenuNode> menuNodes = new ArrayList<>();
        for (SysMenu sysMenu: list) {
            menuNode = new MenuNode();
            menuNode.setId(sysMenu.getMenuId());
            menuNode.setpId(sysMenu.getPid());
            menuNode.setName(sysMenu.getMenuName());
            menuNode.setOpen(true);
            menuNodes.add(menuNode);
        }
        return menuNodes;
    }

    @Override
    @Transactional
    public void allotMenu(long[] menuIds, long roleId) {
        sysRoleMenuDAO.deleteMenuByRoleId(roleId);
        SysRoleMenu roleMenu = null;
        for (long id: menuIds) {
            roleMenu = new SysRoleMenu();
            roleMenu.setMenuId(id);
            roleMenu.setRoleId(roleId);
            sysRoleMenuDAO.insert(roleMenu);
        }
    }

    @Override
    public List<Long> getRoleMenuIdList(long roleId) {
        return sysRoleMenuDAO.selectMenuIdByRoleId(roleId);
    }
}
