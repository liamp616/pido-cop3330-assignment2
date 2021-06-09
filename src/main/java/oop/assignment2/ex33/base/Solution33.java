/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 33 - Magic 8 Ball

Arrays are great for storing possible responses from a program.
If you combine that with a random number generator, you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output

What's your question?
> Will I be rich and famous?

Ask again later.

Constraint

The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.

Challenges

Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.
 */

package oop.assignment2.ex33.base;

import java.util.Scanner;
import java.util.Random;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);
    private static final String[] answers = {"Yes", "No", "Maybe", "Ask again later."};

    public static void main(String[] args) {
        readInput();
        int random = generateRandom();
        output(random);
    }

    private static void output(int random) {
        switch(random) {
            case 0:
                System.out.println("\n" + answers[0]);
                break;
            case 1:
                System.out.println("\n" + answers[1]);
                break;
            case 2:
                System.out.println("\n" + answers[2]);
                break;
            case 3:
                System.out.println("\n" + answers[3]);
                break;
        }
    }

    private static int generateRandom() {
        Random rand = new Random();
        return rand.nextInt(4);
    }

    private static void readInput() {
        System.out.print("What is your question?\n> ");
        in.next();
    }
}
