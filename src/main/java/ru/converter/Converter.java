package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollars.");
        float in = 140;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4. Test result : " + passed);
        float inTwo = 100;
        float expectedTwo = 1.1111112F;
        float outTwo = Converter.rubleToDollar(inTwo);
        boolean passedTwo = expectedTwo == outTwo;
        System.out.println("100 rubles are 1.1111112. Test result: " + passedTwo);

    }

}
