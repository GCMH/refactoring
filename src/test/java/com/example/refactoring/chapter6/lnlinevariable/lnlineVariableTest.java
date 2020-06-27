package com.example.refactoring.chapter6.lnlinevariable;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.refactoring.chapter6.lnlinevariable.lnlineVariable.check;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class lnlineVariableTest {

    @Test
    public void should_return_true_when_call_check(){
        Order order = new Order();
        order.basePrice = 900;
        assertFalse(check(order));

        order.basePrice = 1100;
        assertTrue(check(order));

    }
}