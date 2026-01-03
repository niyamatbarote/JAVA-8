package com.comparator_lambda;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
//        return a - b;   // To Return the list in ASCENDING Order
        return b-a;
    }
}
