package com.example.refactoring.chapter6.ChangeFunctionDeclaratio;

import java.util.ArrayList;
import java.util.List;

public class Book {

    public List<Customer> _reservations = new ArrayList<>();

    public void addReservation(Customer customer){
        zz_addReservation(customer, false);
    }

    public void zz_addReservation(Customer customer, boolean isPro){
        this._reservations.add(customer);
    }
}
