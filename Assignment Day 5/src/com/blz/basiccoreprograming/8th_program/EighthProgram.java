package com.blz.basiccoreprograming;

import java.util.Scanner;

public class EighthProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your Number to check Even or Odd : ");
        int userInput = scanner.nextInt();
        if (userInput % 2 == 0) {
            System.out.println(userInput + " is Even Number");
        } else {
            System.out.println(userInput + " is Odd Number");
        }
    }
}
