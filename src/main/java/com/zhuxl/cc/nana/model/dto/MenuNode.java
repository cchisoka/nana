package com.zhuxl.cc.nana.model.dto;

/**
 * @author: zhuxl
 * @Date: 2020/6/23
 */
public class MenuNode extends Node {
    private Boolean isParent;
    private Boolean open;

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }
}
