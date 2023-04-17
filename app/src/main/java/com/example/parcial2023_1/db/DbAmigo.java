package com.example.parcial2023_1.db;

import static com.example.parcial2023_1.db.DbHelper.TABLE_AMIGO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbAmigo extends DbHelper {

    Context context;

    public DbAmigo(@Nullable Context context) {
        super(context);
        this.context = context;
    }


    public long insertarAmigo  (String nombre, String edad, String ciudad) {


        long id = 0;

        try {
            DbHelper dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("edad", edad);
            values.put("ciudad", ciudad);

            id = db.insert(TABLE_AMIGO, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return id;
    }

}
