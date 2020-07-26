package com.neusoft.exception;

/**
 * 当finally里面没有return语句时，执行try和finally语句之后再执行return
 *
 */
public class ExceptionReturnTest2 {

    public static void main(String[] args) {
        demo2();
    }

    public static int demo2() {
        try {
            return 0;
        }
        finally {
            System.out.println("finally trumps return.");
        }
    }

}
