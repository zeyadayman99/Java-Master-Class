package com.zeyadayman.Exercises;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MyDateOfBirthUsingLocalDate {
    public static void main(String[] args) {
        LocalDate myBirthDate = LocalDate.of(1999,
                Month.SEPTEMBER,
                12);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        //print my birth date using LocalDate Method
        System.out.println(myBirthDate.format(dateTimeFormatter));
        //add 100 days to my birth date
        System.out.println(myBirthDate.plusDays(100));
    }
}
