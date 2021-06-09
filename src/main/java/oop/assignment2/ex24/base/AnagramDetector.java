package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        //  checks for lengths of strings
        int length1 = word1.length();
        int length2 = word2.length();

        //  if the 2 lengths are not equal, it returns false
        if(length1 != length2) {
            return false;
        }

        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();

        //  sorts the strings
        Arrays.sort(string1);
        Arrays.sort(string2);
        //  returns true if it is equally sorted
        return Arrays.equals(string1, string2);
    }
}
