package com.example.niteshjha.mca_nitd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Fifth_Sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth__sem);

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
public void data(View v)
{
    Intent i=new Intent(this,WebView.class);
        i.putExtra("url", "sem5dw");
        startActivity(i);
}
}

