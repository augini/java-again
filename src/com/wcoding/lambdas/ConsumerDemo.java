package com.wcoding.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void show(){
        List<Integer> list = List.of(1,2,3);

        // Imperative programming (for, if/else, switch/case)
        // We declare how things need to be done
        for(int item: list){
            System.out.println(item);
        }

        // Declarative programming
        // We declare what needs to be done
        list.forEach(item -> System.out.println(item));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(1);
        numbers.add(234);
        numbers.add(90);
        numbers.add(34);

        numbers.forEach(number -> System.out.println(number));
    }

    //Chaining consumer interface
    public static void ConsumerChain(){
        List<String> letters = List.of("a", "b", "c", "d");

        Consumer<String> print = (letter) -> System.out.println(letter);
        Consumer<String> printUppercase = (letter) -> System.out.println(letter.toUpperCase());

        letters.forEach(print.andThen(printUppercase));
    }

}
