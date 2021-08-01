package com.blz.basiccoreprograming;

import java.util.Scanner;

public class TenthProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static int firstNumber,secondNumber,thirdNumber;
    public static void main(String[] args) {
        System.out.print("Enter first number : ");
        firstNumber=scanner.nextInt();
        System.out.print("Enter second number : ");
        secondNumber=scanner.nextInt();
        System.out.print("Enter third number : ");
        thirdNumber=scanner.nextInt();
        Largest();
    }
    public static void Largest(){
        if (firstNumber>secondNumber && firstNumber>thirdNumber) {
            System.out.println(firstNumber + " is Largest number");
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber){
                System.out.println(secondNumber + " is Largest number");
        }
        else {
            System.out.println(thirdNumber + " is Largest number");
        }
    }
}
