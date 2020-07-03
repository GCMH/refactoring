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

    public String getOfficeAreaCode() {
        return this.telephoneNumber.getOfficeAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber.setOfficeAreaCode(officeAreaCode);
    }

    public String getOfficeCode() {
        return this.telephoneNumber.getOfficeCode();
    }

    public void setOfficeCode(String officeCode) {
        this.telephoneNumber.getOfficeCode();
    }

    public String getTelephoneNumber(){
        return this.telephoneNumber.getTelephoneNumber();
    }
}
