package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex38test {
    @Test
    void isEven(){
        int[] test = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 3; i++) {
            expected.add(i*2);
        }
        Solution38 solution = new Solution38();
        ArrayList<Integer> actual = solution.filterEvenNumbers(test);
        assertTrue(expected.equals(actual));
    }
}
