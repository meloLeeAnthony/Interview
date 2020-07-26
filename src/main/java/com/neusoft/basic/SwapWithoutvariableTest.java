package com.neusoft.basic;

import java.util.Stack;

/**
 * 不使用第三个变量，交换两个变量的值
 */
public class SwapWithoutvariableTest {

    private static int a = 10, b = 2;

    public static void main(String[] args) {
        // arithmetic_1();
        // arithmetic_2();
        // stack();
        operator();
    }

    /**
     * 1、算术运算实现
     * (a = 10, b = 2) -> (a = 2, b = 10)
     */
    public static void arithmetic_1() {
        // a=-8; b=2
        a = b - a;

        // a=-8; b=10
        b = b - a;

        // a=2; b=10
        a = b + a;

        System.out.println("a:" + a + "; b:" + b);
    }

    /**
     * 2、算术运算实现
     * (a = 10, b = 2) -> (a = 2, b = 10)
     */
    public static void arithmetic_2() {
        // a=12; b=2
        a = a + b;

        // a=12; b=10
        b = a - b;

        // a=12; b=10
        a = a - b;

        System.out.println("a:" + a + "; b:" + b);
    }

    /**
     * 3、栈实现
     * (a = 10, b = 2) -> (a = 2, b = 10)
     */
    public static void stack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(a);
        stack.push(b);

        a = stack.pop();
        b = stack.pop();

        System.out.println("a:" + a + "; b:" + b);
    }

    /**
     * 4、位运算符实现：异或运算
     * (a = 10, b = 2) -> (a = 2, b = 10)
     */
    public static void operator() {
        //  a：1010(10) ^ b：0010(2) -> a：1000(8)
        a = a ^ b;
        //  a：1000(8) ^ b：0010(2) -> b：1010(10)
        b = a ^ b;
        //  a：1000(8) ^ b：1010(10) -> a：0010(2)
        a = a ^ b;

        System.out.println("a:" + a + "; b:" + b);
    }
}
