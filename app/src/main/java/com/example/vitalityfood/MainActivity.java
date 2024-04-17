package com.example.vitalityfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encuentra el botón por su ID
        Button button = findViewById(R.id.button);

        // Agrega un listener de clic al botón
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para abrir la actividad ContentActivity
                Intent intent = new Intent(MainActivity.this, ContentMain.class);
                startActivity(intent); // Inicia la actividad
            }
        });
    }
}
