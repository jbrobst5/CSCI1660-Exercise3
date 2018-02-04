package com.jack.csci1660.exercise3;

import java.util.Scanner;

public class Main {

    /*
    Write a program that prompts a user to enter a temperature in Fahrenheit, converts it to Celsius, and displays the
    Celsius temperature. Separate the code that collects user input, the code that converts temperatures, and the code
    that displays the output into different methods. The program should repeat until the user enters a value less than
    -460 (approximately absolute zero).
     */

    private static double promptTemperature() {
        Scanner scanner = new Scanner(System.in);
        double out;

        System.out.printf("Enter a temperature in Fahrenheit (<-420):\n > ");
        out = scanner.nextDouble();

        // Might need to handle stuff here...

        return out;
    }

    private static double convertToCelsius(double fTemp) {
        return ((fTemp - 32.0) * (5.0/9.0));
    }

    private static void showTemperature(double cTemp) {
        System.out.printf("Celsius: %f\n", cTemp);
    }

    public static void main(String[] args) {
        double fTemp;
        do {
            fTemp = promptTemperature();
        }
        while (fTemp > -420.0);
        double cTemp = convertToCelsius(fTemp);
        showTemperature(cTemp);
    }
}
