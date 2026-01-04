package com.stream;

import java.util.Arrays;

public class FindingEnvenSum {
    public static void main(String[] args) {

        // Imperative Approach
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The Total of Even Integers in an Array is : "+sum);
        // Stream Approach :-
        int[] arr2 = {1,2,3,4,5};
        int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
        System.out.println("The Total of Even Integers in an Array is : "+sum2);
    }
}
