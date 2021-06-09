package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex29test {
    @Test
    void is_valid_input() {
        boolean valid = Solution29Test.readInput("3");
        assertTrue(valid);
    }

    @Test
    void is_not_valid_input() {
        boolean valid = Solution29Test.readInput("a");
        assertFalse(valid);
    }
}
