package com.example.homework.atchaba.homework1;

import static com.example.homework.atchaba.homework1.Reverse.isExactReverse;
import static com.example.homework.atchaba.homework1.Reverse.isExactReverseSol2;

public class ReverseTest {

    public static void main(String[] args)
    {

      System.out.println(isExactReverse("ba", "a"));
      System.out.println(isExactReverseSol2("desserts", "stressed"));
      System.out.println(isExactReverse("apple", "apple"));
      System.out.println(isExactReverse("regal", "lager"));
      System.out.println(isExactReverse("war", "raw"));
      System.out.println(isExactReverse("pal", "slap"));




    }
}
