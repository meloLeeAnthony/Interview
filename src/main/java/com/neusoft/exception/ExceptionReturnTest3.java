package com.neusoft.exception;

/**
 * 一、当try和catch中有return时，finally仍然会执行
 * 二、finally是在return后面的表达式运算后执行的
 *      （此时并没有返回运算后的值，而是先把要返回的值保存起来，不管finally中的代码怎么样，返回的值都不会改变，任然是之前保存的值），
 *      所以函数返回值是在finally执行前确定的
 *
 */
public class ExceptionReturnTest3 {

    public static void main(String[] args) {
        System.out.println("i is:" + demo3());
    }

    /**
     * 函数返回值是2；
     * i的值是12
     */
    public static int demo3() {
        int i = 0;  // 第一步：i=0
        try {
            i = 2;  // 第二步：i=2
            return i;   // 第三步：函数返回值为2； 第五步：i=12,但函数的返回值还是之前保存的2
        } finally {
            i = 12; // 第四步：i=12
            System.out.println("finally trumps return.");
        }
    }
}
