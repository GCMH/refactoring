package com.example.refactoring.chapter6.EncapsulateCollection;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Course {
    String name;

    boolean isAdvanced;
}
