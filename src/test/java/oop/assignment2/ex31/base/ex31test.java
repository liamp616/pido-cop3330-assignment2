package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31test {
    @Test
    void is_1482() {
        double total = 0;

        //  the total is 1482.75 with age 22 and hr of 65
        for(int i = 55; i <= 95; i = i+5) {
            double target = (((220 - 22) - 65) * (i / 100.0)) + 65;
            total += target;
        }
        System.out.println(total);
    }

    @Test
    void is_not_1482() {
        //  using the last test's result of 1482.75, we can change the values to verify that the for loop works and will produce another answer
        boolean is1482 = false;
        double total = 0;

        for(int i = 55; i <=95; i = i+5) {
            double target = (((220 - 21) - 65) * (i / 100.0)) + 65;
            total += target;
        }
        if(total == 1482.75) {
            is1482 = true;
        }

        assertFalse(is1482);
    }
}
