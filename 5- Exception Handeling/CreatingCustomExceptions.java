package com.zeyadayman.ExceptionHandling;

import java.io.File;

public class CreatingCustomExceptions {
    public static void main(String[] args) {
        iterate(new int[]{1, 2, 3, 4, 5, 6});
        divide(10, 0);
    }
    public static void divide(int num1, int num2){
        if(num2 == 0) throw new UncheckedException("can't divide by 0");
        System.out.println(num1 / num2);
    }
    public static void iterate(int[] num1){
        for(int i = 0; i <= num1.length; i++){
            if(i >= num1.length) try {
                throw new CheckedException("index out of bound");
            } catch (CheckedException e) {
                e.printStackTrace();
            }
            System.out.println(num1[i]);
        }
    }
}
