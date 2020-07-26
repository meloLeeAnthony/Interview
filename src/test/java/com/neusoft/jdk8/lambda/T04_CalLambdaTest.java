package com.neusoft.jdk8.lambda;

import org.junit.Test;

/**
 * 需求：对一个数做数学计算
 *
 */
public class T04_CalLambdaTest {

    @Test
    public void test() {
        Integer rtnValue = calOperation(10, value -> value * value);
        System.out.println(rtnValue);
    }

    public Integer calOperation(Integer value, T04_CalLambda calRealize) {
        return calRealize.calOperation(value);
    }

}


