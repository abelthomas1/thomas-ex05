/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Abel Thomas
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args){
        /*
        prompt user input for both first and second number
        multiply, divide, add, and subtract these two numbers
        print
         */

        Scanner input = new Scanner (System.in);
        System.out.print("What is the first number? ");
        int number1 = input.nextInt();
        System.out.print("What is the second number? ");
        int number2 = input.nextInt();

        int product = number1 * number2;
        int sum = number1 + number2;
        int difference = number1 - number2;
        int quotient = number1/number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " / " + number2 + " = " + quotient);

    }
}

