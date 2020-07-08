package com.example.refactoring.chapter6.SlideStatements;

public class Main {
    public static void main(String[] args) {

        Order order = retreiveOrder();

        int units = order.units;
        PricingPlan pricingPlan = retrievePricingPlan();
        int discountableUnits = Math.max(units - pricingPlan.discountThreshold, 0);
        int discount;
        discount = discountableUnits * pricingPlan.discountFactor;
        if (order.isRepeat) discount += 20;

        int charge;
        int baseCharge = pricingPlan.base;
        int chargePerUnit = pricingPlan.unit;
        charge = baseCharge + units * chargePerUnit;
        charge -= discount;
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
