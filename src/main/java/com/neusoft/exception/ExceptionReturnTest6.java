package com.neusoft.exception;

/**
 * 一、当try和catch中有return时，finally仍然会执行
 * 二、finally是在return后面的表达式运算后执行的
 *      （此时并没有返回运算后的值，而是先把要返回的值保存起来，不管finally中的代码怎么样，返回的值都不会改变，任然是之前保存的值），
 *      所以函数返回值是在finally执行前确定的
 *
 * @company 咕泡学院
 */
public class ExceptionReturnTest6 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        int temp = 1;
        try {
            System.out.println(temp);   // temp=1
            return ++temp;  // temp=2；return 2
        } catch (Exception e) {
            System.out.println(temp);
            return ++temp;
        } finally {
            ++temp; // temp=3
            System.out.println(temp);
        }
    }
}
