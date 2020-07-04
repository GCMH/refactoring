package com.example.refactoring.chapter6.InlineClass;

public class ShippingCompany {


    private String trackingInformation;
    private Integer trackingNumber;

    public void setTrackingInformation(String trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    public String trackingInfo(){
        return this.display();
    }



    public void setShippingCompany(String shippingCompany) {
        this.trackingInformation = shippingCompany;
    }

    public Integer getTrackingNumber() {
        return this.trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String display(){
        return this.trackingInformation.toString() + this.trackingNumber;
    }
}
