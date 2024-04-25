package com.example.retrofit_opendb_test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QuizService {

    @GET("api.php")
    Call<Question> getQuestions(@Query("amount") int amount, @Query("category") int category,
                                @Query("difficulty") String difficulty, @Query("type") String type);
}
