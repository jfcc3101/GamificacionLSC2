package com.example.lscud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;

public class DiasLunes extends AppCompatActivity {

    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dias_lunes);

        button = (ImageButton) findViewById(R.id.izquierda);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitydiadomingo();
            }
        });
        button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitydiamartes();
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

    public void openActivitydiadomingo() {
        Intent intent = new Intent(this, DiasDomingo.class);
        startActivity(intent);

    }

    public void openActivitydiamartes() {
        Intent intent = new Intent(this, DiasMartes.class);
        startActivity(intent);

    }
}
