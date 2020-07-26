package com.neusoft.exception;

/**
 * finally中最好不要包含return，否则程序会提前退出，返回值不是try或catch中保存的返回值
 */
public class ExceptionReturnTest4 {

    public static void main(String[] args) {
        System.out.println("i is:" + demo4());
    }

    public static int demo4() {
        int i = 0;
        try {
            return i;
        } finally {
            i = 12;
            System.out.println("finally trumps return.");
            return i;
        }
    }
}
