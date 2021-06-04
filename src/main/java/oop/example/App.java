package oop.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use,
you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those
numbers as shown in the example output:

Example Output:
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
Constraints:
-Values coming from users will be strings. Ensure that you convert these values to numbers before doing
 the math.
-Keep the inputs and outputs separate from the numerical conversions and other processing.
-Generate a single output statement with line breaks in the appropriate spots.

Challenges:
-Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed
 if the value entered is not numeric.
-Don’t allow the user to enter a negative number.
-Break the program into functions that do the computations.
-Implement this program as a GUI program that automatically updates the values when any value changes.
 */

public class App 
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        App myApp = new App();

        //get inputs
        System.out.print( "What is the first number? " );
        String num1String = myApp.getNumber();
        System.out.print( "What is the second number? " );
        String num2String = myApp.getNumber();

        //convert strings to ints
        int num1 = myApp.convertStringToInt(num1String);
        int num2 = myApp.convertStringToInt(num2String);

        //calculate
        int sum = myApp.calcSum(num1, num2);
        int difference = myApp.calcDifference(num1, num2);
        int product = myApp.calcProduct(num1, num2);
        int quotient = myApp.calcQuotient(num1, num2);

        //generate output
        String message = myApp.generateMessage(num1, num2, sum, difference, product, quotient);
        System.out.println(message);

    }

    public String getNumber(){
        String num = input.nextLine();
        return num;
    }

    public int convertStringToInt(String num){
        int actualNumber = Integer.parseInt(num);
        return actualNumber;
    }

    public int calcSum(int num1, int num2){
        return (num1 + num2);
    }

    public int calcDifference(int num1, int num2){
        return (num1 - num2);
    }

    public int calcProduct(int num1, int num2){
        return (num1 * num2);
    }

    public int calcQuotient(int num1, int num2){
        return (num1 / num2);
    }

    public String generateMessage(int num1, int num2, int sum, int dif, int product, int quotient) {
        return String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1, num2, sum, num1, num2, dif, num1, num2, product, num1, num2, quotient);
    }
}

