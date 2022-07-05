package com.example.practice_tests;

public class Quiz3Test {

    public static void main(String[] args) {
        Quiz3 pq1 = new Quiz3();
        Quiz3 pq2 = new Quiz3(5,5, "John");

        System.out.println(pq1.toString());
        System.out.println(pq2.toString());
        System.out.println(pq1.equalTo(pq2) + "\n");

        pq1.setX(5);
        pq1.setY(5);
        pq1.setName("John");

        System.out.println(pq1.toString());
        System.out.println(pq2.toString());
        System.out.println(pq1.equalTo(pq2) + "\n");

    }

}
