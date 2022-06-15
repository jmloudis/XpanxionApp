package com.example.statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StatementAssignment {

    public static void ifAssignment(){

        Scanner input = new Scanner(System.in);
        double x, y, z;

        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();

        if (x > y && x > z){
            if (y > z){
                System.out.println("Decreasing");
            }
            else{
                System.out.println("Neither");
            }
        }

        else if (x < y && x < z){
            if (y < z){
                System.out.println("increasing");
            }
            else{
                System.out.println("Neither");
            }
        }
        else {
            System.out.println("Neither");
        }
    }

}
