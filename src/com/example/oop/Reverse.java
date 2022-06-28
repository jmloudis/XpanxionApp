package com.example.oop;

public class Reverse {

    public static boolean isExactReverse(String x, String y)
    {
        boolean isTrue = false;
        char ch;
        String newY= "";


        for (int i = 0; i < y.length(); i++)
        {
            ch = y.charAt(i);
            newY = ch + newY;
        }

        if (newY.equalsIgnoreCase(x))
        {
            isTrue = true;
        }
        return isTrue;



    }
}
