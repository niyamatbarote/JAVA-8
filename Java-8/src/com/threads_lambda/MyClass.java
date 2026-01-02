package com.threads_lambda;

public class MyClass implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<=10; i++) {
            System.out.println("Hello");
        }
        for (int i = 0 ; i<= 10; i++) {
            System.out.println(" Bolo");
        }
    }
}
