package com.zeyadayman.Exercises;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAgeOfAnyGivenDate {
    public static void main(String[] args) {
        int day, month, year;
        System.out.println("enter your birth day: ");
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();
        System.out.println("enter you birth month(in numbers)");
        month = scanner.nextInt();
        System.out.println("enter you birth year");
        year = scanner.nextInt();
        String monthInString = switch (month){
            case 1 -> String.valueOf(Month.JANUARY);
            case 2 -> String.valueOf(Month.FEBRUARY);
            case 3 -> String.valueOf(Month.MARCH);
            case 4 -> String.valueOf(Month.APRIL);
            case 5 -> String.valueOf(Month.MAY);
            case 6 -> String.valueOf(Month.JUNE);
            case 7 -> String.valueOf(Month.JULY);
            case 8 -> String.valueOf(Month.AUGUST);
            case 9 -> String.valueOf(Month.SEPTEMBER);
            case 10 -> String.valueOf(Month.OCTOBER);
            case 11 -> String.valueOf(Month.NOVEMBER);
            case 12 -> String.valueOf(Month.DECEMBER);
            default -> String.valueOf(Month.valueOf("wrong entry"));
        };
        LocalDate localDate = LocalDate.of(year, Month.valueOf(monthInString), day);
        age(localDate);
    }

    public static void age(LocalDate localDate){
        LocalDate localDate1 = LocalDate.now();
        Period period = Period.between(localDate1, localDate);
        System.out.println("you have " + period.getYears() + " years, "
                + period.getMonths() + " months and "
                + period.getDays() + " days");
    }
}
