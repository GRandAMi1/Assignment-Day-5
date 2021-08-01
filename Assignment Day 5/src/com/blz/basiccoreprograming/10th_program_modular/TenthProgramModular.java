package com.blz.basiccoreprograming;

import java.util.Scanner;

public class TenthProgramModular {
    public static final Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static int value = totalNumbers();
    public static int[] dataArr = new int[userInput+1];
    public static int totalNumbers(){
        System.out.print("How many numbers you want to Enter : ");
        userInput = scanner.nextInt();
        return 0;
    }
    public static void main(String[] args) {
        collectData();
    }
    public static void collectData(){
        for (int i = 1; i <= userInput; i++) {
            System.out.print(i+". Enter number : ");
            dataArr[i]=scanner.nextInt();
        }
        largestNumber();
    }
    public static void largestNumber(){
        int temp = dataArr[1];
        for (int i = 2; i <= userInput; i++) {
            if (dataArr[i]>temp){
                temp=dataArr[i];
            }
        }
        System.out.println("Largest Number is : " + temp);
        smallest();
    }
    public static void smallest(){
        int temp = dataArr[1];
        for (int i = 2; i <= userInput; i++) {
            if (dataArr[i]<temp){
                temp=dataArr[i];
            }
        }
        System.out.println("Smallest Number is : " + temp);
    }
}
