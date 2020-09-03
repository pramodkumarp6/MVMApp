package com.mvmapp.app.repositories;

import com.mvmapp.app.app.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepo {



    public void loginResponse(){

          String password=null;
          String email=null;

         Call<ResponseBody> call = RetrofitClient.getInstance().getApi().userLogin(email, password);

         call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

    }


}