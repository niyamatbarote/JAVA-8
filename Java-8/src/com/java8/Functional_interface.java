package com.java8;

// Functional interface has :-
// only 1 abstract method, many default and many static method ,

// Fxnal interface Annotation is used for to make the compiler know that this is the functional interface and
// it should not be altered by other programmer, and should not needed to be general interface.

// general interface can have many abstract methods

import java.sql.SQLOutput;

@FunctionalInterface
public interface Functional_interface {
    public void sayHello(); //Abstract method (only 1 needed else it's not Functional Interface)

    // Note* Default & Static Method Do Have Body
    default void sayBye() {
    }

    default void saySome() {
    }

    public static void say() {
    }
}

// Normal Interface
interface General{
    public void goodNight();
    public void goodBye();
    public void  sayGood();
    public void sayHi();
    default void noBad() {

    }
}

// Checking if The Interface is Funcional OR NOT Through Inheritance :-
interface Parent{
    public void parent();
    default void parent1(){}
    public static void parent2(){}
}
@FunctionalInterface
interface Child extends Parent {
    // This method overrides method in Parent Interface
    public void parent();   // Thus same method can be defined
}

// Understanding Static Methods :-
interface A{
    public static void sayMyName() {    // Default method is public method No nedd to write public
        System.out.println("My Name is Niyamat");
    }
    default void sayGn() {
        System.out.println(" Good Night ");
    }
}
class Interface_FUnctional implements A {
    public static void main(String[] args) {
        Interface_FUnctional obj = new Interface_FUnctional();
//        Interface_FUnctional.sayMyName: // This will not work
        // Calling the Static method
        A.sayMyName();
        // calling default Methods
        obj.sayGn();
        B.sayHello();
        Functional_interface fxn = () -> System.out.println("This is My Functional Interface");
        fxn.sayHello();
    }
}



