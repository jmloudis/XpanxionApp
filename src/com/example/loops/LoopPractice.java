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

    public static void doWhileLoops(){

        int count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count <= 10);
        System.out.println(" ");
        System.out.println(count);
        System.out.println("Do - While Loop is over");
    }

    public static void doWhileLoopScores(){
        Scanner scan = new Scanner(System.in);
        int n;
        int sum = 0;
        int count = 0;
        double avg;

        do{
            System.out.print("Enter a score: ");
            n = scan.nextInt();
            if (n >= 0){
                sum += n;
                count++;
            }
        } while (n >= 0);

        avg = (double) sum / count;
        System.out.println();
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Number of scores: " + count);
        System.out.println("Average: " + avg);
    }


}
