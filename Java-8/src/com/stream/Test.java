package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Niyamat", "Mohammad", "Pran", "Prady");
        Stream<String> myStream = list.stream();
        String[] arr = {"Niyamat", "Mohammad", "Pran", "Prady"};


    }
}
