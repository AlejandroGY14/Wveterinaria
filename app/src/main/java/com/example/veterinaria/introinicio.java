package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class introinicio extends AppCompatActivity {

    Button btregistrarmascota, btbuscar, btmostrardetalles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introinicio);

        loadUI();

        btregistrarmascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirregistro();
            }
        });

        btbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirbuscar();
            }
        });

        btmostrardetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirdetalles();
            }
        });
    }

    public void abrirregistro(){
        Intent intent = new Intent(getApplicationContext(), registromascota.class);

        startActivity(intent);
    }

    public void abrirbuscar(){
        Intent intent = new Intent(getApplicationContext(), buscar.class);

        startActivity(intent);
    }

    public void abrirdetalles(){
        Intent intent = new Intent(getApplicationContext(), listardatos.class);

        startActivity(intent);
    }


    private void loadUI(){
        btregistrarmascota = findViewById(R.id.btregistrarmascota);
        btbuscar = findViewById(R.id.btbuscar);
        btmostrardetalles = findViewById(R.id.btmostrardetalles);
    }
}