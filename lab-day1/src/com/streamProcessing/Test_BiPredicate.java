package com.streamProcessing;

import java.util.function.BiPredicate;

public class Test_BiPredicate {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> compareBiPredicateValue = (a, b) -> a >= b;
        System.out.println(compareBiPredicateValue.test(5, 5));
        System.out.println(compareBiPredicateValue.test(10, 100));



    }
}
