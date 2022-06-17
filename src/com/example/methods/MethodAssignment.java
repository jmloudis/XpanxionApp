package com.example.methods;

import java.util.Scanner;

public class MethodAssignment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scan.nextInt();
        System.out.print("Enter B: ");
        int b = scan.nextInt();
        System.out.print("Enter C: ");
        int c = scan.nextInt();
        System.out.print("Enter D: ");
        int d = scan.nextInt();
        System.out.println();

        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + sum(a,b,c,d));
        System.out.println(a + " * " + b + " * " + d + " = " + multiply(a,b,d));
        System.out.println(b + " / " + d + " = " + divide(b,d));
        System.out.println(b + " - " + c + " = " + subtract(b,c));

    }
    public static int sum(int a, int b, int c, int d)
    {
        int s = a + b + c + d;
        return s;
    }

    public static int multiply(int a, int b, int c){
        int m = a * b * c;
        return m;
    }

    public static double divide(int a, int b){
        double d = (double) a / b;
        return d;
    }

    public static int subtract(int a, int b){
        int sub = a - b;
        return sub;
    }
}
