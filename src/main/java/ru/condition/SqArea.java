package ru.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = h * l;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(12, 1.5);
        System.out.println(" p = 12, k = 1.5, s = 8.64, real = " + result1);
    }

}
