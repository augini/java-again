package com.wcoding.collections;

import java.util.*;

public class SetDemo {
    public static void show(){
        // does not guarantee the order of items
        // stores unique values
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("is");

        //move the collection into set to get rid of duplicates
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c", "c", "d", "fasdfds");
        System.out.println(collection);

        Set<String> set2 = new HashSet<>(collection);
        System.out.println(set2 + "\n");

        // methods on set interface
        Set<String> demo1 = new HashSet<>(Arrays.asList("a","b","c","d"));
        Set<String> demo2 = new HashSet<>(Arrays.asList("d","b","g","h"));

        //Union -> joining both sets
        demo1.addAll(demo2);
        System.out.println("Union Example \n---------------");
        System.out.println(demo1);

        //Intersection  -> getting the values that exist on both sets
        demo1.retainAll(demo2);
        System.out.println("\nIntersection Example \n---------------");
        System.out.println(demo1);

        //Difference  -> getting the values that uniquely exist on both sets
        demo2.removeAll(demo1);
        System.out.println("\nDifference Example \n---------------");
        System.out.println(demo2);


    }
}
