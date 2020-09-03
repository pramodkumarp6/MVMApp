package com.mvmapp.app.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mvmapp.app.R;
import com.mvmapp.app.databinding.ActivityLoginBinding;
import com.mvmapp.app.userDashboard.ProfileActivity;
import com.mvmapp.app.viewmodel.LoginModel;
import com.mvmapp.app.viewmodel.UserViewModelFactory;

public class Login extends AppCompatActivity {

  private ActivityLoginBinding activityLoginBinding;
  private UserViewModelFactory userViewModelFactory;
  private LoginModel loginModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding  = DataBindingUtil.setContentView(this, R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
      //  loginModel = userViewModelFactory.of(this, new UserViewModelFactory(this, new User())).get(LoginModel.class);
       // activityLoginBinding.setUserModel(loginModel);















        activityLoginBinding.textViewRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent sigup = new Intent(Login.this, ProfileActivity.class);
               startActivity(sigup);
            }
        });


        activityLoginBinding.textViewRegister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgetPassword = new Intent(Login.this,ForgetPassword.class);
                startActivity(forgetPassword);
            }
        });


    }


}