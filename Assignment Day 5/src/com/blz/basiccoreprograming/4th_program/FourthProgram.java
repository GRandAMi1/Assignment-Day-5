package com.blz.basiccoreprograming;

import java.util.Scanner;

public class FourthProgram {
    public static final Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static float harmonicValue;
    public static void main(String[] args) {
        System.out.print("Enter value of N to get Nth Harmonic value : ");
        userInput= scanner.nextInt();
        harmonic();
    }
    public static void harmonic(){
        if (userInput == 0){
            System.out.println("Your value should not be Zero");
        }
        else {
            for (float i = 1; i <= userInput; i++) {
                harmonicValue = harmonicValue + (1 / i);
            }
            System.out.println("Harmonic Value is : " + harmonicValue);
        }

    }
}
