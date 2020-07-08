package com.example.refactoring.chapter6.SlideStatements;

public class Main {
    public static void main(String[] args) {
        PricingPlan pricingPlan = retrievePricingPlan();
        Order order = retreiveOrder();
        int baseCharge = pricingPlan.base;
        int charge;
        int chargePerUnit = pricingPlan.unit;
        int units = order.units;
        int discount;
        charge = baseCharge + units * chargePerUnit;
        int discountableUnits = Math.max(units - pricingPlan.discountThreshold, 0);
        discount = discountableUnits * pricingPlan.discountFactor;
        if (order.isRepeat) discount += 20;
        charge = charge - discount;
        chargeOrder(charge);
    }

    private static void chargeOrder(int charge) {

    }

    private static Order retreiveOrder() {
        return null;
    }

    private static PricingPlan retrievePricingPlan() {
        return null;
    }


}
