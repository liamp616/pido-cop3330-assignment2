package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex36test {
    @Test
    void min_found() {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            test.add(i);
        }

        processing pro = new processing();
        int actual = pro.min(test);
        assertEquals(actual, 1);
    }

    @Test
    void max_found() {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            test.add(i);
        }

        processing pro = new processing();
        int actual = pro.max(test);
        assertEquals(actual, 5);
    }

    @Test
    void avg_found() {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            test.add(i);
        }

        processing pro = new processing();
        double actual = pro.average(test);
        assertEquals(actual, 3);
    }

    @Test
    void std_found() {
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            test.add(i);
        }

        processing pro = new processing();
        double actual = pro.std(test);
        assertEquals(actual, 1.4142135623730951);
    }
}
