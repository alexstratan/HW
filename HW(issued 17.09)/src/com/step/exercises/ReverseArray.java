package com.step.exercises;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength=sc.nextInt();
        int[] mainArray= new int[arrayLength];

        System.out.println("Enter the array values:");

        for(int i=0;i<mainArray.length;i++){
            mainArray[i]=sc.nextInt();
        }

        System.out.println("\nArray values reversed:");

        for(int i=0;i<mainArray.length;i++){
            System.out.println(mainArray[mainArray.length-i-1]);
        }

    }
}
