package com.example.refactoring.chapter6.extractfunction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class ExtractFunctionTest {

    @Test
    public void should_output_matching_result_when_call_printOwning() {
        ExtractFunction extractFunction = new ExtractFunction();

        Invoice invoice = new Invoice();
        invoice.customer = "hcf";
        invoice.orders = new Order[]{new Order(0)};

        LocalDate today = LocalDate.now();
        String due = today.plusDays(30).toString();

        assertTrue(extractFunction.printOwing(invoice).equals(
                "*******************\n" +
                        "***Customer Owes***\n" +
                        "*******************\n" +
                        "name:hcf\n" +
                        "amount:0\n" +
                        "due:" + due + "\n"));


        invoice.customer = "sss";
        invoice.orders = new Order[]{new Order(5), new Order(10)};

        assertTrue(extractFunction.printOwing(invoice).equals(
                "*******************\n" +
                        "***Customer Owes***\n" +
                        "*******************\n" +
                        "name:sss\n" +
                        "amount:15\n" +
                        "due:" + due + "\n"));
    }

}