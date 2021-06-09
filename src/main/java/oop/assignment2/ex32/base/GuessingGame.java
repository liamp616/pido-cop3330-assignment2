package oop.assignment2.ex32.base;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final Scanner in = new Scanner(System.in);
    private static String input;

    public static void game(int difficulty) {
        int counter = 0;
        boolean guessed = false;
        int number = getRandomNum(difficulty);

        System.out.print("I have my number. What's your guess? ");

        do {
            int guess = readGuess();
            if(guess == number) {
                counter++;
                System.out.print("You got it in " + counter + " guesses!");
                guessed = true;
            } else if(guess < number) {
                counter++;
                System.out.print("Too low. Guess again: ");
                guessed = false;
            } else if(guess > number) {
                counter++;
                System.out.print("Too high. Guess again: ");
                guessed = false;
            }
        } while(!(guessed));
    }

    private static int readGuess() {
        boolean isNumber = false;
        int ret = 1;
        do {
            input = in.nextLine();
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

    private static int getRandomNum(int difficulty) {
        if(difficulty == 1) {
            return ((int) (Math.random() * (10-1))) + 1;
        } else if(difficulty == 2) {
            return ((int) (Math.random() * (100-1))) + 1;
        } else if(difficulty == 3) {
            return ((int) (Math.random() * (1000-1))) + 1;
        }
        return 0;
    }
}

