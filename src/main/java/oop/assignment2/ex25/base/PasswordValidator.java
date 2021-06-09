package oop.assignment2.ex25.base;

import java.util.Locale;

public class PasswordValidator {

    public static int passwordValidator(String password) {
        //  1 = very weak password
        //  2 = weak password
        //  3 = good password
        //  4 = strong password
        //  5 = very strong password

        if(password.length() <= 8) {
            //  checks to see if the length it is less than or equal to 8
            if(onlyNum(password)) {
                return 1;
            } else if(onlyChar(password)) {
                return 2;
            } else {
                return 2;
            }
        } else if(password.length() >= 8) {
            //  checks to see if the length it is greater than or equal to 8
            if(isVeryStrong(password)) {
                return 5;
            } else if(hasOneNum(password)) {
                return 4;
            } else {
                return 3;
            }
        }
        return 0;
    }

    //  checks if the password is very strong - see requirements in Solution25 comments
    private static boolean isVeryStrong(String password) {
        boolean letterFlag = false;
        boolean numberFlag = false;
        boolean specialFlag = false;
        String specialRegex = "[^a-zA-Z0-9]+";

        for(int i = 0; i < password.length(); i++) {
            char temp = password.charAt(i);
            if(Character.isDigit(temp)) {
                numberFlag = true;
            } else if(Character.isUpperCase(temp)) {
                letterFlag = true;
            } else if(Character.isLowerCase(temp)) {
                letterFlag = true;
            } else if(password.substring(i, i+1).matches("[^A-Za-z0-9 ]")) {
                specialFlag = true;
            }
            if(numberFlag && letterFlag && specialFlag) {
                return true;
            }
        }
        return false;
    }

    //  checks if the password has atleast one number
    private static boolean hasOneNum(String password) {
        return password.matches(".*\\d+.*");
    }

    //  checks if the password ONLY has numbers
    private static boolean onlyNum(String password) {
        for(int i = 0; i < password.length(); i++) {
            //  checks if the char is a digit
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //  checks if the password ONLY has characters
    public static boolean onlyChar(String password) {
        return password.matches("[a-zA-Z]+");
    }

    public static void output(int result, String password) {
        switch(result) {
            case 1:
                System.out.println("The password '" + password + "' is a very weak password.");
                break;
            case 2:
                System.out.println("The password '" + password + "' is a weak password.");
                break;
            case 3:
                System.out.println("The password '" + password + "' is a good password.");
                break;
            case 4:
                System.out.println("The password '" + password + "' is a strong password.");
                break;
            case 5:
                System.out.println("The password '" + password + "' is a very strong password.");
                break;
        }
    }
}


