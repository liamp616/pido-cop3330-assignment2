/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times, it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output

Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

Constraints

Use functions called average, max, min, and std, which take in an array of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the array of inputs.
Be sure to properly convert numeric values to strings.
Keep the input separate from the processing and the output.

Challenges

Have the program read in numbers from an external file instead of prompting for the values.
 */

package oop.assignment2.ex36.base;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution36 {
    private static final Scanner in = new Scanner(System.in);
    private static double avg;
    private static int min;
    private static int max;
    private static double std;

    public static void main(String[] args) {
        ArrayList<Integer> times = new ArrayList<Integer>();

        processing p = new processing();
        inputTimes(times);
        process(times);
        output(times);
    }

    private static void process(ArrayList<Integer> times) {
        avg = processing.average(times);
        min = processing.min(times);
        max = processing.max(times);
        std = processing.std(times);
    }

    private static void output(ArrayList<Integer> times) {
        System.out.print("Numbers: ");
        for(int i = 0; i < times.size() - 1; i++) {
            System.out.print(times.get(i) + ", ");
        }
        System.out.println(times.get(times.size() - 1));
        System.out.println("The average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.println("The standard deviation is " + Math.round(std * 100.00) / 100.0);
    }

    private static void inputTimes(ArrayList<Integer> times) {
        boolean addMore = false;
        do {
            System.out.print("Enter a number: ");
            String input = in.nextLine();

            try{
                // int ret = Integer.valueOf(input);

                if(input.equals("done")) {
                    addMore = true;
                } else {
                    int ret = Integer.valueOf(input);
                    times.add(ret);
                }
            }catch (NumberFormatException e) {
                addMore = false;
            }
        } while(!(addMore));
    }

}
