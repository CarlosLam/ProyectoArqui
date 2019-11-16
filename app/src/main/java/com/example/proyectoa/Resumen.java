package com.example.proyectoa;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Resumen extends AppCompatActivity {
    private Button btnConfirmar;
    String size, tipo;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://34.220.148.142:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    API api = retrofit.create(API.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        Intent intent = getIntent();
        size = intent.getExtras().getString("Size");
        tipo = intent.getExtras().getString("Tipo");
        TextView txt = findViewById(R.id.txtTipo);
        txt.setText(tipo);
        TextView txt1 = findViewById(R.id.txtTama);
        txt1.setText(size);
        btnConfirmar = (Button) findViewById(R.id.btnConfirmarRes);
    }

    public void btnConfirmarVoid(View v) {

        Drink drink = new Drink(tipo, size, 0);
        Call<Drink> call = api.PostData(drink);

        call.enqueue(new Callback<Drink>() {
            @Override
            public void onResponse(Call<Drink> call, Response<Drink> response) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, "Gracias por su compra", duration);
                toast.show();
            }

            @Override
            public void onFailure(Call<Drink> call, Throwable t) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, t.getMessage(), duration);
                toast.show();
            }
        });


    }


}
