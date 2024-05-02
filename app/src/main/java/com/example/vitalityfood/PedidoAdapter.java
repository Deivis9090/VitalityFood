package com.example.vitalityfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.PedidoViewHolder> {
    private List<Pedido> orderList;

    public PedidoAdapter(List<Pedido> orderList) {
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public PedidoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pedido, parent, false);
        return new PedidoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PedidoViewHolder holder, int position) {
        Pedido pedido = orderList.get(position);
        holder.bind(pedido);
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public static class PedidoViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewPedido;

        public PedidoViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewPedido = itemView.findViewById(R.id.textViewPedido);
        }

        public void bind(Pedido pedido) {
            // Aquí configuras los datos del pedido en las vistas
            String orderDetails = "Mesa: " + pedido.getId_mesa() + ", Status: " + pedido.getStatus();
            textViewPedido.setText(orderDetails);
        }
    }
}

