package com.example.refactoring.chapter6.HideDelegate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getManager());
    }
}
