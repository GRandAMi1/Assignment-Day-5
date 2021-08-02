package com.blz.basiccoreprograming;

import java.util.Scanner;

public class TenthProgramModular {
    public static final Scanner scanner = new Scanner(System.in);
    public static int userInput;
//    public static int value = totalNumbers();
//    public static int[] dataArr = new int[userInput+1];
//    public static int totalNumbers(){
//        System.out.print("How many numbers you want to Enter : ");
//        userInput = scanner.nextInt();
//        return 0;
//    }
    public static void main(String[] args) {
        System.out.print("How many numbers you want to Enter : ");
        userInput = scanner.nextInt();
        int[] dataArr = new int[userInput+1];
        collectData(dataArr);
    }
    public static void collectData(int[] dataArr){
        for (int i = 1; i <= userInput; i++) {
            System.out.print(i+". Enter number : ");
            dataArr[i]=scanner.nextInt();
        }
        largestNumber(dataArr);
    }
    public static void largestNumber(int[] dataArr){
        int temp = dataArr[1];
        for (int i = 2; i <= userInput; i++) {
            if (dataArr[i]>temp){
                temp=dataArr[i];
            }
        }
        System.out.println("Largest Number is : " + temp);
        smallest(dataArr);
    }
    public static void smallest(int[] dataArr){
        int temp = dataArr[1];
        for (int i = 2; i <= userInput; i++) {
            if (dataArr[i]<temp){
                temp=dataArr[i];
            }
        }
        System.out.println("Smallest Number is : " + temp);
    }
}
