package com.zhuxl.cc.nana.service.impl;

import com.zhuxl.cc.nana.dao.SysMenuDAO;
import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuDAO sysMenuDAO;

    @Override
    public List<SysMenu> selectSysMenu() {
        return sysMenuDAO.selectSysMenu();
    }
}
