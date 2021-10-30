package com.example.kiamotors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class registrar extends AppCompatActivity {

    Button registrarV;
    Button volver;
    EditText codigo, modelo, color, cargo, persona, chasis, ingreso, fabricacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        codigo=(EditText)findViewById(R.id.reg_codigo);
        modelo=(EditText)findViewById(R.id.reg_modelo);
        color=(EditText)findViewById(R.id.reg_color);
        cargo=(EditText)findViewById(R.id.reg_persona);
        chasis=(EditText)findViewById(R.id.reg_chasis);
        ingreso=(EditText)findViewById(R.id.reg_ingreso);
        fabricacion=(EditText)findViewById(R.id.reg_fabricacion);
        registrarV=(Button)findViewById(R.id.btn_registrar);

        final conexion conexionBd= new conexion(getApplicationContext());
        registrarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conexionBd.agregarDetalles(codigo.getText().toString(), modelo.getText().toString(), color.getText().toString(), persona.getText().toString(), chasis.getText().toString(), ingreso.getText().toString(), fabricacion.getText().toString());
                Toast.makeText(getApplicationContext(),"SE AGREGÓ CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });

        volver=findViewById(R.id.btn_volver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vMain= new Intent(registrar.this, MainActivity.class);
                startActivity(vMain);
            }
        });
    }

}