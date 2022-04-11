package tech.ericwathome.recess.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import tech.ericwathome.recess.model.Auth;
import tech.ericwathome.recess.model.Login;
import tech.ericwathome.recess.model.Student;

public interface UserApi {
    @POST("auth/login")
    Call<Auth> loginUser(@Body Login login);

    @GET("parents/id/{parentId}/students")
    Call<List<Student>> allStudents(@Path("parentId") Long parentId);
}
