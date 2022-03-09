package com.codewithmurali.assignment04;

public class User {
    private String signupDate;
    private String currentDate;

    public User(String signupDate, String currentDate) {
        this.signupDate = signupDate;
        this.currentDate = currentDate;
    }

    public String getSignupDate() {
        return signupDate;
    }

    public String getCurrentDate() {
        return currentDate;
    }
}
