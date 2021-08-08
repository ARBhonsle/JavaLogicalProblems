package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class CouponNumber {
    static void couponNumber(int number){
        HashSet<Double> coupon=new HashSet<Double>();
        double couponNum,totalNum=0;
        for (int i=0;i<number;){
            couponNum=Math.random()*1000;
            totalNum++;
            System.out.println(couponNum);
            if(!coupon.contains(couponNum)) {
                coupon.add(couponNum);
                i++;
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
