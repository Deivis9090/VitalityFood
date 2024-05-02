package com.example.vitalityfood;

public class Pedido {
    private String extras;
    private String fyh;
    private int id_mesa;
    private int id_orden;
    private int id_sesion;
    private String status;

    // Constructor vacío requerido por Firebase
    public Pedido() {}

    // Getters y setters para los campos de pedido
    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getFyh() {
        return fyh;
    }

    public void setFyh(String fyh) {
        this.fyh = fyh;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public int getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(int id_sesion) {
        this.id_sesion = id_sesion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

