package com.example.vitalityfood;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class LoginActivity extends AppCompatActivity {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private String typeSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        Button btnLogin = findViewById(R.id.btnLogin);
        Spinner typeSpinner = findViewById(R.id.typeSpinner);
        EditText user = findViewById(R.id.editTextText);
        EditText pass = findViewById(R.id.editTextTextPassword2);




        // Type User Selection

        String[] roles = {"Cliente", "Administrador", "Cocina", "Mesero", "Barra", "Host"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, roles);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        typeSpinner.setAdapter(adapter);
        typeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                typeSelected = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable userdb = user.getText();
                Editable passdb = pass.getText();

                String userDB = String.valueOf(userdb);
                String passDB = String.valueOf(passdb);

                if (typeSelected != null) {

                    FirebaseFirestore db = FirebaseFirestore.getInstance();
                    CollectionReference usuariosRef = db.collection("users");

                    usuariosRef.whereEqualTo("user", userDB)
                            .whereEqualTo("role", typeSelected)
                            .get()
                            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                @Override
                                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                    if (task.isSuccessful()) {
                                        for (QueryDocumentSnapshot document : task.getResult()) {
                                            String passwordDB = document.getString("pass");
                                            String userRole = document.getString("role");
                                            if (passwordDB.equals(passDB)) {
                                                // Contraseña coincidente, permitir acceso a la siguiente pantalla
                                                if (userRole.equals("Barra")) {
                                                    startActivity(new Intent(LoginActivity.this, BarraActivity.class));
                                                } else if (userRole.equals("Cliente")) {
                                                    startActivity(new Intent(LoginActivity.this, MenuActivity.class));
                                                } else if (userRole.equals("Cocina")) {
                                                    startActivity(new Intent(LoginActivity.this, CocinaActivity.class));
                                                } else {
                                                    startActivity(new Intent(LoginActivity.this, MenuActivity.class));
                                                }
                                                Toast.makeText(LoginActivity.this, "Iniciando...", Toast.LENGTH_SHORT).show();
                                                finish(); // Finaliza la actividad actual para evitar que el usuario regrese aquí usando el botón "Atrás"
                                                return;
                                            }

                                        }
                                        // Si llegamos aquí, no se encontró un usuario con los datos proporcionados
                                        Toast.makeText(LoginActivity.this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                                    } else {
                                        // Error al consultar la base de datos
                                        Log.d("Firestore", "Error al obtener documentos: ", task.getException());
                                    }
                                }
                            });

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Por favor, selecciona un rol para iniciar sesión", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

