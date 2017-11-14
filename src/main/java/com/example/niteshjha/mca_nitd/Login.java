package com.example.niteshjha.mca_nitd;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText =(EditText)findViewById(R.id.LoginContact);
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



    public void userValidate(View v)
    {

        String contact= editText.getText().toString().trim();


           //Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
           MyDataBase mb=new MyDataBase(this);
           SQLiteDatabase db=mb.getWritableDatabase();
           String Qry="select name from User_Details where contact='"+contact+"'";
           Cursor c=db.rawQuery(Qry,null);
           boolean res=c.moveToFirst();

           if (res)
           {
               String name= c.getString(0);


               Toast.makeText(this,"welcome page"+name,Toast.LENGTH_SHORT).show();
               Intent intent= new Intent(this,CourceDetails.class) ;
               startActivity(intent);



           }else
           {
               Toast.makeText(this,"invalid",Toast.LENGTH_SHORT).show();
           }




    }
}
