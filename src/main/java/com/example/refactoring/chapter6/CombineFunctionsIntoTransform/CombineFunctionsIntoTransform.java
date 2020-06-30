package com.example.refactoring.chapter6.CombineFunctionsIntoTransform;


public class CombineFunctionsIntoTransform {
    public static void main(String[] args) {
        Reading c1 = acquireReading();
        double baseCharge = c1.baseRate() * c1.quantity;

        Reading c2 = acquireReading();
        double base = (baseRate(c2.month, c2.year) * c2.quantity);
        double taxableCharge = Math.max(0, base - taxThreshold(c2.year));

        Reading c3 = acquireReading();
        double basicChargeAmount = calculateBaseCharge(c3);

    }

    static Result enrichReading(Reading reading) throws CloneNotSupportedException {
        Result result = new Result();
        Reading clone = (Reading) reading.clone();
        result.baseCharge =  clone.baseRate() * clone.quantity;

        double base = (baseRate(clone.month, clone.year) * clone.quantity);
        result.taxableCharge = Math.max(0, base - taxThreshold(clone.year));

        result.basicChargeAmount = calculateBaseCharge(clone);

        return result;
    }

    static double  calculateBaseCharge(Reading c3) {
        return baseRate(c3.month, c3.year) * c3.quantity;
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