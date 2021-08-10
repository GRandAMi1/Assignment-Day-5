package com.blz.basiccoreprograming;

import java.util.Random;
import java.util.Scanner;

public class FirstProgram {
    public static Scanner scanner = new Scanner(System.in);
    public static int a, totalCoinFlips;
    public static void main(String[] args) {
        System.out.print("The number of times to coin flip : ");
        totalCoinFlips= scanner.nextInt();
        CoinFlips();
    }
    public static void RandomNumber(){
        Random random = new Random();
        a = random.nextInt(2);
    }
    public static void CoinFlips(){
        int H=0;
        int T=0;
        for (int i = 0; i < totalCoinFlips ; i++) {
            RandomNumber();
            if (a == 1) {
                System.out.println("Heads");
                H = H+1;
            }
            else {
                System.out.println("Tails");
                T = T+1;
            }
        }
        float headPercentages = ((float) H*100/ totalCoinFlips);
        float tailPercentages = ((float) T*100/ totalCoinFlips);
        System.out.println("\nTotal Number of Heads : "+ H);
        System.out.println("Total Number of Tails : "+ T);
        System.out.println("\nTotal Number of Heads percentages : "+ headPercentages);
        System.out.println("Total Number of Tails percentages : "+ tailPercentages);
    }
}
