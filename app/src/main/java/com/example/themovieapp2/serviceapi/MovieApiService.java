package com.example.themovieapp2.serviceapi;

import com.example.themovieapp2.models.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("movie/popular")
    Call<Result> getPopularMovie(@Query("api_key")String apiKey);
}
