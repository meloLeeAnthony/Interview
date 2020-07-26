package com.neusoft.exception;

/**
 * try catch finally的执行顺序
 *
 * @attention   一、不管有没有出现异常，finally块中代码都会执行
 *              二、当try和catch中有return时，finally仍然会执行
 *              三、finally是在return后面的表达式运算后执行的
 *              四、当finally里面没有return语句时，执行try和finally语句之后再执行return
 *                      （此时并没有返回运算后的值，而是先把要返回的值保存起来，不管finally中的代码怎么样，返回的值都不会改变，任然是之前保存的值）
 *                      所以函数返回值是在finally执行前确定的
 *              五、finally中最好不要包含return，否则程序会提前退出，返回值不是try或catch中保存的返回值
 *
 * @company 富仁集团
 */
public class ExceptionReturnTest {

    public static void main(String[] args) {
        System.out.println("i is:" + test());
    }

    public static int test() {
        int i = 0;

        try {
            i = i / 0; // 第一步：i=0
            return i++;
        } catch (Exception e) {
            i = i + 10; // 第二步：i=10
            return i--; // 第三步：i=9
        } finally {
            i = i * 2; // 第四步：i=18
            return i - 100; // 第五步：i=-82
        }
    }
}
