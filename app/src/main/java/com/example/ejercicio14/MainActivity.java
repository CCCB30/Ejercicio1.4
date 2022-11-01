package com.example.ejercicio14;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.ejercicio14.Config.Operaciones;
import com.example.ejercicio14.Config.SQLiteConexion;

public class MainActivity extends AppCompatActivity {

    SQLiteConexion conexion = new SQLiteConexion(this, Operaciones.NameDatabase,null,1);
    SQLiteDatabase db;

    EditText txtnombre, txtdescripcion;
    ImageView foto;
    Button btnTomar, btnGuardar;

    static final int PETICION_ACCESO_CAM = 100;
    static final int TAKE_PIC_REQUEST = 101;
    Bitmap imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}