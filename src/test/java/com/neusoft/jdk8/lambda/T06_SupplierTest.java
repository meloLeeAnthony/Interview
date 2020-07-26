package com.neusoft.jdk8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 供给型接口；返回类型为T的对象；没有入参，出参为T
 */
public class T06_SupplierTest {

    @Test
    public void test() {
        Random random = new Random();

        List<Integer> list = this.supplierNumbers(5, () -> random.nextInt(100));
        list.forEach(System.out::println);
    }


    public List<Integer> supplierNumbers(int numSize, Supplier<Integer> creator) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numSize; i++) {
            list.add(creator.get());
        }

        return list;
    }
}
