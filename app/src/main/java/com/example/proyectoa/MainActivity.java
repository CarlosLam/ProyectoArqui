package com.example.proyectoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCliente(View view) {
        Intent intent = new Intent(this, Cliente.class);
        startActivity(intent);
    }

    public void abirAdmin(View view){
        Intent intent = new Intent(this, Admin.class);
        startActivity(intent);
    }
}

