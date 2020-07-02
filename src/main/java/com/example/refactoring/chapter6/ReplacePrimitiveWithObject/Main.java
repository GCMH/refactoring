package com.example.refactoring.chapter6.ReplacePrimitiveWithObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(new Order(), new Order(), new Order());

        int length = orders.stream()
                .filter(e -> e.getPriority().toString().equals("aa") ||
                        e.getPriority().toString().equals("sss"))
                .collect(Collectors.toList())
                .size();


        orders.stream()
                .filter(e -> e.getPriority().isEquals(new Priority("11")))
                .collect(Collectors.toList())
                .size()
    }
}
