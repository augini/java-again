package com.wcoding.lambdas;

public class LambdasDemo {
    // using lambda expressions

    public static void show(){
        greet(message -> System.out.println(message));
        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer){
        printer.print("Hello string! ");
    }
}
