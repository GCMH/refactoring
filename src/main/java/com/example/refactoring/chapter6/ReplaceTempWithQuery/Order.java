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
        double basePrice = this.quantity * this.item.price;
        double discountFactor = 0.98;
        if(basePrice > 1000.0){
            discountFactor -= 0.3;
        }
        return basePrice * discountFactor;
    }


}
