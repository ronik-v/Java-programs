package com.company;


public class Main {
    public static double function(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static void Search(double[] value, int start, int end) {
        int len;
        int mid = 0;
        int mean;
        while (end - start > 1) {
            len = end - start;
            mean = len / 2;
            mid = start + mean;
            if (Math.signum(value[start]) != Math.signum(value[mid])) {
                end = mid;
            } else {
                start = mid;
            }
        }
        double result = mid;
        System.out.print("Root of the equation = " + (result / 1000));
    }
    public static void main(String[] args) {
        int size = 10 * 1000;
        double[] value_of_func = new double[size];
        for (int i = 0; i < size; ++i) {
            value_of_func[i] = function(i * 0.001);
        }
        Search(value_of_func, 0, size);
    }
}
