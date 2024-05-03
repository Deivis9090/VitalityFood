package com.example.vitalityfood;

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

    private static final String TAG = "BarraActivity";

    private RecyclerView recyclerViewPedidos;
    private PedidoAdapter pedidoAdapter;
    private List<Pedido> pedidoList;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barra_layout);

        recyclerViewPedidos = findViewById(R.id.recyclerViewPedidos);
        recyclerViewPedidos.setHasFixedSize(true);
        recyclerViewPedidos.setLayoutManager(new LinearLayoutManager(this));

        pedidoList = new ArrayList<>();
        pedidoAdapter = new PedidoAdapter(this, pedidoList); // Inicializa el adaptador aquí
        recyclerViewPedidos.setAdapter(pedidoAdapter); // Configura el RecyclerView con el adaptador

        db = FirebaseFirestore.getInstance();

        // Realizar consulta para obtener los pedidos
        obtenerPedidos();
    }

    private void obtenerPedidos() {
        db.collection("orden")
                .document("01")
                .collection("bebida")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot document : task.getResult()) {
                                // Obtén el valor del campo precio_unitario
                                Object precioUnitarioObj = document.get("precio_unitario");
                                Object statusObj = document.get("status");

                                // Por ejemplo, agrega un nuevo Pedido a la lista
                                String nombre = document.getString("nombre");
                                if (precioUnitarioObj != null && statusObj != null) {
                                    double precioUnitario = ((Number) precioUnitarioObj).doubleValue();
                                    String status = (String) statusObj;
                                    pedidoList.add(new Pedido(nombre, precioUnitario, status));
                                } else {
                                    // Maneja el caso en el que el valor de precio_unitario o status sea nulo
                                    Log.e(TAG, "El campo precio_unitario o status es nulo en el documento " + document.getId());
                                }
                            }
                            // Notifica al adaptador que los datos han cambiado
                            pedidoAdapter.notifyDataSetChanged();
                        } else {
                            Log.w(TAG, "Error obteniendo documentos.", task.getException());
                        }
                    }
                });
    }
}
