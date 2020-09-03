package com.mvmapp.app.repositories;

import com.mvmapp.app.app.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.mvmapp.app.app.RetrofitClient.getInstance;

public class ForgetPasswordRepo {


    public void forgetPasssword(){

        Call<ResponseBody> call =RetrofitClient.getInstance().getApi().forgetUser();
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
