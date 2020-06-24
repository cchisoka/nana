package com.zhuxl.cc.nana.service;

import com.zhuxl.cc.nana.model.domain.SysMenu;
import com.zhuxl.cc.nana.model.domain.SysUser;
import com.zhuxl.cc.nana.model.query.SysUserSearch;

import java.util.List;

/**
 * <p>
 * Title:        UserService.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2020年06月08日
 */
public interface SysUserService {

    /**
     * 通过用户名查找用户
     * @param userName
     * @return
     */
    SysUser selectUserByUserName(String userName);

    List<SysMenu> selectPermissionByUserId(long userId);

    /**
     * 根据条件分页查询用户列表
     * @param sysUserSearch
     * @param offset
     * @param limit
     * @return
     */
    List<SysUser> selectUserByCon(SysUserSearch sysUserSearch, int offset, int limit);

    /**
     * 新增用户
     * @param sysUser
     */
    int insertUser(SysUser sysUser);

    /**
     * 修改用户信息
     * @param sysUser
     */
    int updateUser(SysUser sysUser);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteUserByUserId(Long userId);

}
