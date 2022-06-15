package com.example.statements;

import java.util.Scanner;

public class ConditionalStatement {

    public static void statementAssignment(){

        /**
         * This statementAssignment() method takes three inputs from the user using the Scanner object
         * x, y, and z are double types that are assigned values from the user input.
         *
         * There are if else statements determining whether the numbers are increasing, decreasing or neither.
         * the order is x -> y -> z
         *
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();

        System.out.print("Enter y: ");
        double y = input.nextDouble();

        System.out.print("Enter z: ");
        double z = input.nextDouble();
        System.out.println();

        // increasing if statement
        if (z > y && z > x){

            if (y > x){
                System.out.println("increasing");
            }

            else{
                System.out.println("neither");
            }

        }

        // decreasing else if statement
        else if(x > y && x > z){

            if (y > z){
                System.out.println("decreasing");
            }

            else{
                System.out.println("neither");
            }

        }

        // if increasing statement and decreasing statement return false
        // print this line
        else{
            System.out.println("neither");
        }

    }

}
