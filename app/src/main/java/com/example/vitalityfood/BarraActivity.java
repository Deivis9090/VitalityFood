package com.example.vitalityfood;


import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;




public class BarraActivity extends AppCompatActivity {
  private RecyclerView recyclerViewPedidos;
    private PedidoAdapter pedidoAdapter;
    private List<Pedido> pedidoList;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barra_layout);

        recyclerViewPedidos = findViewById(R.id.recyclerViewPedidos);
        recyclerViewPedidos.setLayoutManager(new LinearLayoutManager(this));

        pedidoList = new ArrayList<>();
        pedidoAdapter = new PedidoAdapter(this, pedidoList);
        recyclerViewPedidos.setAdapter(pedidoAdapter);

        db = FirebaseFirestore.getInstance();

        // Accede a la colección 'orden'
        db.collection("orden")
                .document("01")
                .collection("bebida")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot document : task.getResult()) {
                                // Obtén los datos de cada documento y agrega un nuevo Pedido a la lista
                                String nombre = document.getString("nombre");
                                double precioUnitario = document.getDouble("precio_unitario");
                                String status = document.getString("status");
                                pedidoList.add(new Pedido(nombre, precioUnitario, status));
                            }
                            // Notifica al adaptador que los datos han cambiado
                            pedidoAdapter.notifyDataSetChanged();
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });
    }
}
