package com.zeyadayman;

import java.util.Scanner;

public class RentalYieldPerYear {
    public static double rentalYieldPerYear(double monthlyRent, double propertyPrice ) {
        double annualRent = monthlyRent* 12;
        return (annualRent / propertyPrice) * 100;
    }
    public static void main(String[] args) {
        double monthlyRent, propertyPrice;
        System.out.println("enter monthly rent: ");
        Scanner sc = new Scanner(System.in);
        monthlyRent = sc.nextDouble();
        System.out.println("enter total property price: ");
        propertyPrice = sc.nextDouble();
        System.out.println("rental yield per year = " + rentalYieldPerYear(monthlyRent, propertyPrice) + "%");
    }
}
