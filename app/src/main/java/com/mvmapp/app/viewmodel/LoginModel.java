package com.mvmapp.app.viewmodel;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginModel extends ViewModel {
     MutableLiveData<String>email = new MutableLiveData<>();
     MutableLiveData<String>password = new MutableLiveData<>();

   // public User user;
    private Context context;



    public void onSubmitClick(){


        Toast.makeText(context,"Hello Javatpoint",Toast.LENGTH_SHORT).show();
    }

}
