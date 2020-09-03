package com.mvmapp.app.app;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("register")
    Call<ResponseBody> userLogin(
            @Field("email") String email,
            @Field("password") String password

    );

    @FormUrlEncoded
    @POST("")
    Call<ResponseBody>createUser(



    );
    @FormUrlEncoded
    @POST("forget")
    Call<ResponseBody> forgetUser();

}
