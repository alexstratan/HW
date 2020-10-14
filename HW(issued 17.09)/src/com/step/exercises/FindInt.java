package com.step.exercises;

import java.util.Scanner;

public class FindInt {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the array length: ");
            int arrayLength=sc.nextInt();
            char[] mainArray= new char[arrayLength];

            System.out.println("Enter the array values (char) :");

            for(int i=0;i<mainArray.length;i++){
                mainArray[i]=sc.next().toLowerCase().charAt(0);
            }

            System.out.println("\nArray values analysis :");


            for(int val:mainArray){
                if(val>=97 && val<=122){
                    switch(val){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        case 'y':
                            System.out.println("Vowel"); break;
                        default: System.out.println("Consonant"); break;
                    }
                }
                else{
                    System.out.println("Not a letter");
                }
            }
        }
    }

