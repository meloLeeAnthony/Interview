package com.neusoft.basic;

/**
 * @author lichu
 * @company 咕泡学院
 */
public class BasicTest1 {

    /**
     * 静态成员变量未被final时，它的值可以被更改
     *
     */
    public static int a = 1;

    public static void main(String[] args) {
        int a = 10;
        a++;
        BasicTest1.a++;
        BasicTest1 t = new BasicTest1();

        System.out.println("a: " + a + "; t.a: " + t.a);
    }
}
