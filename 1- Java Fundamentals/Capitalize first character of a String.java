package com.zeyadayman.Exercises;

import java.util.Scanner;

public class CapitalizeFirstCharacterOfaString {
    //create a method to capitalize the first word of a string
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(capitalizeFirstLetter(name));
    }
    public static char[] capitalizeFirstLetter(String name){
        char capitalFirstLetter = Character.toUpperCase(name.charAt(0));
        char[] newString = name.toCharArray();
        newString[0] = capitalFirstLetter;
        return newString;
    }
}
