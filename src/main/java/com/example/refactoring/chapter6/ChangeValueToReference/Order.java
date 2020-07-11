package com.example.refactoring.chapter6.ChangeValueToReference;

public class Order {

    private MfRespository mfRespository = new MfRespository();

    private final Customer customer;
    private String number;

    public Order(String number, Customer customer) {
        this.number = number;
        this.customer = mfRespository.registerCustomer(customer.getId());
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
