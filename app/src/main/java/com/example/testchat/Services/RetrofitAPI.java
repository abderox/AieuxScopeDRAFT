package com.example.testchat.Services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAPI {
    private static Retrofit retrofit;
    public  static final String BASE_URL = "https://1f41-41-143-52-116.ngrok.io/";
    public  static  Retrofit getRetrofitInstance(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
