package com.example.refactoring.chapter6.ChangeReferenceToValue;

public class TelephoneNumber {
    public String areaCode;
    public String number;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
