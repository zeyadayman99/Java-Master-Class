package com.zeyadayman;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 10;
        Float data = 12.34f;
        Double input = 12.876;
        String num2 = "12345";

        System.out.println(num.toString());
        System.out.println(Float.valueOf(data));
        System.out.println(Integer.parseInt(num2));
    }
}
