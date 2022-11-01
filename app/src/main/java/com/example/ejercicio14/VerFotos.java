package com.example.ejercicio14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ejercicio14.Config.Operaciones;
import com.example.ejercicio14.Config.SQLiteConexion;
import com.example.ejercicio14.Config.Fotos;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class VerFotos extends AppCompatActivity {

    SQLiteConexion conexion;
    ListView lista;
    ArrayList<Fotos> listaContactos;
    ArrayList <String> ArregloContactos;
    Button alcbtnAtras, btnVerImagen;
    Intent intent;
    Fotos fotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_fotos);


        conexion = new SQLiteConexion(this, Operaciones.NameDatabase,null,1);


        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_checked,ArregloContactos);
        lista.setAdapter(adp);

    }
}