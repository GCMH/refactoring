package com.example.refactoring.chapter6.ReplaceInlineCodeWithFunctionCall;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA", "BB");
        boolean flag = list.contains("AA");

    }
}
