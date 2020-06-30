package com.example.refactoring.chapter6.CombineFunctionsIntoTransform;

public class Reading {
    String customer;
    Integer quantity;
    Integer month;
    Integer year;

    public Reading() {
    }

    public Reading(Reading reading){
        this.customer = reading.customer;
        this.quantity = reading.quantity;
        this.month = reading.month;
        this.year = reading.year;
    }

    public  double calculateBaseCharge() {
        return baseRate() * this.quantity;
    }

    public  double taxThreshold() {
        Integer year = this.year;
        return 0;
    }

    public double baseRate() {
        int i = this.month + this.year;
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
