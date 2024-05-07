package com.example.vitalityfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CocinaAdaptador extends RecyclerView.Adapter<CocinaAdaptador.ViewHolder> {

    private Context context;
    private List<Pedido> pedidoList;

    public CocinaAdaptador(Context context, List<Pedido> pedidoList) {
        this.context = context;
        this.pedidoList = pedidoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemcocina_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pedido pedido = pedidoList.get(position);

        holder.textViewNombre.setText(pedido.getNombre());
        holder.textViewPrecio.setText(String.format("$%.2f", pedido.getPrecio()));
        holder.textViewStatus.setText(pedido.getStatus());
    }

    @Override
    public int getItemCount() {
        return pedidoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNombre;
        TextView textViewPrecio;
        TextView textViewStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewPrecio = itemView.findViewById(R.id.textViewPrecio);
            textViewStatus = itemView.findViewById(R.id.textViewStatus);
        }
    }
}

