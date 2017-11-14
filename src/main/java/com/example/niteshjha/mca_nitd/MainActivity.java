package com.example.niteshjha.mca_nitd;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfRenderer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    PdfDocument pdfDocument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public  void Reg(View v)
    {
        Intent i= new Intent(this,Sign.class);
        startActivity(i);
    }
    public  void log(View v) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }



}
