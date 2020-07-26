package com.neusoft.DesignMode.singleton;

/**
 * 设计模式
 *      单例模式
 *          饿汉式
 */
public class Singleton1 {

    private static volatile Singleton1 singletonTest = new Singleton1(); // 类实例化时就创建该对象

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singletonTest;
    }
}
