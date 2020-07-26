package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.function.Function;

/**
 * 函数型接口；对类型为T的对象做操作，并返回R类型的对象结果；入参为T，出参为R
 */
public class T06_FunctionTest {

    @Test
    public void test() {
        System.out.println(this.integerHandle(23, intValue -> intValue = intValue + 100));
    }

    /**
     * 对int型做处理
     *
     * @param inputDouble
     * @param integerHandler
     * @return
     */
    public int integerHandle(int inputDouble, Function<Integer, Integer> integerHandler) {
        return integerHandler.apply(inputDouble);
    }
}
