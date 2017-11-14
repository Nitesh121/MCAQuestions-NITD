package com.example.niteshjha.mca_nitd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by niteshjha on 03-09-2017.
 */

public class MyDataBase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="db_details";
    Context context;

    public MyDataBase(Context context) {
       super(context,DATABASE_NAME,null,1);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String Qry = "create table User_Details(name text,contact text)";
        db.execSQL(Qry);
        Toast.makeText(context,"table created",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
