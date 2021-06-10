package oop.assignment2.ex26.base;

public class PaymentCalculator {

    // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public static int calculateMonthsUntilPaidOff(double APR, double balance, double monthly) {
        double rate = APR / 100.0;
        double calculation = 1.0 - Math.pow((1.0 + (rate/365.0)), 30.0);
        calculation = 1.0 + ((balance/monthly) * calculation);
        calculation = Math.log(calculation);
        calculation = calculation / Math.log(1 + (rate/365.0));
        calculation = calculation * -(1.0/30.0);
        return (int) Math.ceil(calculation);
    }
}
