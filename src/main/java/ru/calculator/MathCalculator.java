package ru.calculator;

import ru.math.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double subAndDividing(double first, double second) {
        return MathFunction.subtraction(first, second)
                + MathFunction.dividing(first, second);
    }

    public static double generalSumСalculation(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.subtraction(first, second)
                + MathFunction.dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDividing(10, 20));
        System.out.println("Результат расчета равен: " + generalSumСalculation(10, 20));
    }

}
