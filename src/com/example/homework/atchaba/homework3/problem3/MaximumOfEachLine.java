package com.example.homework.atchaba.homework3.problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumOfEachLine
{


    public static void main(String[] args)
    {
        File f = new File("src/com/example/homework/atchaba/homework3/problem3/data.txt");

        try(Scanner scanFile = new Scanner(f))
        {
            while (scanFile.hasNext())
            {
                String s1 = scanFile.next();
                String s2 = scanFile.next();
                String s3 = scanFile.nextLine();
                String[] arr = s3.split(",");

                int max = 0;
                for (int i = 0; i < arr.length; i++)
                {
                    //System.out.print(arr[i] + " ");
                    int n = Integer.parseInt(arr[i].trim());
                    //System.out.print(n + " ");

                    if (n > max)
                    {
                        max = n;
                    }

                }
                System.out.println(s1 + " " + s2 + "\t" + "Max: " + max);

            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
