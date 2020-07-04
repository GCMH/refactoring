package com.example.refactoring.chapter6.InlineClass;

public class ShippingCompany {

    TrackingInformation trackingInformation;


    public TrackingInformation getTrackingInformation() {
        return trackingInformation;
    }

    public void setTrackingInformation(TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    public String trackingInfo(){
        return this.trackingInformation.display();
    }

    public void setShippingCompany(ShippingCompany shippingCompany){
        this.trackingInformation.shippingCompany = shippingCompany;
    }
}
