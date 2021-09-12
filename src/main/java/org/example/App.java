/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean isMale = true;
        double ounces = 0.0, weight = 0.0, hrs = 0.0, BAC;
        String Gender, Alcohol, Weight, Hours;
        final double mConst = 0.73, wConst = 0.66;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        Gender = scanner.nextLine();

        if (Integer.parseInt(Gender) == 2)
            isMale = false;

        System.out.print("How many ounces of alcohol did you have? ");
        Alcohol = scanner.nextLine();

        try {
            ounces = Double.parseDouble(Alcohol);
        }
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
        }

        System.out.print("What is your weight, in pounds? ");
        Weight = scanner.nextLine();

        try {
            weight = Double.parseDouble(Weight);
        }
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
        }

        System.out.print("How many hours has it been since your last drink? ");
        Hours = scanner.nextLine();

        try {
            hrs = Double.parseDouble(Hours);
        }
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
        }

        if (isMale) {

            BAC = (ounces * 5.14 / weight * mConst) - .015 * hrs;
        }
        else {
            BAC = (ounces * 5.14 / weight * wConst) - .015 * hrs;
        }
        System.out.printf("\nYour BAC is %f%n", BAC);

        if (BAC <= 0.08) {
            System.out.print("It is legal for you to drive.");
        }
        else {
            System.out.print("It is not legal for you to drive.");
        }
    }
}