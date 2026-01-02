package com.java8;

interface B{
    static void sayHello() {
        System.out.println("Hello Broo");
    }

}


public class Static_methods implements B{
    private static void sayHello() {
        System.out.println("Hello I'm from class Static_Methods");
    }

}
