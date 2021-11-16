package com.tw.javapractice.calculator;

import java.util.Scanner;

public class Calculator {
    private void sum(double num1, double num2) {

        System.out.println("Sum of two numbers is " + (num1 + num2));
    }

    private void diff(double num1, double num2) {
        System.out.println("Difference of two numbers is " + (num1 - num2));
    }

    private void mul(double num1, double num2) {
        System.out.println("Multiplication of two numbers is " + (num1 * num2));
    }

    private void div(double num1, double num2) {
        System.out.println("Division of two numbers is " + (num1 / num2));
    }

    public void doOperations() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Enter 1 to find the sum of two numbers");
            System.out.println("Enter 2 to find the difference of two numbers");
            System.out.println("Enter 3 to find the multiplication of two numbers");
            System.out.println("Enter 4 to find the division of two numbers");
            System.out.println("Enter 5 or more than 5 to exit");
            System.out.println();
            System.out.println("Enter your Option");
            int userInput = sc.nextInt();
            double num1 = 0;
            double num2 = 0;
            switch (userInput) {
                case 1:
                    System.out.println("Now enter any two numbers");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    sum(num1, num2);
                    break;
                case 2:
                    System.out.println("Now enter any two numbers");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    diff(num1, num2);
                    break;
                case 3:
                    System.out.println("Now enter any two numbers");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    mul(num1, num2);
                    break;
                case 4:
                    System.out.println("Now enter any two numbers");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    div(num1, num2);
                    break;
                default:
                    isContinue = false;
            }
            System.out.println("");
        }
    }

}
