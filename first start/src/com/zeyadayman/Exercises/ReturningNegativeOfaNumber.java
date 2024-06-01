package com.zeyadayman.Exercises;

import java.util.Scanner;

public class ReturningNegativeOfaNumber {
    //writing a method that returns the Negative of the argument Passed
    public static void main(String[] args) {
        System.out.println("Enter the NUmber You want to get the Negative of: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("negative of " + number +  " is " + negative(number));
    }
    public static int negative(int number){
        return number - (2 * number);
    }
}
