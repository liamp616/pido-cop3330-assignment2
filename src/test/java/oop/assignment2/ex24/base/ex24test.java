package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24test {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        //  given
        AnagramDetector detector = new AnagramDetector();

        //  when
        boolean actual = detector.isAnagram("note", "note");

        //  then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams() {
        //  given
        AnagramDetector detector = new AnagramDetector();

        //  when
        boolean actual = detector.isAnagram("note", "not");

        //  then
        assertFalse(actual);

    }
}
