package com.example.vitalityfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_menu);

        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
    }
}