package com.neusoft.entity;

import lombok.AllArgsConstructor;

/**
 *
 * @company 尚学堂
 */
@AllArgsConstructor
public class User {

    public int id;

    /*
     * 姓名
     */
    public String name;

    /**
     * 改变的是user副本的name属性指向的String，user本身指向的String也随之改变
     * @param user
     */
    public void parameterTransfer01(User user) {
        user.name = "01姓名";
    }

    /**
     * 改变的是user副本的地址，原本的user没有改变
     * @param user
     */
    public void parameterTransfer02(User user) {
        user = new User(200, "02姓名");
    }
}
