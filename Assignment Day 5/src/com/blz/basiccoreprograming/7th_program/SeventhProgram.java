package com.blz.basiccoreprograming;

import java.util.Scanner;

public class SeventhProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static int firstNumber,secondNumber;
    public static void main(String[] args) {
        System.out.print("Enter your first Number : ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter your second Number : ");
        secondNumber = scanner.nextInt();
        Swap();
    }
    public static void Swap(){
        int temp=0;
        System.out.println("\nBefore Swapping");
        System.out.println("your first number : " + firstNumber);
        System.out.println("your second number : " + secondNumber);
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("\nAfter Swapping");
        System.out.println("your first number : " + firstNumber);
        System.out.println("your second number : " + secondNumber);
    }
}
