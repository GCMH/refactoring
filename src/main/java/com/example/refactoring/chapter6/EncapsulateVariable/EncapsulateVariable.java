package com.example.refactoring.chapter6.EncapsulateVariable;

public class EncapsulateVariable {
    public static void main(String[] args) {
        Owner defaultOwner = new Owner("fistName", "lastName");

        Spaceship spaceship = new Spaceship();
        spaceship.owner = defaultOwner;


    }


}
