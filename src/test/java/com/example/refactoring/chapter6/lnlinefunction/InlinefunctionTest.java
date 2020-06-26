package com.example.refactoring.chapter6.lnlinefunction;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.refactoring.chapter6.lnlinefunction.Inlinefunction.rating;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InlinefunctionTest {

    @Test
    public void should_return_2_when_call_rating_given_numberOfLateDeliveries_than_great_5(){
        Driver adriver = new Driver();
        adriver.numberOfLateDeliveries = 6;
        assertTrue(rating(adriver) == 2);
    }

    @Test
    public void should_return_1_when_call_rating_given_numberOfLateDeliveries_than_less_5(){
        Driver adriver = new Driver();
        adriver.numberOfLateDeliveries = 4;
        assertTrue(rating(adriver) == 1);
    }
}