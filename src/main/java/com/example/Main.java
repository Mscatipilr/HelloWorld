package com.example;

public class Main {
    public static void main(String[] args) {
        HelloWorld.greet();
        System.out.println("Hello, java!\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String name = NameRetriever.getName();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\033[1;34m\nHello, " + name + ".\n\033[0m");
    }

}