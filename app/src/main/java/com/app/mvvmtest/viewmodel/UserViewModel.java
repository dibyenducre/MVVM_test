package com.app.mvvmtest.viewmodel;

import android.databinding.BaseObservable;

import com.app.mvvmtest.R;
import com.app.mvvmtest.model.User;

public class UserViewModel extends BaseObservable {

    public String email, password;
    public String emailHint, passwordHint;

    public User user;

    public UserViewModel(User user) {

        this.emailHint = user.emailHint;
        this.passwordHint = user.passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.ed_mail);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.ed_password);
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
