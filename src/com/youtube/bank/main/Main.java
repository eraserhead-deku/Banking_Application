package com.youtube.bank.main;

import com.youtube.bank.entity.User;
import com.youtube.bank.service.UserService;

import java.util.Scanner;

public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

         UserService userService = new UserService() ;

        System.out.println("Please enter your username : ");
        String username = scanner.next();

        System.out.println("Enter your password : ");
        String password  = scanner.next() ;

        User user = userService.login(username , password);
        if(user != null){
            System.out.println("you are logged in successfully");
        }else{
            System.out.println("login failed");
        }
    }

}
