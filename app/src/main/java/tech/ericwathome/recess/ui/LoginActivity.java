package tech.ericwathome.recess.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import tech.ericwathome.recess.R;
import tech.ericwathome.recess.network.LoginApi;
import tech.ericwathome.recess.network.RetrofitBuilder;
import tech.ericwathome.recess.model.Auth;
import tech.ericwathome.recess.model.Login;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "tag";
    Button button;

    RetrofitBuilder retrofitBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.loginButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.loginButton) {
            login();
        }
    }

    private void login() {
        Login login = new Login("ericwathome007@gmail.com", "password123");

        retrofitBuilder = new RetrofitBuilder();
        Retrofit retrofit = retrofitBuilder.getRetrofit();
        LoginApi loginApi = retrofit.create(LoginApi.class);

        Call<Auth> call = loginApi.loginUser(login);
        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(@NonNull Call<Auth> call, @NonNull Response<Auth> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    Toast.makeText(LoginActivity.this, "AuthToken" + response.body().getUser().getAccess_token(), Toast.LENGTH_SHORT).show();
                } else {
                    Log.d("TAG", "onResponse: response error");
                }
            }

            @Override
            public void onFailure(@NonNull Call<Auth> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure: connection failure - " + t.getMessage());
            }
        });
    }
}