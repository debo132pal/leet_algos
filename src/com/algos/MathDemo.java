package com.algos;
import static java.lang.System.out;

public class MathDemo {
    public static void main(String[] args) {

        Double val1 = 7.19;
        Double val2 = 0.0 / 0.0;
        Double val3 = 1200.0 / 0;
        Double val4 = -val1 / 0.0;
        Double val5 = -3.61;
        Double val6 = 0.0;

        /*
         * test all the possible scenario on using the
         * max(double a,double b) method
         * Note, this only works using java 8
         */

        out.println("Max Between "+val1+" and "+val2+ " = "
                + Double.max(val1, val2));
        out.println("Max Between "+val1+" and "+val3+ " = "
                + Double.max(val1, val3));
        out.println("Max Between "+val3+" and "+val4+ " = "
                + Double.max(val3, val4));
        out.println("Max Between "+val1+" and "+val5+ " = "
                + Double.max(val1, val5));
        out.println("SMax Between "+val2+" and "+val6+ " = "
                + Double.max(val2, val6));




    }
}
