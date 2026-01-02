package com.lambda;

@FunctionalInterface
public interface Employee {

    public String getName();

    default void sayName() {
        System.out.println("My Name is Niyamat ");
    }

    public static void sayHii() {
        System.out.println(" Hii Guyssss ");
    }

}
