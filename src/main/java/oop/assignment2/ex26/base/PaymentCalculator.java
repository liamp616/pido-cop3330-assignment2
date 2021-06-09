package oop.assignment2.ex26.base;

public class PaymentCalculator {

    //  n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public static int calculateMonthsUntilPaidOff(double rate, double balance, double monthly) {
        double n;

        n = ((1.0 + (balance/monthly)) * (1.0 - Math.pow((1.0 + (rate / 365.0)), 30.0)));
        System.out.println(n);
        double temp = Math.log(n);
        System.out.println(temp);

        return (int) n;
    }
}
