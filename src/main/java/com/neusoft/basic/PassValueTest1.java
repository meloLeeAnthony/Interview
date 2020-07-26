package com.neusoft.basic;

/**
 *  方法中所有参数都是“值传递”，也就是“传递的是值的副本”。因此复印件改变不会影响原件
 *
 * @company 尚硅谷
 */
public class PassValueTest1 {

    public static void main(String[] args) {
        int a = 5;

        changeValue(a);

        System.out.println(a);
    }

    private static void changeValue(int a) {
        a =3;
    }
}
