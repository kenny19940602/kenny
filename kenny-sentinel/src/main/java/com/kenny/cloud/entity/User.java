package com.kenny.cloud.entity;

public class User {

    private Long id;
    private String userName;
    private String passWord;

    public User(Long id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }
}
