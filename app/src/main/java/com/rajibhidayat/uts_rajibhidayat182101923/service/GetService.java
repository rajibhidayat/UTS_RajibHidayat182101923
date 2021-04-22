package com.rajibhidayat.uts_rajibhidayat182101923.service;

import com.rajibhidayat.uts_rajibhidayat182101923.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
