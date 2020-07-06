package com.example.refactoring.chapter6.MoveField;

import java.time.LocalDateTime;

public class Customer {
    String name;
    String discountRate;

    CustomerContract contract;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    void becomePreferred(){
        this.discountRate += 0.3;
    }

    public CustomerContract getContract() {
        return contract;
    }

    public void setContract(CustomerContract contract) {
        this.contract = contract;
    }

    public void setStartDate(LocalDateTime startDate){
        this.contract.startDate = startDate;
    }

    Object applyDiscount(Amount amount) {
        return amount.subtract(amount.multiply(this.discountRate));
    }
}
