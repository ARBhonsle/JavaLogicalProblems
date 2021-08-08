package com.company;

import java.util.Scanner;

public class ReverseNumber {
    static int reverseNumber(int number){
        int reverseNum=0;
        while(number>0){
            reverseNum=reverseNum*10+number%10;
            number/=10;
        }
        return reverseNum;
    }
    public static void main(String[] args){
        System.out.println("Reverse Number");
        System.out.println("Give number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Reverse of "+number+" is "+reverseNumber(number));
    }
}
