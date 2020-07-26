package com.neusoft.basic;

/**
 * static静态代码块已经在ClassLoader的Linking：Preparation阶段分配了内存空间，并初始化JVM默认值
 *
 * @company 尚学堂
 */
public class StaticTest1 {

    public static int a;

    static {
        a = 10;
        System.out.println("in stack block");
    }

    public static void main(String[] args) {
        System.out.println(StaticTest1.a);
        System.out.println(StaticTest1.a);
    }
}
