package oop.assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  checked with https://www.bankrate.com/calculators/credit-cards/credit-card-payoff-calculator.aspx

class ex26test {
    @Test
    void is70() {
        PaymentCalculator pc = new PaymentCalculator();
        int actual = PaymentCalculator.calculateMonthsUntilPaidOff(12, 5000, 100);
        assertEquals(70, actual);
    }

    @Test
    void is38() {
        PaymentCalculator pc = new PaymentCalculator();
        int actual = PaymentCalculator.calculateMonthsUntilPaidOff(15, 6000, 200);
        assertEquals(38, actual);
    }
}
