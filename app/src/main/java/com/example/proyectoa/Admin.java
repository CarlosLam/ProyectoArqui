package com.example.proyectoa;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Admin extends AppCompatActivity {

    private TextView tvCantsmall, tvCantMed, tvCantGBig, tvCantSoda, tvCantHot, tvCantCold, txtCantidadBebidas;
    String tipo, size, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        tvCantsmall = findViewById(R.id.tvCantSmall);
        tvCantMed = findViewById(R.id.tvCantMed);
        tvCantGBig = findViewById(R.id.tvCantBig);

        tvCantSoda = findViewById(R.id.tvCantSoda);
        tvCantHot = findViewById(R.id.tvCantHot);
        tvCantCold = findViewById(R.id.tvCantCold);

        txtCantidadBebidas = findViewById(R.id.txtCantidadBebidas);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://34.220.148.142:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        Call<Value> callTotal = api.getTotal();
        callTotal.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                txtCantidadBebidas.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });


        Call<Value> callSmall = api.getSizeSmall();
        callSmall.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                tvCantsmall.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });

        Call<Value> callMed = api.getSizeMediano();
        callMed.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                tvCantMed.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });

        Call<Value> callBig = api.getSizeGrande();
        callBig.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                tvCantGBig.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });


        Call<Value> callGaseosa = api.getTipoGaseosa();
        callGaseosa.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                tvCantSoda.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });

        Call<Value> callCaliente = api.getTipoCaliente();
        callCaliente.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                tvCantHot.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });

        Call<Value> callFria = api.getTipoFria();
        callFria.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
                String value = response.body().getData();
                tvCantCold.setText(value);
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });
    }
}

