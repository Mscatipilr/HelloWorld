package com.example;

public class HelloWorld {
    public static void greet() {
        System.out.println("\n\033[1;34mHello, world!\033[0m\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}