package com.company;

import java.util.Scanner;

/**
 * UC6-stopWatch
 */

public class StopWatch {
    static void task(int number){
        for(int i=0;i<number;i++){
            for(int j=i;j<number;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("StopWatch");
        System.out.println("Give number:");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        long begin=System.nanoTime();
        task(number);
        long end=System.nanoTime();
        long timeElapsed=end-begin;
        System.out.println("Time taken to print above: (time elapsed)= "+timeElapsed+" nano seconds");
    }
}
