package com.example.lscud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

public class NumeroTres extends AppCompatActivity {

    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_tres);

        button = (ImageButton) findViewById(R.id.izquierda);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitynumerodos();
            }
        });
        button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitynumerocuatro();
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

    public void openActivitynumerocuatro() {
        Intent intent = new Intent(this, NumeroCuatro.class);
        startActivity(intent);

    }

    public void openActivitynumerodos() {
        Intent intent = new Intent(this, NumeroDos.class);
        startActivity(intent);

    }
}
