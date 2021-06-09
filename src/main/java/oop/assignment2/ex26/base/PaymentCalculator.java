package oop.assignment2.ex26.base;

public class PaymentCalculator {

    //  n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public static int calculateMonthsUntilPaidOff(double rate, double balance, double monthly) {

        double temp1 = Math.pow(1+(rate/100), 30);

        return (int) temp1;
    }
}
