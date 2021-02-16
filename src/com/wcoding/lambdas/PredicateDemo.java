package com.wcoding.lambdas;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void show(){
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println(isLongerThan5.test("hell"));
    }

    // combining predicates sample
    public static void combiningPredicates(){
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        System.out.println(hasLeftBrace.and(hasRightBrace).test("{key=value}"));
    }
}
