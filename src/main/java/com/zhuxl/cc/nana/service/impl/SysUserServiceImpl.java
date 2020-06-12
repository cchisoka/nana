package com.zhuxl.cc.nana.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhuxl.cc.nana.dao.SysUserDAO;
import com.zhuxl.cc.nana.model.domain.SysUser;
import com.zhuxl.cc.nana.model.query.SysUserSearch;
import com.zhuxl.cc.nana.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * Title:        UserServiceImpl.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2020年06月08日
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDAO sysUserDAO;

    @Override
    public SysUser selectUserByUserName(String userName) {
        SysUser sysUser = null;

        SysUserSearch userSearch = new SysUserSearch();
        userSearch.setUserName(userName);
        List<SysUser> list = sysUserDAO.selectUserByCon(userSearch);
        if (!CollectionUtils.isEmpty(list) && list.size() == 1) {
            sysUser =  list.get(0);
        }

        return sysUser;
    }

    @Override
    public List<SysUser> selectUserByCon(SysUserSearch sysUserSearch, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        List<SysUser> list = sysUserDAO.selectUserByCon(sysUserSearch);
        return list;
    }

    @Override
    public int insertUser(SysUser sysUser) {
        sysUser.setCreateTime(new Date());
        sysUser.setUpdateTime(sysUser.getCreateTime());
        return sysUserDAO.insertSelective(sysUser);
    }

    @Override
    public int updateUser(SysUser sysUser) {
        sysUser.setUpdateTime(new Date());
        return sysUserDAO.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int deleteUserByUserId(Long userId) {
        return sysUserDAO.deleteByPrimaryKey(userId);
    }


}
