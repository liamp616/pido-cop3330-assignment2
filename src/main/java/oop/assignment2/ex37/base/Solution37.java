/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do.
And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers.
Then generate a password for the user using those inputs.

Example Output

What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints

Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

Challenges

Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
 */

package oop.assignment2.ex37.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int minLength = readMinLength();
        int specialChar = readSpecialChar();
        int numbers = readNumbers();

        PasswordGenerator pw = new PasswordGenerator();
        String pass = PasswordGenerator.generate(minLength, specialChar, numbers);
        PasswordGenerator.output(pass);
    }

    private static int readNumbers() {
        boolean isNumber = false;
        int ret = 0;
        do {
            System.out.print("How many numbers? ");
            String input = in.nextLine();

            try{
                ret = Integer.valueOf(input);
                isNumber = true;

            }catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
                isNumber = false;
            }
        } while(!(isNumber));
        return ret;
    }

    private static int readSpecialChar() {
        boolean isNumber = false;
        int ret = 0;
        do {
            System.out.print("How many special characters? ");
            String input = in.nextLine();

            try{
                ret = Integer.valueOf(input);
                isNumber = true;

            }catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
                isNumber = false;
            }
        } while(!(isNumber));
        return ret;
    }

    private static int readMinLength() {
        boolean isNumber = false;
        int ret = 0;
        do {
            System.out.print("What's the minimum length? ");
            String input = in.nextLine();

            try{
                ret = Integer.valueOf(input);
                isNumber = true;

            }catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
                isNumber = false;
            }
        } while(!(isNumber));
        return ret;
    }
}
