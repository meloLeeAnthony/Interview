package com.neusoft.exception;

/**
 * 一、finally是在return后面的表达式运算后执行的
 * 二、当finally里面没有return语句时，执行try和finally语句之后再执行return
 *
 *
 */
public class ExceptionReturnTest5 {

    public static void main(String[] args) {
        System.out.println("i is:" + demo5());
    }

    public static int demo5() {
        try {
            return printX();
        } finally {
            System.out.println("finally trumps return... sort of");
        }
    }

    public static int printX() {
        System.out.println("X");
        return 0;
    }
}
