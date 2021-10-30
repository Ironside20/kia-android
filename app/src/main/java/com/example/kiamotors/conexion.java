package com.example.kiamotors;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Date;

public class conexion extends SQLiteOpenHelper {

    private static final String Nombre_BD="conexion.bd";
    private static final int Version_BD=1;
    private static final String Tabla_kia = "CREATE TABLE KIA(CODIGO TEXT PRIMARY KEY, MODELO TEXT, COLOR TEXT, CARGO DE PERSONA TEXT, CHASIS DEL VEHICULO TEXT, FECHA DE INGRESO DATE, AÑO DE FABRICACION DATE)";

    public conexion(Context context) {
        super(context, Nombre_BD, null, Version_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tabla_kia);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + Tabla_kia);
        db.execSQL(Tabla_kia);
    }

    public void agregarDetalles (String codigo, String modelo, String color, String cargoPersona, String chasisVehiculo, String fechaIngreso, String añoFabricacion){
        SQLiteDatabase bd=getWritableDatabase();
        if (bd!=null){
            bd.execSQL("INSERTE INTO KIA VALUES ('"+codigo+"', '"+modelo+", '"+color+", '"+cargoPersona+", '"+chasisVehiculo+", '"+fechaIngreso+", '"+añoFabricacion+")");
            bd.close();
        }
    }
}

