package com.company;

import java.util.Scanner;

/**
 * Finding number after Swapping binary nibbles
 */
public class SwapBinaryNibbles {
    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }
    static void print(int[] binary,int i){
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]+" ");
        }
        System.out.println();
    }
    static void swapBinaryNibbles(int number){
        int[] binaryNumber=new int[35];
        int i=0,num=number;
        while (number>0){
            binaryNumber[i++]=number%2;
            number/=2;
        }
        System.out.println("Before swapping nibbles");
        print(binaryNumber,i);
        System.out.println("After swap "+swapNibbles(num));
    }
    public static void main(String[] args) {
        System.out.println("Convert number to Binary");
        System.out.println("Give integer input :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        swapBinaryNibbles(number);
    }
}
