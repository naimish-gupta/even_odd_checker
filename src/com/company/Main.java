package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Even or Odd checking number: ");

        //Here we use scanner to take input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num_1 = sc.nextInt();


        if (num_1 % 2 != 0) // Means: If number is not(!) equal to(=)... if we take 5 % 2 = 1. So, the first condition is invalid
        {

            System.out.println("Odd Number");
        }
        else

        // then print else part
        {
            System.out.println("Even Number");
        }


    }
}
