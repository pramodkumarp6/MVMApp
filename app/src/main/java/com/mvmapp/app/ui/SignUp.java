package com.mvmapp.app.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.mvmapp.app.R;
import com.mvmapp.app.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {

     private ActivitySignUpBinding activitySignUpBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySignUpBinding  = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
    }
}