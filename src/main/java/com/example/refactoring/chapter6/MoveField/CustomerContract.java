package com.example.refactoring.chapter6.MoveField;

import java.time.LocalDateTime;

public class CustomerContract {

    LocalDateTime startDate;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
