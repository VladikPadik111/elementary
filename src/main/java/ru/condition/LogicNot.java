package ru.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return (num % 2 != 1);
    }

    public static boolean isPositive(int num) {
        return (!(num < 0));
    }

    public static boolean notEven(int num) {
        return (num % 2 != 0);
    }

    public static boolean notPositive(int num) {
        return (!(num > 0));
    }

    public static boolean notEvenAndPositive(int num) {
        return (num / 2 != 0 && !(num < 0));
    }

    public static boolean evenOrNotPositive(int num) {
        return (num % 2 == 0 || !(num > 0));
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isPositive(125));
        System.out.println(notEven(35));
        System.out.println(notPositive(-38));
        System.out.println(notEvenAndPositive(39));
        System.out.println(evenOrNotPositive(-39));
    }
}
