package com.example.multi_dimensional;

public class Array{

    // passing 2D arrays to methods
    public static void main(String[] args)
    {
//        int num = 0;
//        System.out.println(num);
//        System.out.println(incCount(num));

        int[][] x = {{1,2,3}, {4,5,6}};
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);

        multiplyByTen(x);
        System.out.println();

        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
    }

    public static void multiplyByTen(int[][] arr)
    {
        arr[0][0] = arr[0][0] * 10;
    }

    public static int incCount(int count)
    {
        count++;

        return count;

    }
}
