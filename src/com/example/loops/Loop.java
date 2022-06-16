package com.example.loops;

import java.util.Scanner;

public class Loop {

    public static void loopAssignment(){

        // sum all integers that are a factor of num1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = scan.nextInt();

        while (num1 < 1){
            System.out.print("enter new number: ");
            num1 = scan.nextInt();
        }

        int i = 1;
        int sum = 0;

        while(i <= num1){
            if (num1 % i == 0){
                sum += i;
                System.out.println(i);
            }
            i++;
        }

        System.out.println(" ");
        System.out.println("The sum of all numbers: " + sum);
    }
}
