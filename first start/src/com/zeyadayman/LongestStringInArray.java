package com.zeyadayman;

import java.util.Arrays;

public class LongestStringInArray {

    public static String longestStringInArray(String[] strings){
        String longestString = "";
        int maxLength = 0;
        if(strings.length == 0 || strings == null)
            return "";
        for(String str : strings){
            if(str.length() != 0 && str.length() > maxLength){
                longestString = str;
                maxLength = str.length();
            } else if (str.length() != 0 && str.length() == maxLength) {
                longestString += ", " + str;
            }
        }
        return longestString;
    }
    public static void main(String[] args) {
        String[] strings = {"ahmed", "mohamed", "ahmed khaled", "zeyad aymaan", "khaled", "ramy"};
        System.out.print("longest string/s: ");
        String str = longestStringInArray(strings);
        System.out.println(str);
    }
}
