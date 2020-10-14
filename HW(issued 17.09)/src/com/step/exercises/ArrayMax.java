package com.step.exercises;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength=sc.nextInt();
        int[] mainArray= new int[arrayLength];
        int arrayMaxValue=0;

        System.out.println("Enter the array values:");

        for(int i=0;i<mainArray.length;i++){
            mainArray[i]=sc.nextInt();
            if(i==0){arrayMaxValue=mainArray[i];};
            if(arrayMaxValue<mainArray[i])arrayMaxValue=mainArray[i];
        }

        System.out.println("\nMax array value: " + arrayMaxValue);

    }
}
