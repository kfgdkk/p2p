package com.p2p.pojo;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
public class TbAdminUser {
    private Integer id;
    private String username;
    private String password;

    public TbAdminUser() {
    }

    public TbAdminUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
