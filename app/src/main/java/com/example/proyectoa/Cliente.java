package com.example.proyectoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Cliente extends AppCompatActivity {


    ProgressBar barra;
    boolean size = false;
    String tama = "";
    boolean type = false;
    String tipo = "";
    int progress = 0;
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
        if (progress == 0 && size == false)
            progress = 50;
        else if (progress == 50 && size == false)
            progress = 100;
        size = true;
        tama = "Pequeño";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void BebidaMediana(View v){
        if (progress == 0 && size == false)
            progress = 50;
        else if (progress == 50 && size == false)
            progress = 100;
        size = true;
        tama = "Mediano";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }

    public void BebidaGrande(View v){
        if (progress == 0 && size == false)
            progress = 50;
        else if (progress == 50 && size == false)
            progress = 100;
        size = true;
        tama = "Grande";
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
        tipo = "Fría";
        barra.setProgress(progress);
        textView = findViewById(R.id.PorcentajeTxt);
        textView.setText(progress + "%");
    }


    public void btnConfirmar(View v){
        if (progress==100){
            Intent intent = new Intent(this, Resumen.class);
            intent.putExtra("Size", tama);
            intent.putExtra("Tipo", tipo);
            startActivity(intent);
        }
        else{
            Context context = getApplicationContext();
            CharSequence text;
            if (size == false)
                text = "No ha seleccionado tamaño";
            else
                text = "No ha seleccionado tipo";

            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
