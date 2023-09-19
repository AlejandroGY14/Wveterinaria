package com.example.veterinaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btiniciarsesion;

    TextView etregistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadUI();

        btiniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciosesion();
            }
        });

        etregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrousuario();
            }
        });
    }

    private void iniciosesion(){

        Intent intent = new Intent(getApplicationContext(), introinicio.class);

        startActivity(intent);

    }

    private void registrousuario(){

        Intent intent = new Intent(getApplicationContext(), registrarse.class);

        startActivity(intent);
    }

    private void loadUI(){
        btiniciarsesion = findViewById(R.id.btiniciarsesion);
        etregistro = findViewById(R.id.etregistro);
    }
}