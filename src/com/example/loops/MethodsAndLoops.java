package com.example.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodsAndLoops {

    public static void forLoopPrime(){
        Scanner scan = new Scanner(System.in);
        int n ;

        do{
            System.out.print("Enter an int greater than 1: ");
            n = scan.nextInt();

        } while (n <= 1);


        boolean result = isPrimeNumber(n);
        System.out.println(result);
    }

    public static void forLoopPower(){

        Scanner scan = new Scanner(System.in);
        int n ;
        int m ;
        do {
            System.out.print("Enter a positive number for the power: ");
            n = scan.nextInt();
            System.out.print("Enter a positive number to be multiplied: ");
            m = scan.nextInt();


        }while (n <= 0);

        int result = twoToThePower(n, m);

        System.out.println(m + " to the power " + n + " is " + result);
    }

    public static int twoToThePower(int n, int m){
        int count = 1;
        int result = 1;
        while (count <= n){
            result *= m;
            count++;
        }
        return result;
    }

    public static boolean isPrimeNumber(int n){

        ArrayList<Integer> arr = new ArrayList<>();
        // find factors of n
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                arr.add(i);

            }
        }
        System.out.println();
        System.out.println("Factors of n are: " + arr);

        // if more than 2 factors != a prime number
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
