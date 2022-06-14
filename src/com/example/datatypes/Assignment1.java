package com.example.datatypes;

import java.util.Scanner;

public class Assignment1 {

    public static void calculateTime(){

        Scanner input = new Scanner(System.in);
        System.out.print("enter number of weeks");

        int week = input.nextInt();

        int day = week * 7;
        System.out.println(day + "days");
        int hours = day * 24;
        System.out.println(hours + "hours");
        int minutes = hours * 60;
        System.out.println(minutes + "minutes");
        int seconds = minutes * 60;
        System.out.println(seconds + "seconds");



    }

}
