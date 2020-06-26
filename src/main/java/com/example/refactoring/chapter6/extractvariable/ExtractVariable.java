package com.example.refactoring.chapter6.extractvariable;


public class ExtractVariable {
    public static void main(String[] args) {

        System.out.println(price(new Order(100, 6)));
    }

    public static double price(Order order) {
        //
        return order.quantity * order.itemPrice -
                Math.max(0, order.quantity - 500) * order.itemPrice * 0.05 +
                Math.min(order.quantity * order.itemPrice * 0.1, 100);
    }
}
