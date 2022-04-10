package tech.ericwathome.recess.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    public RetrofitBuilder() {
    }

    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://recess-learning.herokuapp.com/api/v1/auth/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
