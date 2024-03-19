package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDividing(double first, double second) {
        return subtraction(first, second)
                + dividing(first, second);
    }

    public static double generalSumСalculation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDividing(10, 20));
        System.out.println("Результат расчета равен: " + generalSumСalculation(10, 20));
    }

}
