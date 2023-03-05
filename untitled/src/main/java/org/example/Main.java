package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Cleaning Service");
        System.out.println();
        System.out.println("1-Login\n2-Cancel\n");
        if (args.length==0) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter your username");
                String username = scanner.nextLine();
                System.out.println("Enter your password");
                String password = scanner.nextLine();
            } else if (input == 2) {
                System.out.println("Thank you for using our service");
                exit(0);
            }
        }
        else{
            Scanner x = new Scanner(args[0]);
            int input = x.nextInt();
            if (input == 1) {
                System.out.println("Enter your username");
                String username = x.next();
                System.out.println("Enter your password");
                String password = x.next();
            } else if (input == 2) {
                System.out.println("Thank you for using our service");
                exit(0);
            }
        }
    }
}