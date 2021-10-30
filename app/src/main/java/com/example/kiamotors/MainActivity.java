package com.example.kiamotors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ventanaMostrar;
    Button ventanaRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ventanaMostrar= findViewById(R.id.btn_mostrar);
        ventanaMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vMostrar= new Intent(MainActivity.this,mostrar.class);
                startActivity(vMostrar);
            }
        });

        ventanaRegistrar=findViewById(R.id.btn_registrar);
        ventanaRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vRegistrar= new Intent(MainActivity.this,registrar.class);
                startActivity(vRegistrar);
            }
        });

        }
    }
