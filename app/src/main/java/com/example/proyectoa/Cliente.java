package com.example.proyectoa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.gson.JsonElement;


public class Cliente extends AppCompatActivity {


    ProgressBar barra;
    boolean flag = false;
    String size = "";
    boolean type = false;
    String tipo = "";
    int progress = 0;
    String status;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        barra = (ProgressBar) findViewById(R.id.progressBar);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");

    }

    public void BebidaPequeña(View v){
        if (progress == 0 && flag == false)
            progress = 50;
        else if (progress == 50 && flag == false)
            progress = 100;
        flag = true;
        size = "Pequeña";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void BebidaMediana(View v){
        if (progress == 0 && flag == false)
            progress = 50;
        else if (progress == 50 && flag == false)
            progress = 100;
        flag = true;
        size = "Mediana";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void BebidaGrande(View v){
        if (progress == 0 && flag == false)
            progress = 50;
        else if (progress == 50 && flag == false)
            progress = 100;
        flag = true;
        size = "Grande";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void TipoGaseosa(View v){
        if (progress == 0 && type == false)
            progress = 50;
        else if (progress == 50 && type == false)
            progress = 100;
        type = true;
        tipo = "Gaseosa";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void TipoCaliente(View v){
        if (progress == 0 && type == false)
            progress = 50;
        else if (progress == 50 && type == false)
            progress = 100;
        type = true;
        tipo = "Caliente";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void TipoFria(View v){
        if (progress == 0 && type == false)
            progress = 50;
        else if (progress == 50 && type == false)
            progress = 100;
        type = true;
        tipo = "Fria";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }


    public void btnConfirmar(View v){
        if (progress==100){
            Intent intent = new Intent(this, Resumen.class);
            intent.putExtra("Size", size);
            intent.putExtra("Tipo", tipo);

            startActivity(intent);
        }
        else{
            Context context = getApplicationContext();
            CharSequence text;
            if (flag == false)
                text = "No ha seleccionado tamaño";
            else
                text = "No ha seleccionado tipo";

            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
