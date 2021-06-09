/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.

Example Output

Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints

Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.

Challenge

Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */

package oop.assignment2.ex38.base;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution38 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution38 solution = new Solution38();
        int[] numbers = readNumbers();
        ArrayList<Integer> newNumbers = filterEvenNumbers(numbers);
        solution.output(newNumbers);

    }

    private static void output(ArrayList<Integer> newNumbers) {
        System.out.print("The even numbers are ");
        for(int i = 0; i < newNumbers.size()-1; i++) {
            System.out.print(newNumbers.get(i) + " ");
        }
        System.out.print(newNumbers.get(newNumbers.size()-1) + ".");
    }

    //  inserts even numbers into new arraylist and returns it
    private static ArrayList<Integer> filterEvenNumbers(int[] numbers) {
        ArrayList<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                ret.add(numbers[i]);
            }
        }
        return ret;
    }

    //  reads in the line of inputs and inserts each number separated by a space using regex into the array
    private static int[] readNumbers() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String sampleString = in.nextLine();
        String[] stringArrays = sampleString.split("\\s+");

        int[] ret = new int[stringArrays.length];

        for(int i = 0; i < stringArrays.length; i++) {
            String numAsString = stringArrays[i];
            ret[i] = Integer.parseInt(numAsString);
        }
        return ret;
    }

}
