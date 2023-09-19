package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class registrarse extends AppCompatActivity {

    Button btRegistrarse, btIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        loadUI();

        btRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrocliente();
            }
        });

        btIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    iniciosesion();
            }
        });
    }

    private void iniciosesion(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }

    private void registrocliente(){
        Toast.makeText(this, "Registro con Exito", Toast.LENGTH_SHORT).show();
    }

    private void loadUI(){
        btRegistrarse = findViewById(R.id.btRegistrarse);
        btIniciar = findViewById(R.id.btIniciar);
    }
}