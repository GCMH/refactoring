package com.example.refactoring.chapter6.ReplacePrimitiveWithObject;

import com.example.refactoring.chapter6.SplitPhase.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Priority {
    public String value;



    @Override
    public String toString() {
        return value;
    }

    public boolean isEquals(Priority priority){
        return this.value.equals(priority.toString());
    }


}
