package com.example.niteshjha.mca_nitd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Forth_Sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth__sem);

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



    public void wb(View v)
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem4th");
        startActivity(i);

    }
    public void machine(View v)
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem4thM");
        startActivity(i);

    }
    public void data(View v)
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem4thd");
        startActivity(i);

    }
    public void open(View v)
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem4tho");
        startActivity(i);

    }


}
