package com.company;

import java.util.Scanner;

/**
 * Square Root calculated using Newton's method
 */
public class SquareRoot {
    final static double epsilon=1e-15;
    static void newtonsMethod(double number){
        double t=number;
        while(Math.abs(t-number/t)>epsilon*t){
            t= (t+number/t)/2;
        }
        System.out.println("Root :"+t);
    }
    public static void main(String[] args){
        System.out.println("Square Root using Newton's method");
        System.out.println("Give number");
        Scanner sc =new Scanner(System.in);
        double value=sc.nextDouble();
        if(value>=0) {
            newtonsMethod(value);
        }else {
            System.out.println("Incorrect Input");
        }
    }
}
