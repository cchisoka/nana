package com.zhuxl.cc.nana.model.query;

/**
 * <p>
 * Title:        UserSearch.java
 * <p>
 * Description:
 *
 * @author zhuxl
 * @date 2020年06月08日
 */
public class SysUserSearch {
    private String userName;

    private String phoneNumber;

    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
