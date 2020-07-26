package com.neusoft.extend.entity;

public class Person {

    /**
     * 第一步执行：父类【静态成员】和【静态代码块】，按在代码中出现的顺序依次执行
     */
    public static int j = print();

    {
        System.out.println("******");
    }

    public Person() {
        System.out.println("Person 构造函数");
    }

    public static int print() {
        System.out.println("Person print");
        return 123;
    }

    public int plus(int arg) {
        System.out.println("arg is" + arg++);
        return arg;
    }
}
