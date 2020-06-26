package com.example.refactoring.chapter6.extractvariable;


public class ExtractVariable {
    public static void main(String[] args) {

        System.out.println(price(new Order(100, 6)));
    }

    public static double price(Order order) {

        double quantity = order.quantity;
        double price = order.itemPrice;

        return calculateBasePrice(quantity, price) -
                calculateQuatity(quantity, price) +
                calculateShipping(quantity, price);
    }

    public static double calculateBasePrice(double quantity, double price){
        return quantity * price;
    }

    public static double calculateQuatity(double quantity, double price){
        return Math.max(0, quantity - 500) * price * 0.05;
    }

    public static double calculateShipping(double quantity, double price){
        return Math.min(quantity * price * 0.1, 100);
    }



}
