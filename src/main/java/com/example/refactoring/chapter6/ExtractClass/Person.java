package com.example.refactoring.chapter6.ExtractClass;

public class Person {
    String name;

    TelephoneNumber telephoneNumber;

    public Person() {
        this.telephoneNumber = new TelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
