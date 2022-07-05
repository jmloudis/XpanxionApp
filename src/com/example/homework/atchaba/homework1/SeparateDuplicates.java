package com.example.homework.atchaba.homework1;

import java.beans.Transient;

public class SeparateDuplicates {


    public static String seperateDuplicatesChars(String str)
    {
        String s = "";

        char c;

        for (int i = 1; i < str.length(); i++)
        {
            c = str.charAt(i -1);
            s = s + c;
            if (str.charAt(i-1) == str.charAt(i))
            {
                s = s + '-';
            }
        }

        s = s + str.charAt(str.length() - 1);

        return s;
    }



    public static void main(String[] args)
    {

      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));

    }


}
