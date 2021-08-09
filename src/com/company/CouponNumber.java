package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class CouponNumber {
    static void couponNumber(int number){
        int[] coupon=new int[number];
        int i=0;
        int couponNum,totalNum=0;
        while(i<number){
            int count=0;
            couponNum=(int)(Math.random()*100000);
            totalNum++;
            for(int index=0;index<i;index++) {
                if(coupon[index]!=(couponNum)){
                    count++;
                }
            }
            if(count==i){
                coupon[i] = couponNum;
                i++;
                System.out.println(couponNum);
            }
        }
        System.out.println("Total times random numbers generated:"+totalNum);
    }

    public static void main(String[] args){
        System.out.println("Coupon Numbers");
        System.out.println("Give number");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        couponNumber(number);
    }
}
