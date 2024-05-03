package com.example.vitalityfood;

public class Pedido {
    private String nombre;
    private double precio;
    private String status;

    public Pedido(String nombre, double precio) {
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

