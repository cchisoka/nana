package com.zhuxl.cc.nana.model.dto;

/**
 * @author: zhuxl
 * @Date: 2020/6/23
 */
public class Node {
    private Long id;
    private Long pId;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
