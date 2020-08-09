package com.neusoft.DesignMode.singleton;

/**
 * 设计模式
 *      单例模式
 *          静态内部类
 */
public class Singleton3 {

    private static class SingletonInstance {
        private static final Singleton3 singleton = new Singleton3();
    }

    private Singleton3() {
        System.out.println("test");
    }

    public static Singleton3 getInstance() {
        return SingletonInstance.singleton;
    }
}
