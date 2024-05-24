package com.zeyadayman;

public class RemoveStringSpaces {
    public static String removeStringSpaces(String name){
        return name.replaceAll("\\s+","");
    }
    public static void main(String[] args) {
        System.out.println(removeStringSpaces("  a m i gos cod e"));
    }
}
