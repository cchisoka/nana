package com.zhuxl.cc.nana.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhuxl.cc.nana.dao.SysRoleDAO;
import com.zhuxl.cc.nana.model.domain.SysRole;
import com.zhuxl.cc.nana.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhuxl
 * @Date: 2020/6/22
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDAO sysRoleDAO;

    @Override
    public List<SysRole> selectRoleByCon(SysRole sysRole, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        return sysRoleDAO.selectRoleByCon(sysRole);
    }
}
