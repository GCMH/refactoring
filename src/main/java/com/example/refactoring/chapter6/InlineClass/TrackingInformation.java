package com.example.refactoring.chapter6.InlineClass;

public class TrackingInformation {
    ShippingCompany shippingCompany;
    Integer trackingNumber;


    public ShippingCompany getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompany shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public Integer getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String display(){
        return this.shippingCompany.toString() + this.trackingNumber;
    }
}
