/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each.
The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output

Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter an employee ID: A12-1234
"J" is not a valid first name. It is too short.
The last name must be filled in.
The ZIP code must be numeric.
A12-1234 is not a valid ID.

Or

Enter the first name: Jimmy
Enter the last name: James
Enter the ZIP code: 55555
Enter an employee ID: TK-421
There were no errors found.

Constraints

Create a function for each type of validation you need to write.
Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.

Challenges

Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
 */

package oop.assignment2.ex27.base;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution27 solution = new Solution27();

        String first = solution.readFirst();
        String last = solution.readLast();
        String zip = solution.readZIP();
        String id = solution.readId();

        InfoValidator iv = new InfoValidator();

        iv.validateInput(first, last, zip, id);
    }

    private static String readId() {
        System.out.print("Enter an employee ID: ");
        return in.nextLine();
    }

    private static String readZIP() {
        System.out.print("Enter the the ZIP code: ");
        return in.nextLine();
    }

    private static String readLast() {
        System.out.print("Enter the last name: ");
        return in.nextLine();
    }

    private static String readFirst() {
        System.out.print("Enter the first name: ");
        return in.nextLine();
    }
}
