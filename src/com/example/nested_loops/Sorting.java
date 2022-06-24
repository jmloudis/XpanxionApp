package com.example.nested_loops;

import java.util.Arrays;

public class Sorting {

    public static void ascendingOrder()
    {
        int[] a = {13, 19, 2, 45, 32, 17, 8, 10};
        int temp = 0;

        // before sorting
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i; j < a.length -1; j++)
            {

                if (a[i] > a[j + 1])
                {
                    temp = a[i];
                    a[i] = a[j +1];
                    a[j + 1] = temp;
                }

            }
            System.out.print(a[i] + " ");

        }


    }

    public static void descendingOrder()
    {
        int[] a = {13, 19, 2, 45, 32, 17, 8, 10};
        int temp = 0;

        // before sorting
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++)
        {

            for (int j = i; j < a.length -1; j++)
            {

                if (a[i] < a[i + 1])
                {
                    temp = a[i];
                }

            }

        }
    }

}
