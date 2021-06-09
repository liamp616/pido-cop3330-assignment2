package oop.assignment2.ex29.base;

import java.util.Scanner;

public class Solution29Test {


    public static boolean readInput(String input) {
            try{
                int rate = Integer.valueOf(input);

                //  checks to see if the input is less than or equal to 0 - not a valid input
                if(rate <= 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    return false;
                } else {
                    return true;
                }
            }catch (NumberFormatException e) {
                //  catches to see if user inputted a non-numerical value
                System.out.println("Sorry. That's not a valid input.");
                return false;
            }
    }

}
