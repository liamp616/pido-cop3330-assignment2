package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex28test {
    @Test
    void is_15() {
        boolean is15 = false;
        int[] nums = {1, 2, 3, 4, 5};
        int total = Solution28Test.loop(0, nums);
        if(total == 15) {
            is15 = true;
        }
        assertTrue(is15);
    }

    @Test
    void is_not_15() {
        boolean is15 = false;
        int[] nums = {1, 2, 3, 4, 4};
        int total = Solution28Test.loop(0, nums);
        if(total == 15) {
            is15 = true;
        }
        assertFalse(is15);
    }
}
