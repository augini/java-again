package com.wcoding.lambdas;

public class LambdasDemo {
    public static void show(){
        // lambda expression
        greet(message -> System.out.println(message));

        // method reference
        // we can use it when the class/interface has only one method to implement
        greet(System.out::println);
    }

    public static void greet(Printer printer){
        printer.print("Hello string! ");
    }
}
