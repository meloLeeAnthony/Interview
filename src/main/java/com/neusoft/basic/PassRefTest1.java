package com.neusoft.basic;

import com.neusoft.entity.User;

/**
 * 方法中所有参数都是“值传递”，也就是“传递的是值的副本”。因此复印件改变不会影响原件
 *
 * @company 尚学堂
 */
public class PassRefTest1 {

    public static void main(String[] args) {
        User user = new User(100, "new姓名");

        user.parameterTransfer01(user);
        System.out.println(user.name);

        user.parameterTransfer02(user);
        System.out.println(user.name);
    }
}
