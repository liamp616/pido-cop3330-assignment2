package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        //  checks for lengths of strings
        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 != length2) {
            return false;
        }

        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1, string2);
    }
}
