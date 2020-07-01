package com.example.refactoring.chapter6.SplitPhase;

public class Main {
    public static void main(String[] args) {



    }


    public static double priceOrder(Product product, double quantity, ShippingMethod shippingMethod) {


        PriceData priceData = calculatePricingData(product, quantity);


        double shippingPerCase = (priceData.basePrice > shippingMethod.discountThreshold)
                ? shippingMethod.discountedFee : shippingMethod.feePerCase;


        double shippingCost = quantity * shippingPerCase;

        double price = priceData.basePrice - priceData.discount + shippingCost;
        return price;
    }


    public static PriceData calculatePricingData(Product product, double quantity){
        double basePrice = product.basePrice * quantity;
        double discount = Math.max(quantity - product.discountThreshold, 0)
                * product.basePrice * product.discountRate;

        PriceData priceData = new PriceData();
        priceData.basePrice = basePrice;
        priceData.discount = discount;
        priceData.quantity = quantity;
        return priceData;
    }

    public static double applyShipping(PriceData priceData, ShippingMethod shippingMethod){
        double shippingPerCase = (priceData.basePrice > shippingMethod.discountThreshold)
                ? shippingMethod.discountedFee : shippingMethod.feePerCase;
        double shippingCost = priceData.quantity * shippingPerCase;
        return priceData.basePrice - priceData.discount + shippingCost;
    }

}
