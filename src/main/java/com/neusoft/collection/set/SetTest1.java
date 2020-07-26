package com.neusoft.collection.set;

import com.neusoft.entity.Person;
import com.neusoft.entity.Student;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @company 富仁集团
 *      JDK 1.8的情况下面试题有问题，Set是可以删除的
 */
public class SetTest1 {

    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        Student s1 = new Student("刘备", "男", 25);
        Student s2 = new Student("关羽", "男", 24);
        Student s3 = new Student("张飞", "男", 23);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("有" + set.size() + "个学生！");

        s3.setAge(26);

        set.remove(s3);
        set.add(s3);

        System.out.println("操作后现在有：" + set.size() + "个元素");

        for (Person person : set) {
            System.out.println(person);
        }
    }
}
