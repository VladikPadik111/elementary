package ru.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && bc + ac > ab;
    }

    public static void main(String[] args) {
        System.out.println(exist(32, 33, 51));
        System.out.println(exist(5, 4.6, 8.9));
        System.out.println(exist(4.7, 9.5, 16.9));
    }
}

