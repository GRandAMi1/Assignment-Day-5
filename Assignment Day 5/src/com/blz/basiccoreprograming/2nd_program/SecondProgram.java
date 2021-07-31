package com.blz.basiccoreprograming;

import java.util.Scanner;

public class SecondProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static int year;
    public static void main(String[] args) {
        System.out.print("Enter four digit Year : ");
        year= scanner.nextInt();
        CheckFourDigits();

    }
    public static void CheckFourDigits(){
        if (String.valueOf(year).length() == 4){
            LeapYear();
        }
        else {
            System.out.println("Enter Four Digit Year plz...");
        }
    }
    public static void LeapYear(){
        if (year%4 == 0){
            if (year%100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is Not a Leap Year");
                }
            }
            else {
                System.out.println(year + " is a Leap Year");
            }
        }
        else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
