package com.example.arrays;

import java.util.Scanner;

public class ArrayAssignment {

    public static void quiz4(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 1 and 20: ");
        int n = input.nextInt();
        int result = 1;

        while (n < 1 || n > 20){
            System.out.print("Please enter a valid number between 1 and 20: ");
            n = input.nextInt();
        }
        System.out.println();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++ ){

            /**
             * Without using Math.pow() method
             */
            arr[i] = result;
            System.out.print(arr[i] + " ");
            result *= 2;

            /**
             * Using Math.pow() method
             */
            //arr[i] = (int) Math.pow(2, i);
            //System.out.print(arr[i] + " ");
        }


    }

}
