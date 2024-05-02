package com.example.vitalityfood;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.PedidoViewHolder> {

    private Context context;
    private List<Pedido> pedidoList;

    public PedidoAdapter(Context context, List<Pedido> pedidoList) {
        this.context = context;
        this.pedidoList = pedidoList;
    }

    @NonNull
    @Override
    public PedidoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pedido, parent, false);
        return new PedidoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PedidoViewHolder holder, int position) {
        Pedido pedido = pedidoList.get(position);
        holder.textViewNombre.setText(pedido.getNombre());
        holder.textViewPrecio.setText(String.valueOf(pedido.getPrecio()));
        holder.textViewStatus.setText(pedido.getStatus()); // Establecer el estado del pedido
    }

    @Override
    public int getItemCount() {
        return pedidoList.size();
    }

    public static class PedidoViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNombre, textViewPrecio, textViewStatus;

        public PedidoViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewPrecio = itemView.findViewById(R.id.textViewPrecio);
            textViewStatus = itemView.findViewById(R.id.textViewStatus); // Obtener referencia del TextView del estado del pedido
        }
    }
}
