package com.java8;

// Functional interface has :-
// only 1 abstract method, only 1 default
// and only one static method ,

// Fxnal interface Annotation is used for to make the compiler know that this is the functional interface and
// it should not be altered by other programmer, and should not needed to be general interface.

// general interface can have many abstract methods

@FunctionalInterface
public interface Functional_interface {
    public void sayHello(); //Abstract method (only 1 needed else it's not Functional Interface)

    default void sayBye() {
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


