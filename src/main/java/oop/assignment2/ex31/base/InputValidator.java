package oop.assignment2.ex31.base;

import java.util.Scanner;

public class InputValidator {

    private static String input;
    private static Scanner in = new Scanner(System.in);

    public static int inputAge() {
        boolean isNumber = false;
        int age = 1;
        do {
            System.out.print("Age: ");
            input = in.nextLine();

            try{
                age = Integer.valueOf(input);

                if(age <= 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    isNumber = false;
                } else {
                    isNumber = true;
                }
            }catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
                isNumber = false;
            }
        } while(!(isNumber));
        return age;
    }

    public static int inputHeartRate() {
        boolean isNumber = false;
        int heartRate = 1;
        do {
            System.out.print("Heart Rate: ");
            input = in.nextLine();

            try{
                heartRate = Integer.valueOf(input);

                if(heartRate <= 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    isNumber = false;
                } else {
                    isNumber = true;
                }
            }catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
                isNumber = false;
            }
        } while(!(isNumber));
        return heartRate;
    }
}
