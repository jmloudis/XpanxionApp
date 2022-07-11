package com.example.homework.atchaba.homework3.problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaximumOfEachLine
{

    public static void main(String[] args)
    {
        File f1 = new File("src/com/example/homework/atchaba/homework3/problem3/data.txt");

        //maximumOfEachLine();
        maxOfEachLineAndWrite(f1);
    }

    public static void maximumOfEachLine()
    {
        File f1 = new File("src/com/example/homework/atchaba/homework3/problem3/data.txt");

        try
        {
            Scanner scan = new Scanner(f1);

            while(scan.hasNext())
            {
                String s1 = scan.nextLine();
                String s2 = s1.replace(",", " ");
                String[] s3 = s2.split(" ");

                //[Samantha Johns 43 32 99 79 85]

                int max = Integer.parseInt(s3[2]); // 99
                for (int i = 3; i < s3.length; i++) // 79
                {
                    int num = Integer.parseInt(s3[i]); // "79" -> 79

                    if (num > max) // 79 > 99
                    {
                        max = num; // max = 99;
                    }
                }

                //System.out.println(s3[0] + " " + s3[1] + "\t" +  " Max: " + max);
                System.out.format("%s %s \t Max:%d%n", s3[0],s3[1],max);



            }



        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

    }

    public static void maximumOfEachLine2()
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

                    int n = Integer.parseInt(arr[i].trim());

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


    public static void maxOfEachLineAndWrite(File f)
    {

        File outputFile = new File("src/com/example/homework/atchaba/homework3/problem3/output.txt");

        try
        {
            FileWriter writer = new FileWriter(outputFile, false);
            Scanner scan = new Scanner(f);

            while(scan.hasNext())
            {

                String s1 = scan.nextLine();
                String s2 = s1.replace(",", " ");
                String[] arr = s2.split(" ");

                int max = 0;
                for (int i = 2; i < arr.length; i++)
                {
                    int num = Integer.parseInt(arr[i]);

                    if (num > max)
                    {
                        max = num;
                    }
                }

                writer.write(arr[0] + " " + arr[1] + "\t" + "Max: " + max + "\n");
                writer.flush();


                System.out.println(arr[0] + " " + arr[1] + "\t" + "Max: " + max);

            }
            writer.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
