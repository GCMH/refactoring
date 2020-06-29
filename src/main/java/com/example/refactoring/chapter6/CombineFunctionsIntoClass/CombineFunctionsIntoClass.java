package com.example.refactoring.chapter6.CombineFunctionsIntoClass;

public class CombineFunctionsIntoClass {
    public static void main(String[] args) {
        Reading c1 = acquireReading();
        double baseCharge = baseRate(c1.month, c1.year) * c1.quantity;

        Reading c2 = acquireReading();
        double base = (baseRate(c2.month, c2.year) * c2.quantity);
        double taxableCharge = Math.max(0, base - taxThreshold(c2.year));


        Reading c3 = acquireReading();
        double basicChargeAmount = calculateBaseCharge(c3);
    }


    public static double calculateBaseCharge(Reading aReading) {
        return baseRate(aReading.month, aReading.year) * aReading.quantity;
    }

    private static double taxThreshold(Integer year) {
        return 0;
    }

    private static double baseRate(Integer month, Integer year) {
        return 0;
    }


    public static Reading acquireReading() {
        return new Reading();
    }
}


