package com.example.refactoring.chapter6.extractvariable;


public class ExtractVariable {
    public static void main(String[] args) {

        System.out.println(price(new Order(100, 6)));
    }

    public static double price(Order order) {

        double basePrice = order.quantity * order.itemPrice;
        double quantity =  Math.max(0, order.quantity - 500) * order.itemPrice * 0.05;
        double shipping = Math.min(order.quantity * order.itemPrice * 0.1, 100);

        return basePrice - quantity + shipping;
    }
}
