package com.wcoding;

import com.wcoding.collections.CollectionsDemo;
import com.wcoding.collections.Customer;
import com.wcoding.collections.EmailComparator;
import com.wcoding.collections.ListDemo;
import com.wcoding.generics.GenericList;
import com.wcoding.generics.User;
import com.wcoding.generics.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List <Customer> customers = new ArrayList<>();

        customers.add(new Customer("John", "e2"));
        customers.add(new Customer("Doe", "e3"));
        customers.add(new Customer("Alexis", "e1"));

//        Collections.sort(customers);

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);

//        System.out.println(Utils.max(new User(12), new User(40)));
//        Utils.print("integer", 10);
//        GenericList<String> list = new GenericList<>();
//        list.add("a");
//        list.add("b");
//        list.add("f");
//
//        for (String item: list){
//            System.out.println(item);
//        }
    }

}
