package com.example.sjapp;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface retrofitInterface {

        @POST("/login")
        Call<Void> executeLogin(@Body HashMap<String, String> map);

        @POST("/direction")
        Call<Void> putDirection(@Body HashMap<String, String> map);

}
