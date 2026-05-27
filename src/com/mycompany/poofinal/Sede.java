package com.mycompany.poofinal;

public class Sede {
    
    private String nombre;
    private String ubicacion;
    private int ventas;
    private double meta = 10000;
    
    public Sede(String nombre, String ubicacion, int ventas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.ventas = ventas;
    }
    
    public String getInfo() {
        return "Sede: " + nombre + " | Ubicacion: " + ubicacion
             + " | Ventas: " + ventas + " | " + calcularBonificacion();
    }
    
    public String calcularBonificacion() {
        String bonif;
        if (ventas >= meta) {
            bonif = ("Alcanzo la meta de "+meta+" ventas (+15% bonificacion)!");
        } else {
            bonif = ("No alcanzo la meta de "+meta+" ventas");
        }
        return bonif;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public int getVentas() {
        return ventas;
    }
    
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    public double getMeta() {
        return meta;
    }
    
    public void setMeta(double meta) {
        this.meta = meta;
    }
}
