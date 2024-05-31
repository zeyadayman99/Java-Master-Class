package com.zeyadayman.Exercises;

public class SumOfProgramArguments {
    public static void main(String[] args) {
        sumOfProgArgs(args);
    }

    public static void sumOfProgArgs(String[] args){
        int sum = 0;
        String[] nonIntValues = new String[10];
        int index = 0;
        for(String arg : args){
            try{
                sum += Integer.valueOf(arg);
            } catch (NumberFormatException e){
                //System.out.println(arg + " is not an integer");
                nonIntValues[index] = arg;
                index++;
            }
        }
        System.out.print("Total sum of the integers = " + sum);
        for(String arg : nonIntValues){
            if(arg != null)
                System.out.print(", " + arg);
        }
        System.out.print(" are not integers");

    }
}
