package com.neusoft.basic;

/**
 *  方法重载测试
 *      一、参数个数不一致；
 *      二、参数类型不一致；
 *      三、参数顺序不一致：本例就是验证参数顺序不一致的情况
 *
 * @company 咕泡学院
 */
public class BasicTest2 {

    public static void main(String[] args) {
        meloTest(10, 10.1d);
        meloTest(10.1d, 10);

    }

    public static void meloTest(int a, double b) {
        System.out.println("Melo - 1");
    }

    public static void meloTest(double a, int b) {
        System.out.println("Melo - 2");
    }
}
