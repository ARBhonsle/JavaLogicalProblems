package com.company;

import java.util.Scanner;

/**
 * Vending machine computes minimum number of notes to return money value(change)
 */
public class VendingMachine {
    static int moneyValue,noteNumber;
    final static int[] notes={1000, 500, 100, 50, 10, 5, 2, 1};
    static void countNotes()
    {
        for(int i = 0; i < notes.length && moneyValue>0; i++)
        {
            if (moneyValue / notes[i] > 0)
            {
                noteNumber += moneyValue / notes[i];
                moneyValue %= notes[i];
            }
        }
        System.out.println("Number of notes: " + noteNumber);
    }
    public static void main(String[] args){
        System.out.println("Vending Machine");
        Scanner sc=new Scanner(System.in);
        System.out.println("Give money change/value to be returned:");
        int number= sc.nextInt();
        moneyValue = number;
        noteNumber = 0;
        countNotes();
    }
}
