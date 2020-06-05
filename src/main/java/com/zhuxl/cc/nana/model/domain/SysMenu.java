package com.zhuxl.cc.nana.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_menu
 * @author 
 */
public class SysMenu implements Serializable {
    private Long menuId;

    /**
     * 父id
     */
    private Long pid;

    /**
     * 名称
     */
    private String menuName;

    /**
     * permission值
     */
    private String code;

    /**
     * 1-目录 2-菜单 3-按钮
     */
    private Byte menuType;

    /**
     * 链接
     */
    private String url;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getMenuType() {
        return menuType;
    }

    public void setMenuType(Byte menuType) {
        this.menuType = menuType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}