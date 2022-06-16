package com.example.loops;

import java.util.Scanner;

public class LoopPractice {

    public static void loopExample(){

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
            }
            i++;
        }

        System.out.println("The sum of all numbers: " + sum);

    }

    public static void sumUsingLoops(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scan.nextInt();
        int sum = 0;
        int count = num1;

        while (count <= num2){
            sum += count;
            count++;
        }
        System.out.println("The sum is: " + sum);
    }

}
