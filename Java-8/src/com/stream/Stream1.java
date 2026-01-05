package com.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

    // This Apllies stream on nums
        Stream<Integer> data = nums.stream();
//        Stream<Integer> sorted = data.sorted();

        // Methods Used In Stream
        // Map Used to Perform Actions on the stream (Like we doubled the Numbers)
        Stream<Integer> doubled = data.map(n -> n * 2);
        doubled.forEach(n -> System.out.println(n));

        data.filter(x -> x % 2 == 0);
        System.out.println();


    }
}
