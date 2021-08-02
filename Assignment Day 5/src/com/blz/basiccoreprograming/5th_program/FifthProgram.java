package com.blz.basiccoreprograming;

import java.util.Scanner;

public class FifthProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static String resultFactors="";
    public static void main(String[] args) {
        System.out.print("Enter your number to find it's factors : ");
        userInput= scanner.nextInt();
        Factors();
    }
    public static void Factors() {
        int temp = userInput;
        for (int i = 2; i < userInput; i++) {
            while (temp % i == 0) {
                resultFactors = resultFactors + i + "|";
                temp = temp / i;
            }
        }
        if (temp == userInput) {
            System.out.println(userInput + " This is a Prime Number");
        } else {
            System.out.println(resultFactors);

        }
    }
}
