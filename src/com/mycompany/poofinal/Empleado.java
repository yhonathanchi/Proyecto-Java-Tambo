package com.mycompany.poofinal;

public class Empleado extends Persona {
    
    private String puesto;
    private double sueldo;
    private String sede;
    
    public Empleado(String puesto, String sede, double sueldo, String nombre) {
        super(nombre);
        this.puesto = puesto;
        this.sede = sede;
        this.sueldo = sueldo;
    }
    
    public String getInfo() {
        return "Empleado: " + nombre + " | Puesto: " + puesto
             + " | Sueldo: S/ " + sueldo + " | Sede: " + sede;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String getSede() {
        return sede;
    }
    
    public void setSede(String sede) {
        this.sede = sede;
    }
}
