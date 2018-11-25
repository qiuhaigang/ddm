package com.baizhi.ddm.entity;

import java.util.Date;

public class User {
    private int id;
    private String email;
    private String nickName;
    private String password;
    private Date creatDate;
    private char state;
    private String authority;

    public User(int id, String email, String nickName, String password, Date creatDate, char state, String authority) {
        this.id = id;
        this.email = email;
        this.nickName = nickName;
        this.password = password;
        this.creatDate = creatDate;
        this.state = state;
        this.authority = authority;
    }

    public User() {
    }

    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", creatDate=" + creatDate +
                ", state=" + state +
                ", authority='" + authority + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
