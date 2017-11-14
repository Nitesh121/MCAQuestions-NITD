package com.example.niteshjha.mca_nitd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Third_Sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__sem);

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
    public void network(View v)
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem3net");
        startActivity(i);

    }
    public void algo(View v)
            
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem3algo");
        startActivity(i);

    }
    public void micro(View v)
    {
        Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem3micro");
        startActivity(i);

    }


}

