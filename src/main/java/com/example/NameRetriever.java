package com.example;

import java.util.Scanner;

class NameRetriever {
    public static String getName() {
        Scanner scn = new Scanner(System.in);
        System.out.print("\033[1;34mWhat's your name? \033[0m");
        String name = scn.nextLine();
        scn.close();
        return name;
    }
}