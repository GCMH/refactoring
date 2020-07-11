package com.example.refactoring.chapter6.ChangeReferenceToValue;


public class Preson {

    private TelephoneNumber telephoneNumber;
    private String offerNumber;
    private String areaCode;

    Preson(String areCode, String number) {
        this.telephoneNumber = new TelephoneNumber(areCode, number);
    }

    public String getOfficeAreaCode() {
        return this.telephoneNumber.areaCode;
    }

    public void setOfficeAreaCode(String arg) {
        this.telephoneNumber = new TelephoneNumber(arg, this.areaCode);
    }

    public String getOfficeNumber() {
        return this.telephoneNumber.number;
    }

    public void setOfficeNumber(String arg) {
        this.telephoneNumber = new TelephoneNumber(this.offerNumber, arg);
    }
}
