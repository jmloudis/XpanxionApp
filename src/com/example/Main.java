package com.example;

import com.example.quiz.Kid;

//class
public class Main {

    //method
    public static void main(String[] args){

        System.out.println(Kid.numberOfKids);
        Kid k1 = new Kid();
        System.out.println(Kid.numberOfKids);
        Kid k2 = new Kid("Jordan", "Male", 24);
        System.out.println(Kid.numberOfKids);

        System.out.println(k1.toString());
        System.out.println(k2.toString());

        System.out.println(k1.areTheyTwins(k2));

        k1.setAge(24);
        k1.setName("Jimmy");
        k1.setGender("Female");

        System.out.println(k1.getGender());
        System.out.println(k1.getName());
        System.out.println(k1.getAge());

        System.out.println(k1.toString());
        System.out.println(k2.toString());

        System.out.println(k2.areTheyTwins(k1));
        System.out.println(Kid.numberOfKids);

        Kid k3 = new Kid("Ally", "Female", 30);
        System.out.println(k3.toString());
        System.out.println(Kid.numberOfKids);

        k2.setAge(30);
        System.out.println(k2.getAge());
        System.out.println(k2.getName());
        System.out.println(k2.getGender());
        System.out.println(k3.areTheyTwins(k2));

    }


}
