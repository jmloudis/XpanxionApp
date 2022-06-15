package com.example;

import com.example.statements.ConditionalStatement;

//class
public class Main {

    //method
    public static void main(String[] args){

        // call statementAssignment() method from statements package
//        ConditionalStatement.statementAssignment();


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

    public static int divide(int a, int b){
        int d = a / b;
        return d;
    }

    public static int subtract(int a, int b){
        int sub = a - b;
        return sub;
    }

}
