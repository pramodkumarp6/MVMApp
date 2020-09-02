package com.mvmapp.app.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.mvmapp.app.R;
import com.mvmapp.app.databinding.ActivityForgetPasswordBinding;


public class ForgetPassword extends AppCompatActivity {

    private ActivityForgetPasswordBinding activityForgetPasswordBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityForgetPasswordBinding = DataBindingUtil.setContentView(this,R.layout.activity_forget_password);
    }
}