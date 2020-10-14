package com.step.exercises;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength=sc.nextInt();
        int[] mainArray= new int[arrayLength];
        int sumArray=0;
        System.out.println("Enter the array values:");
        for(int i=0;i<mainArray.length;i++){
            mainArray[i]=sc.nextInt();
            sumArray+=mainArray[i];
        }
        System.out.println("\nThe sum of the array values: "+sumArray);

    }
}
