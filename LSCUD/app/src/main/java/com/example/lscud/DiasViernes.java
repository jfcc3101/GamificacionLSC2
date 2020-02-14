package com.example.lscud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
public class DiasViernes extends AppCompatActivity {

    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dias_viernes);

        button = (ImageButton) findViewById(R.id.izquierda);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitydiajueves();
            }
        });
        button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitydiasabado();
            }
        });
        button = (ImageButton) findViewById(R.id.inicio);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void openActivitydiajueves() {
        Intent intent = new Intent(this, DiasJueves.class);
        startActivity(intent);

    }

    public void openActivitydiasabado() {
        Intent intent = new Intent(this, DiasSabado.class);
        startActivity(intent);

    }
}
