package com.example.refactoring.chapter6.ReplacePrimitiveWithObject;

import lombok.Data;

@Data
public class Order {

    Priority priority;

    public Priority getPriority(){
        return this.priority;
    }
}
