package com.example;

import java.util.Scanner;

class NameRetriever {
    public static String getName() {
        Scanner scn = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scn.nextLine();
        scn.close();
        return name;
    }
}