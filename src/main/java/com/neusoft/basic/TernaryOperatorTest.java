package com.neusoft.basic;

/**
 * 三目运算符测试
 *
 * @company 咕泡学院
 */
public class TernaryOperatorTest {
    public static void main(String[] args) {
        boolean b = true ? false : true == true ? false : true;

        // boolean b = true ? false : (true == true ? false : true);

        System.out.println(b);
    }
}
