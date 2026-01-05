package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
        Arrays.stream(arr2).filter(x -> x%2==0).map(n -> n*2).forEach(System.out::println);




        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        num.stream().filter(n -> n % 2 == 0).map(n -> n*2).forEach(System.out :: println);

        // ForEach Takes the Integer One By One from the Array
        num.forEach(x -> System.out.print(x));
        // this will not work: as we can use stream only once
        num.forEach(x -> System.out.print(x));
        Stream<Integer> data = num.stream();
        long count= data.count();
        System.out.println(" Total number of Integers in an Arrays is: \n"+count);

        // below line will give exception bcz we already consumed the stream in above data.count
//        data.forEach(x -> System.out.println(x));
    }
}
