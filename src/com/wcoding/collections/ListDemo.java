package com.wcoding.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");

        System.out.println(list.set(0, "+"));
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
