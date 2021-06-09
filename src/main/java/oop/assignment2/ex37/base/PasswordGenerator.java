package oop.assignment2.ex37.base;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    public static String generate(int minLength, int specialChar, int numbers) {
        int length = (minLength) - (specialChar + numbers);

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String integers = "0123456789";
        String special = "!@#$%^&*";
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(letters.length());
            password.append(letters.charAt(randomIndex));
        }
        for(int i = 0; i < numbers; i++) {
            int randomIndex = rand.nextInt(integers.length());
            password.append(integers.charAt(randomIndex));
        }
        for(int i = 0; i < specialChar; i++) {
            int randomIndex = rand.nextInt(special.length());
            password.append(special.charAt(randomIndex));
        }
        int randomIndex = ((int) (Math.random() * (26)));
        password.append(letters.charAt(randomIndex));
        return password.toString();
    }


    public static void output(String pass) {
        List<String> ret = Arrays.asList(pass);
        System.out.print("Your password is ");
        for(int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i));
        }
    }
}
