package com.wcoding.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        Customer c1 = new Customer("John", "johndoe@mail.com");
        Customer c2 = new Customer("Mikael", "mikael@mail.com");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // get the item from map
        System.out.println(map.get("johndoe@mail.com"));

        // get the item with default value provided
        System.out.println(map.getOrDefault("efads", new Customer("Unknown", "")));

        // contains
        System.out.println(map.containsKey("augini@inbox.ru"));

        // replace object
        map.replace("mikael@mail.com", new Customer("jordan", "jordan@gmail.com"));
        System.out.println(map);

        // iterate over using key and values

        // using key set
        System.out.println("\nKey set loop\n---------");
        for(String key: map.keySet()){
            System.out.println(key);
        }

        // using value set
        System.out.println("\nEntry set loop\n---------");
        for(Object value: map.entrySet()){
            System.out.println(value);
        }

        // using values
        System.out.println("\nValues loop\n---------");
        for(Object value: map.values()){
            System.out.println(value);
        }

    }
}
