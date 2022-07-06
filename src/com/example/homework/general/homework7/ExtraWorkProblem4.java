package com.example.homework.general.homework7;

import java.util.Scanner;

public class ExtraWorkProblem4 {

    public static void problem4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scan.nextInt();
        while (n < 0){
            System.out.print("Enter an integer n, greater than 0: ");
            n = scan.nextInt();
        }

        int sum = 0;

        while ( n > 0 || sum > 9){

            if (n == 0)
            {
                //System.out.println(sum);
                /**
                 * 4. sum = 18 -> n = 18 && sum = 0
                 */
                n = sum;
                sum = 0;
            }

            /**
             *  1. 765 % 10 -> sum = 5
             *  2. 5 + 76 % 10 -> 5 + 6 -> sum = 11
             *  3. 11 + 7 % 10 -> 11 + 7 -> sum = 18
             *  4. 0 + 18 % 10 -> sum = 8
             *  5. 8 + 1 % 10 -> 8 + 1 -> sum = 9
             */

            sum += n % 10;

            /**
             *  1. 765 / 10 -> n = 76
             *  2. 76 / 10 -> n = 7
             *  3. 7 /10 -> n = 0
             *  4. 18 / 10 -> n = 1
             *  5. 9 / 10 -> n = 0
             */
            n /= 10;

            /**
             *  5. since n <= 0 && sum <= 9 - loop stops
             */


        }
        System.out.println("Single digit result: " + sum);

    }

}
