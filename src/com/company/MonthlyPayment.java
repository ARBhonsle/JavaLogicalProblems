package com.company;

import java.util.Scanner;

/**
 * Calculates monthly payment for given principle,years and interest rate
 */
public class MonthlyPayment {
    static double paymentPerMonth(double principle, int years, double rate){
        return (principle*rate)/(1-Math.pow(1+rate,-years));
    }
    public static void main(String[] args){
        System.out.println("Monthly Payment");
        System.out.println("Give principle amount, years, interest rate");
        Scanner sc=new Scanner(System.in);
        double principle=sc.nextDouble();
        int years= sc.nextInt();
        double rate= sc.nextDouble();
        System.out.println("Monthly Payment is :"+paymentPerMonth(principle,years*12,rate/(1200)));
    }
}
