package com.blz.basiccoreprograming;

import java.util.Scanner;

public class SixthProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static int dividend,divisor;
    public static void main(String[] args) {
        System.out.print("Enter your dividend : ");
        dividend = scanner.nextInt();
        System.out.print("Enter your divisor : ");
        divisor = scanner.nextInt();
        Division();
    }
    public static void Division(){
        System.out.println("Quotient is " + dividend/divisor);
        System.out.println("Remainder is " + dividend%divisor);
    }
}
