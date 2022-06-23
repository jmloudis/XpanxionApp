package com.example.loops;

import java.util.Scanner;

public class LoopAssignments {

    public static void main(String[] args) {
        problem1();
        //problem2();
        //problem4();

    }

    public static void problem1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an number: ");
        // x = 15
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {

            if (i % 3 == 0) {

                if (i % 2 != 0) {
                    System.out.println(i + " is a multiple of 3");
                }
            }
        }
    }

    public static void problem2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int i = input.nextInt(); // 20

        int sum = 0;
        int num = 1;

        while (num <= i){
            // checking if even
            if (num % 2 == 0){
                sum = sum + num;
//                System.out.println(num);
            }
            num++;
        }

        System.out.println();
        System.out.println("The sum of all even numbers between 1 and " + i + " is: " + sum);


    }

    public static void problem4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        n = Math.abs(n); // 78

        while ( n != 0 ){

            /**
             * 1. sum = sum + 78 % 10 -> 8
             * 2. sum = sum + 7 % 10 -> sum + 7 -> 15
             */
            sum += n % 10;

            /**
             * 1. n = 78 / 10 -> 7
             * 2. n = 7 / 10 -> 0
             */
            n = n / 10;
        }
        System.out.println(sum);



    }

}
