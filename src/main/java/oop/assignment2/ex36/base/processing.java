package oop.assignment2.ex36.base;

import java.util.ArrayList;

public class processing {

    //  finds the minimum of the array
    public static int min(ArrayList<Integer> times) {
        int min = times.get(1);

        for(int i = 0; i < times.size(); i++) {
            if(min > times.get(i)) {
                min = times.get(i);
            }
        }
        return min;
    }

    //  finds the maximum of the array
    public static int max(ArrayList<Integer> times) {
        int max = times.get(1);

        for(int i = 0; i < times.size(); i++) {
            if(max < times.get(i)) {
                max = times.get(i);
            }
        }
        return max;
    }

    //  finds the average of the array
    public static double average(ArrayList<Integer> times) {
        double total = 0;
        for(int i = 0; i < times.size(); i++) {
            total += times.get(i);
        }
        return total / times.size();
    }

    //  finds the standard deviation of the array
    public static double std(ArrayList<Integer> times) {
        double sum = 0.0;
        double mean = 0.0;
        double standardDeviation = 0.0;
        double sq = 0.0;
        double res = 0.0;

        for(int i = 0; i < times.size(); i++) {
            sum = sum + times.get(i);
        }

        mean = sum / times.size();

        for(int i = 0; i < times.size(); i++) {
            standardDeviation = standardDeviation + Math.pow((times.get(i) - mean), 2);
        }

        sq = standardDeviation / times.size();
        res = Math.sqrt(sq);
        return res;
    }
}
