package com.youtube.bank.main;

import java.util.Scanner;

public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter your username : ");
        String username = scanner.next();

        System.out.println("Enter your password : ");
        String password  = scanner.next() ;

        System.out.println("username" + username  + "password " + password);
    }

}
