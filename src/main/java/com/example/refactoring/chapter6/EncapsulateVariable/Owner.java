package com.example.refactoring.chapter6.EncapsulateVariable;

public class Owner {

    public String firstName;

    public String lastName;

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Owner getDefault(){
        return this;
    }
}
