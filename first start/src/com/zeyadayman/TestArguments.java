package com.zeyadayman;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArguments {
    public static void main(String[] args) {
        System.out.println("program is running");
        if(args.length != 0 && args != null){
            System.out.println("number of arguments = " + Arrays.toString(args));
        }
        else
            System.out.println("number of arguments = 0");
    }
}
