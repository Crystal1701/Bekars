package com.example.app_brakers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, precio;
        ImageView fotoProducto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.tvProducto);
            precio=(TextView)itemView.findViewById(R.id.tvPrecio);
            fotoProducto= itemView.findViewById(R.id.imgProducto);
        }
    }
    public List<ProductoModelo> productoLista;

    public RecyclerViewAdaptador(List<ProductoModelo> productoLista) {
        this.productoLista = productoLista;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(productoLista.get(position).getNombre());
        holder.precio.setText(productoLista.get(position).getPrecio());
        holder.fotoProducto.setImageResource(productoLista.get(position).getImgProducto());
    }

    @Override
    public int getItemCount() {
        return productoLista.size();
    }
}
