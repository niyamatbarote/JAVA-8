package com.threads_lambda;

public class Main {
    public static void main(String[] args) {

        // Using Runnable interface Through "MyClass" class
        MyClass mc = new MyClass();
        Thread thr = new Thread(mc);
        thr.run();

        // Using Runnable Interface Without "MyClass" class
        // Note* Runnable interface is a "Fxnal Interface"
        Runnable rnbl = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hiiiiiiii");
            }
        };
        Thread thread = new Thread(rnbl);
        thread.run();

    }
}
