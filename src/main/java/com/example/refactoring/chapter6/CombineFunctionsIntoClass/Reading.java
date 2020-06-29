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
}
