package com.rajibhidayat.uts_rajibhidayat182101923.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/users";
    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit = new  Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}