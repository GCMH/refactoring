package com.example.refactoring.chapter6.ChangeValueToReference;

public class Customer {

    private String id;

    Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

