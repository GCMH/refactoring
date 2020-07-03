package com.example.refactoring.chapter6.ReplaceTempWithQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class Order {

    double quantity;
    Item item;

    public double getPrice(){
        double discountFactor = 0.98;
        if(this.getBasePrice() > 1000.0){
            discountFactor -= 0.3;
        }
        return this.getBasePrice() * discountFactor;
    }

    public double getBasePrice(){
        return this.quantity * this.item.price;
    }



}
