package com.neusoft.genericity;

import java.util.ArrayList;

/**
 * 去泛化
 *
 * 泛型只在编译阶段有效，在编译之后程序会采取去泛型化的措施
 * 在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦除。并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法
 * 泛型信息不会进入到运行时阶段
 * <p>
 * 泛型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型
 *
 * @author Melo
 * @company 富仁集团
 */
public class GenericityTest1 {

    public static void main(String[] args) {
        Class class1 = new ArrayList<String>().getClass();
        Class class2 = new ArrayList<Integer>().getClass();

        System.out.println(class1 == class2);
        System.out.println(class1.equals(class2));
    }
}
