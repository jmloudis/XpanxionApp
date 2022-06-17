package com.example.loops;

import java.util.Scanner;

public class LoopAssignments {

    public static void main(String[] args) {
        problem1();
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

    }

}
