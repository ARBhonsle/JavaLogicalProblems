package com.company;

import java.util.Scanner;

/**
 * Perfect Number checked
 */
public class PerfectNumber {
    static void checkPerfectNumber(int number){
        int sum=0,num=number;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
    public static void main(String[] args){
        System.out.println("Perfect Number");
        System.out.println("Give number: ");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        checkPerfectNumber(number);
    }
}
