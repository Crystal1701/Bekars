package com.example.app_brakers;

public class ProductoModelo {
    private String Nombre, Precio;
    private int imgProducto;

    public ProductoModelo() {

    }

    public ProductoModelo(String nombre, String precio, int imgProducto) {
        Nombre = nombre;
        Precio = precio;
        this.imgProducto = imgProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public int getImgProducto() {
        return imgProducto;
    }

    public void setImgProducto(int imgProducto) {
        this.imgProducto = imgProducto;
    }
}
