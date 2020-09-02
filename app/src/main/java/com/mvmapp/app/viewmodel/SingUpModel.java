package com.mvmapp.app.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SingUpModel extends ViewModel {

    MutableLiveData<String>email = new MutableLiveData<>();
    MutableLiveData<String>password = new MutableLiveData<>();
    MutableLiveData<String>name = new MutableLiveData<>();
    MutableLiveData<String>school = new MutableLiveData<>();

}
