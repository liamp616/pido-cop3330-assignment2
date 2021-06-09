package oop.assignment2.ex27.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoValidator {

    //  these booleans will be checked true if it is filled in correctly
    public static boolean firstFlag = false;
    public static boolean lastFlag = false;
    public static boolean zipFlag = false;
    public static boolean idFlag = false;

    public static void validateInput(String first, String last, String zip, String id) {
        validateFirst(first);
        validateLast(last);
        validateZip(zip);
        validateId(id);

        //  checks if no errors were found through booleans
        if(firstFlag && lastFlag && zipFlag && idFlag) {
            System.out.println("There were no errors found.");
        }
    }

    //  checks if the id is filled in the correct format
    public static void validateId(String id) {
        Pattern pattern = Pattern.compile("\\w{2}-\\d{4}");
        Matcher matcher = pattern.matcher(id);

        if(id.isEmpty()) {
            System.out.println("The employee ID must be filled in.");
        } else if(!(matcher.matches())) {
            System.out.println(id + " is not a valid ID.");
        } else if(matcher.matches()) {
            idFlag = true;
        }
    }

    //  checks if the zip code is filled in correctly
    public static void validateZip(String zip) {
        if(zip.isEmpty()) {
            System.out.println("The ZIP code must be filled in");
        } else if(!(zip.matches("[0-9]+"))) {
            System.out.println("The ZIP code must be numeric.");
        } else {
            zipFlag = true;
        }
    }

    //  checks if the last name is filled in correctly
    public static void validateLast(String last) {
        if(last.isEmpty()) {
            System.out.println("The last name must be filled in.");
        } else if(last.length() < 2) {
            System.out.println("\"" + last + "\" is not a valid last name. It is too short.");
        } else {
            lastFlag = true;
        }
    }

    //  checks if the first name is filled in correctly
    public static void validateFirst(String first) {
        if(first.isEmpty()) {
            System.out.println("The first name must be filled in");
        } else if(first.length() < 2) {
            System.out.println("\"" + first + "\" is not a valid first name. It is too short.");
        } else {
            firstFlag = true;
        }
    }
}
