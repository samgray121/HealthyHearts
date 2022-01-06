package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age;
        int maxHeartRate;
        int targetHeartRate;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Your maximum heart rate is " + (220 - age));

        System.out.println("Your target heart rate zone should be between " + ((220 - age) * .5) + " and " + ((220-age) * .85));

        System.out.println("random1");









    }
}
