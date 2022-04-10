package tech.ericwathome.recess.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import tech.ericwathome.recess.model.Auth;
import tech.ericwathome.recess.model.Login;

public interface LoginApi {
    @POST("login")
    Call<Auth> loginUser(@Body Login login);
}
