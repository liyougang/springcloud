package com.gang.demo.springcloundprivider.dto;

public class UserDto {
    // 学号
    private long id;
    // 姓名
    private String userName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
