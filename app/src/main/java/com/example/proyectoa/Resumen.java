package com.example.proyectoa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        Intent intent = getIntent();
        String size = intent.getExtras().getString("Size");
        String tipo = intent.getExtras().getString("Tipo");
        TextView txt = findViewById(R.id.txtTipo);
        txt.setText(tipo);
        TextView txt1 = findViewById(R.id.txtTama);
        txt1.setText(size);
    }
}
