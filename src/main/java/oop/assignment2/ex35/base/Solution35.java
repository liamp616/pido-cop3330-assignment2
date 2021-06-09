/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank.
Then randomly select a winner.

Example Output

Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints

Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.

Challenges

When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
 */

package oop.assignment2.ex35.base;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        inputNames(names);
        chooseWinner(names);
    }

    private static void chooseWinner(ArrayList<String> names) {
        int rand = ((int) (Math.random() * (names.size()-1))) + 1;
        System.out.println("The winner is... " + names.get(rand) + ".");
    }

    private static void inputNames(ArrayList<String> names) {
        boolean addMore = true;

        while(addMore) {
            System.out.print("Enter a name: ");
            String input = in.nextLine();

            if(input.isEmpty()) {
                addMore = false;
            } else {
                names.add(input);
            }
        }
    }
}
