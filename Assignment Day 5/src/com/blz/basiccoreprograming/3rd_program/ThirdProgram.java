package com.blz.basiccoreprograming;

public class ThirdProgram {
    public static int power;
    public static void main(String[] args) {
        power= Integer.parseInt(args[0]);
        PowerOfTwo();
    }
    public static void PowerOfTwo(){
        if (power < 31) {
            for (int i = 0; i <= power; i++) {
                System.out.println((int) Math.pow(2, i));
            }
        }
        else {
            System.out.println("int Overflows Enter value (0-30)");
        }
    }
}
