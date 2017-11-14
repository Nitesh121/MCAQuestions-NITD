package com.example.niteshjha.mca_nitd;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sign extends AppCompatActivity {

    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        et1=(EditText)findViewById(R.id.NAME);
        et2=(EditText) findViewById(R.id.Contact);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==android.R.id.home ){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

public  void Sign(View view){

    String name=et1.getText().toString().trim();
    String contact=et2.getText().toString().trim();


    if(name.isEmpty()) {
        et1.requestFocus();
        et1.setError("Enter name");
    }
        else if(contact.isEmpty()) {
        et2.requestFocus();
        et2.setError("enter contact number");

    }
    else if(contact.length()!=10) {
        et2.setError("Contact should be of 10 digit");
        et2.requestFocus();
    }
    else{
        MyDataBase mdb=new MyDataBase(this);
        SQLiteDatabase db=mdb.getWritableDatabase();
        String Qry="insert into User_Details values('"+name+"','"+contact+"')";

        db.execSQL(Qry);
        Toast.makeText(this,"user insert",Toast.LENGTH_LONG).show();
        finish();

    }


        }
    }








