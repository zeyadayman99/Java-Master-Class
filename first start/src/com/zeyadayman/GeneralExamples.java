package com.zeyadayman;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class GeneralExamples {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    enum Gender{
        MALE,
        FEMALE;
    }
    public  int num = 10;
    public static void main(String[] args) {
        int num = 0;
        System.out.println(num++);
        System.out.println(num);
        Point pointA = new Point(10,10);
        System.out.println(pointA);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, -2);
        System.out.println(Arrays.toString(arr));
        System.out.println("please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        String result = switch(grade){
            case 'A', 'a' -> "Excellent";
            case 'B', 'b' -> "V.good";
            default -> "Unknown";
        };
        System.out.println(result);
        System.out.println(MALE);
        System.out.println(FEMALE);
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
    }
}