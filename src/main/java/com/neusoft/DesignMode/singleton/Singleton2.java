package com.neusoft.DesignMode.singleton;

/**
 * 设计模式
 *      单例模式
 *          懒汉式
 * @author lichu
 */
public class Singleton2 {

    /**
     * volatile保证线程之间的可见性，CPU高速缓存刷新
     */
    private static volatile Singleton2 singleton;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        // 双重检验：第一层
        if (null == singleton) {
            synchronized (Singleton2.class) {
                // 双重检验：第二层
                if (null == singleton) {
                    singleton = new Singleton2();
                }
            }
        }

        return singleton;
    }
}
