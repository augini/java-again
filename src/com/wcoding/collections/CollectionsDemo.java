package com.wcoding.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collection<String> testing = new ArrayList<>();

        Collections.addAll(collection, "a", "b", "editing letters");
        Collections.addAll(testing, "a", "b", "editing letters");

        String[] collectionArray = collection.toArray(new String[0]);
        System.out.println(collectionArray[1]);
//        for(String item: collection){
//            System.out.println(item);
//        }

        System.out.println(collection.equals(testing));
    }
}

