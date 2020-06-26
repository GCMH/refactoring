package com.example.refactoring.chapter6.extractvariable;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.refactoring.chapter6.extractvariable.ExtractVariable.price;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ExtractVariableTest {

    @Test
    public void should_return_matching_price_when_call_price(){
        assertTrue(price(new Order(10, 5)) == 55.0);
        assertTrue(price(new Order(10, 6)) == 66.0);
        assertTrue(price(new Order(100, 6)) == 660.0);
    }
}