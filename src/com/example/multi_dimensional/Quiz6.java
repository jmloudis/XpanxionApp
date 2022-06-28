package com.example.multi_dimensional;

public class Quiz6 {

    public static void main(String[] args)
    {
        int[][] x = {
                {4,9,5,3},
                {3,10,1,6},
                {13,1,2,4}
        };
        System.out.println(isRowMagic(x));
    }

    public static boolean isRowMagic(int[][] arr)
    {
        boolean isEqual = true;

        int[] sum = new int[arr.length]; // 0, 1, 2 sum[0] = 20, sum[1] = 20

        for (int row = 0; row < arr.length; row++)
        {

            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + " ");
                sum[row] += arr[row][col];
            }

            System.out.println();
            System.out.println(sum[row]);

            if (sum[row] != sum[0]) //sum[0] = sum[0] , sum[1] = sum[0] , sum[2] = sum[0]
            {
                isEqual = false;
            }


        }

        return isEqual;
    }

}
