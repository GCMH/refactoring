package com.example.refactoring.chapter6.ChangeValueToReference;

public class Customer {

    private String number;
    private Customer customer;

    Customer(String number, Customer customer){
        this.number = number;
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

