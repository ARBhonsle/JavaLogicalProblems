package com.company;

import java.util.Scanner;

/**
 * Prime number checked
 */
public class PrimeNumber {
    static void checkPrime(int number){
        int count=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }
    public static void main(String[] args){
        System.out.println("Prime Number");
        System.out.println("Give number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        checkPrime(number);
    }
}
