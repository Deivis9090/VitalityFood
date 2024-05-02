package com.example.vitalityfood;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class BarraActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPedidos;
    private PedidoAdapter pedidoAdapter;
    private List<Pedido> orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barra_layout);

        recyclerViewPedidos = findViewById(R.id.recyclerViewPedidos);
        recyclerViewPedidos.setLayoutManager(new LinearLayoutManager(this));
        orderList = new ArrayList<>();
        pedidoAdapter = new PedidoAdapter(orderList);
        recyclerViewPedidos.setAdapter(pedidoAdapter);

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference docRef = db.collection("orden").document("orden");

        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()) {
                    Pedido pedido = documentSnapshot.toObject(Pedido.class);
                    orderList.add(pedido);
                    pedidoAdapter.notifyDataSetChanged();
                } else {
                    Log.d("BarraActivity", "El documento 'orden' no existe");
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.e("BarraActivity", "Error al obtener el documento 'orden': " + e.getMessage());
            }
        });
    }
}

