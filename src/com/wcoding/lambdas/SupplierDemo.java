package com.wcoding.lambdas;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void show () {
        //should not get any parameter but return a result
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());
    }
}
