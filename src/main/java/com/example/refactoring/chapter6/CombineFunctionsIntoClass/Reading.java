package com.example.refactoring.chapter6.CombineFunctionsIntoClass;

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

    public  double calculateBaseCharge(Reading aReading) {
        return baseRate(aReading.month, aReading.year) * aReading.quantity;
    }

    private  double taxThreshold(Integer year) {
        return 0;
    }

    private double baseRate(Integer month, Integer year) {
        return 0;
    }
}
