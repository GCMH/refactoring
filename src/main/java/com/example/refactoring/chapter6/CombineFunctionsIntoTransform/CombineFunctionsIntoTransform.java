package com.example.refactoring.chapter6.CombineFunctionsIntoTransform;


public class CombineFunctionsIntoTransform {
    public static void main(String[] args) throws CloneNotSupportedException {
        Reading c1 = acquireReading();
        Result result = enrichReading(c1);
        double baseCharge = result.baseCharge;


        Reading c2 = acquireReading();
        result = enrichReading(c2);
        double taxableCharge = result.taxableCharge;

        Reading c3 = acquireReading();
        result = enrichReading(c3);
        double basicChargeAmount = result.basicChargeAmount;

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
