package com.example.refactoring.chapter6.SplitPhase;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MainTest {

    @Test
    public void should_return_cal_value_when_call_calPrice(){
        Product product = new Product();
        product.basePrice = 7.0;
        product.discountRate = 8.0;
        product.discountThreshold =  9.0;

        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.discountedFee = 6.0;
        shippingMethod.discountThreshold = 7.0;
        shippingMethod.feePerCase = 8.0;

        double v = Main.priceOrder(product, 2, shippingMethod);
        assertTrue(v == 26.0);
    }
}