package com.example.refactoring.chapter6.SplitPhase;

public class Main {
    public static void main(String[] args) {



    }


    public static double priceOrder(Product product, double quantity, ShippingMethod shippingMethod) {
        double basePrice = product.basePrice * quantity;
        double discount = Math.max(quantity - product.discountThreshold, 0)
                * product.basePrice * product.discountRate;
        double shippingPerCase = (basePrice > shippingMethod.discountThreshold)
                ? shippingMethod.discountedFee : shippingMethod.feePerCase;
        double shippingCost = quantity * shippingPerCase;
        double price = basePrice - discount + shippingCost;
        return price;
    }
}
