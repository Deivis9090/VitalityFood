package com.example.vitalityfood;

public class PedidoCocina {
    private String nombre;
    private double precio;
    private String status;

    public PedidoCocina(String nombre, double precio, String status) {
        this.nombre = nombre;
        this.precio = precio;
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getStatus() {
        return status;
    }
}

