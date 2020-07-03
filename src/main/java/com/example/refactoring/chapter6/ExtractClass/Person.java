package com.example.refactoring.chapter6.ExtractClass;

public class Person {
    String naem;

    String officeAreaCode;

    String officeCode;


    public String getTelephoneNumber() {
        return this.officeAreaCode + this.officeCode;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }
}
