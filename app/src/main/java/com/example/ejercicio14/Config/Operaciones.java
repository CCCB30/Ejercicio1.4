package com.example.ejercicio14.Config;

import java.sql.Blob;

public class Operaciones {

    public static final String NameDatabase = "PM01DB";

    public static String tblFotos = "fotos";

    public static final String id = "id";
    public static final String nombre = "nombre";
    public static final String descripcion = "descripcion";
    public static final String foto = "foto";


    public static final String createTableFotos = "CREATE TABLE " + tblFotos +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nombre TEXT, descripcion TEXT, foto BLOB)";

    public static final String dropTableFotos = "DROP TABLE IF EXIST" + tblFotos;
}
