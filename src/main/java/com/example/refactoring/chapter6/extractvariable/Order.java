package com.example.refactoring.chapter6.extractvariable;

public class Order {
    public double quantity;
    public double itemPrice;

    public Order(double quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }
}
