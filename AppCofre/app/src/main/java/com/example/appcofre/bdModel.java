package com.example.appcofre;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class bdModel extends SQLiteOpenHelper {

    public bdModel(Context context){

    }
    private static String dbNome = "dbCredencial";
    private static int dbVersao = 1;
    private static String Tabela = "tblCredencial";
    private static String Id = "idCredencial";
    private static String Usuario = "usuarioCredencial";
    private static String Senha = "senhaCredencial";
    private static String CmdSQL = "";









    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}