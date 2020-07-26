package com.neusoft.exception;

public class ExceptionReturnTest1 {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        try {
            System.out.println("result");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally trumps.");
        }
    }


}
