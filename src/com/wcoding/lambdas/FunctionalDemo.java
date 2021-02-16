package com.wcoding.lambdas;

import java.util.function.Function;

public class FunctionalDemo {
    public static void show(){
        Function<String, Integer> map = str -> str.length();
        int length = map.apply("Sky is the limit");
        System.out.println(length);
    }

    // Compose multiple functions to generate a result
    public static void composeFunctionDemo(){
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        // Declarative programming
        String result = replaceColon
                .andThen(addBraces)
                .apply("Hello:there");

        String result2= addBraces.compose(replaceColon).apply("Hello:there2");

        System.out.println(result);
        System.out.println(result2);
    }
}
