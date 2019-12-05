package com.example.app_brakers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    private RecyclerView recyclerViewProducto;
    private RecyclerViewAdaptador adaptadorProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        recyclerViewProducto=(RecyclerView)findViewById(R.id.reciclerProductos);
        recyclerViewProducto.setLayoutManager(new LinearLayoutManager(this));

        adaptadorProducto=new RecyclerViewAdaptador(obtenerProductos());
        recyclerViewProducto.setAdapter(adaptadorProducto);
    }

    public List<ProductoModelo> obtenerProductos(){
        List<ProductoModelo> producto=new ArrayList<>();
        producto.add(new ProductoModelo("Torta Corazon","S/.25",R.drawable.torta));
        producto.add(new ProductoModelo("Chocolate Corazon","S/.20",R.drawable.chocolate));
        producto.add(new ProductoModelo("Muffin Corazon","S/.15",R.drawable.muffin));
        producto.add(new ProductoModelo("Galleta Personalizada","S./30",R.drawable.galleta));
        producto.add(new ProductoModelo("Torta Tres Leches","S./35",R.drawable.torta));

        return producto;
    }
}
