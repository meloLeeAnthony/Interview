package com.neusoft.extend;

import com.neusoft.extend.entity.Student;

/**
 * 父子类继承执行顺序
 *    一、父类【静态成员】和【静态代码块】，按在代码中出现的顺序依次执行；
 *    二、子类【静态成员】和【静态代码块】，按在代码中出现的顺序依次执行；
 *    三、父类的【普通成员变量被普通成员方法赋值】和【普通代码块】，按在代码中出现的顺序依次执行
 *    四、执行父类的构造方法
 *    五、子类的【普通成员变量被普通成员方法赋值】和【普通代码块】，按在代码中出现的顺序依次执行
 *    六、执行子类的构造方法
 *
 * @company 富仁集团
 */
public class ExtendsTest1 {
    public static void main(String[] args) {
        System.out.println("main start");

        Student student = new Student();
        System.out.println("m=" + student.m);
    }
}
