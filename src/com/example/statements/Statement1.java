package com.example.statements;

import java.util.Scanner;

public class Statement1 {

    public static void statementAssignment(){

        // class - Scanner
        // type - double
        // variable - x
        // method - nextDouble()
        //type variableName = value;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();

        System.out.print("Enter y: ");
        double y = input.nextDouble();

        System.out.print("Enter z: ");
        double z = input.nextDouble();
        System.out.println();

        // x < y and x < z and y < z = output "increasing"
        // 13.9 > 12.5 = true
        // && - and
        // || - or
        // 13.9 > 5.2 = true

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
