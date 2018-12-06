package com.app.mvvmtest.model;

public class User {

    public String email, password;
    public String emailHint, passwordHint;

    public User() {
    }

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
