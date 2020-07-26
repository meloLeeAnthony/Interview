package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class T06_toIntFunctionTest {

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
    public int integerHandle(int inputDouble, ToIntFunction<Integer> integerHandler) {
        return integerHandler.applyAsInt(inputDouble);
    }
}
