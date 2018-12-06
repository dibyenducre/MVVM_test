package com.app.mvvmtest;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.app.mvvmtest.command.UserLogin;
import com.app.mvvmtest.databinding.ActivityMainBinding;
import com.app.mvvmtest.model.User;
import com.app.mvvmtest.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserViewModel userViewModel = new UserViewModel(new User("Email ID enter"," Enter password"));
        activityMainBinding.setLogin(userViewModel);

        activityMainBinding.setLoginClickEvent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,"==="+
                        activityMainBinding.getLogin().getEmail()+
                                "---"+activityMainBinding.getLogin().getPassword()
                        ,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
