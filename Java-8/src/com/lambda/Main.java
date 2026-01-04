package com.lambda;

public class Main {
    public static void main(String[] args) {

        // General method to call methods in from Interface
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getName());

        // Calling using Interface:-
        // Using Lambda Fxn we can Directly Use Interface Without Implementing it on a class
        // e.g. As we Implemented Employee Interface on the SoftwareEngineering class
        // We Don't even need Software Engineer Class for Using Lambda Function
        Employee employee1 = () -> "Software Engineer";
        Employee sde2 = () -> "SDE 2 Role";
        Employee sde3 = () -> "SDE 3 Role";
        System.out.println(employee1.getName());
        System.out.println(sde2.getName());
        System.out.println(sde3.getName());
        // Calling Default Method from Functional Interface
        sde3.sayName();
        // Calling the Static Method From the Fxnal Interface
        Employee.sayHii();







    }
}
