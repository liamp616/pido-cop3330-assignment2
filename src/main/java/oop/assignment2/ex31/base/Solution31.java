/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 31 - Karvonen Heart Rate

When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output

Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints

Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.

Challenge

Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the interface in real time as the slider moves.
 */

package oop.assignment2.ex31.base;

import java.util.Scanner;

public class Solution31 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution31 solution = new Solution31();
        InputValidator iv = new InputValidator();

        int age = iv.inputAge();
        int heartRate = iv.inputHeartRate();

        solution.output(age, heartRate);
    }

    private static void output(int age, int heartRate) {
        System.out.println("\nResting Pulse: " + heartRate + "\t\tAge: " + age);
        System.out.println("\nIntensity\t | Rate\t");
        System.out.println("-------------|--------");
        for(int i = 55; i <= 95; i = i+5) {
            double target = (((220 - age) - heartRate) * (i / 100.0)) + heartRate;
            System.out.println(i + "%\t\t\t | " + Math.round(target) + " bpm");
        }
    }
}
