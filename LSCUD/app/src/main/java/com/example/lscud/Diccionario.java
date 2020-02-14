package com.example.lscud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Diccionario extends AppCompatActivity {

    PDFView Diccionario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diccionario);


        Diccionario = (PDFView) findViewById(R.id.pdfDiccionario);
        Diccionario.fromAsset("DiccionarioLSC.pdf").load();
    }
}
