package com.example.refactoring.chapter6.ChangeValueToReference;

import java.util.HashMap;

public class MfRespository {
    Repositroy repositroyData;

    public void init() {
        this.repositroyData = new Repositroy();
        this.repositroyData.customers = new HashMap();
    }

    public Customer registerCustomer(String id) {
        if (!repositroyData.customers.containsKey(id)) {
            repositroyData.customers.put(id, new Customer(id));
        }
        return (Customer) repositroyData.customers.get(id);
    }

    public Customer findCustomer(String id) {
        return (Customer) repositroyData.customers.get(id);
    }

}
