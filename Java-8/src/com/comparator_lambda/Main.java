package com.comparator_lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
           list.add(5);
           list.add(78);
           list.add(54);
           list.add(25);
           list.add(64);

        System.out.println("Unsorted List: \n" + list);
        Collections.sort(list);
        System.out.println("Sorted List: \n"+list);

    }
}
