package com.neusoft.collection.hashMap;

import java.util.HashMap;

public class Test1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");

        System.out.println(hashMap.get(1));

        // 左移3位：0000 1111 -> 0111 0000
        System.out.println("15 << 3的值为：" + (15 << 3));

        // 右移3位，多余的直接舍弃：0000 1111 -> 0000 0001
        System.out.println("15 >> 3的值为：" + (15 >> 3));
    }
}
