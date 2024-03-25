package ru.condition;

public class Max {

    public static int max(int left, int right) {
        int result = right > left ? right : left;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(25, 20));
    }
}
