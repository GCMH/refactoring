package com.example.refactoring.chapter6.ChangeReferenceToValue;


public class Preson {

    private TelephoneNumber telephoneNumber;

    Preson() {
        this.telephoneNumber = new TelephoneNumber();
    }

    public String getOfficeAreaCode() {
        return this.telephoneNumber.areaCode;
    }

    public void setOfficeAreaCode(String arg) {
        this.telephoneNumber.areaCode = arg;
    }

    public String getOfficeNumber() {
        return this.telephoneNumber.number;
    }

    public void setOfficeNumber(String arg) {
        this.telephoneNumber.number = arg;
    }
}
