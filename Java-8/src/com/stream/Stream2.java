package com.stream;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(5,6,4,7,3,8,1,2);

        // In Stream1 we Made a Stream of the arr (List) then performed the particular methods/actions
        // But, Now we are gonna going to Use methods/actions without directly creating the stream
        arr.stream()
                .filter(n -> n % 2 == 0)    // Takes only Even
                .sorted()   // Only Even Values are Reached Here
                .map(x -> x*2)  // Those Valued will be Doubled Here
                .forEach(x -> System.out.println(x));   // Values Will be Printed One At a Time

        // Another method to write it is:-
//        arr.stream()
//                .map(x -> x*2)
//                .filter(x -> x%2==0)
//                .forEach(x -> System.out.println(x));


    }
}
