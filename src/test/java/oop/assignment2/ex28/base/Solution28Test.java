package oop.assignment2.ex28.base;

import java.util.Scanner;

public class Solution28Test {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int loop(int total, int[] nums) {
        //  iterates 5 times, just adds inputted number to the total
        for(int i = 0; i < 5; i++) {
            total += nums[i];
        }
        return total;
    }
}
