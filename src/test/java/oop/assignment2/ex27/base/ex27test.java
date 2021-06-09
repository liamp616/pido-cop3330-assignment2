package oop.assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex27test {
    @Test
    void first_is_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateFirst("Jimmy");
        assertTrue(test);
    }

    @Test
    void first_is_not_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateFirst("J");
        assertFalse(test);
    }

    @Test
    void last_is_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateLast("Jones");
        assertTrue(test);
    }

    @Test
    void last_is_not_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateLast("");
        assertFalse(test);
    }

    @Test
    void zip_is_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateZip("33333");
        assertTrue(test);
    }

    @Test
    void zip_is_not_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateZip("");
        assertFalse(test);
    }

    @Test
    void id_is_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateId("TK-4321");
        assertTrue(test);
    }

    @Test
    void id_is_not_validated() {
        InfoValidatorTest ivt = new InfoValidatorTest();

        boolean test = InfoValidatorTest.validateId("TKS-453");
        assertFalse(test);
    }

}
