package com.mycompany.poofinal;

import java.util.ArrayList;

public class AdminTambo {
    private ArrayList<Empleado> empleados;
    private ArrayList<Sede> sedes;
    
    public AdminTambo() {
        empleados = new ArrayList<>();
        sedes = new ArrayList<>();
        
        sedes.add(new Sede("Ate", "Calle Patitos 123", 14500));
        sedes.add(new Sede("Santa Anita", "Av. Metropolitana", 777));
        sedes.add(new Sede("La Molina", "Lima Este", 301206));
        empleados.add(new Empleado("Almacenero", "Ate", 666, "Charlie"));
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }
    
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas.");
        } else {
            System.out.println("Sedes registradas:");
            for (Sede s : sedes) {
                System.out.println("-" + s.getNombre());
            }
        }
    }
    
    public String mostrarHistorialTexto() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n~~~ Historial de empleados ~~~\n");
        if (empleados.isEmpty()) {
            sb.append("No hay empleados registrados.\n");
        } else {
            for (Empleado e : empleados) {
                sb.append(e.getInfo()).append("\n");
            }
        }
        
        sb.append("\n~~~ Historial de sedes ~~~\n");
        if (sedes.isEmpty()) {
            sb.append("No hay sedes registradas.\n");
        } else {
            for (Sede s : sedes) {
                sb.append(s.getInfo()).append("\n");
            }
        }
        return sb.toString();
    }
    
    public void cambiarSedeEmpleado(String nombreEmp, String nuevaSede) {
        boolean encontrado = false;
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombreEmp)) {
                e.setSede(nuevaSede);
                System.out.println("Sede actualizada!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Error. No se encontro al empleado.");
        }
    }
    
    public void modificarSueldo(String nombreEmp, double nuevoSueldo) {
        boolean encontrado = false;
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombreEmp)) {
                e.setSueldo(nuevoSueldo);
                System.out.println("Sueldo actualizado!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Error. No se encontro al empleado.");
        }
    }
    
    public void modificarVentas(String nombreSede, int nuevasVentas) {
        boolean encontrado = false;
        
        for (Sede s : sedes) {
            if (s.getNombre().equalsIgnoreCase(nombreSede)) {
                s.setVentas(nuevasVentas);
                System.out.println("Ventas actualizadas!");
                encontrado = true;
                
                if (s.getVentas() >= 10000) {
                    System.out.println("La sede alcanza la meta de ventas! Bonificacion del 15% aplicada =)");
                    for (Empleado e : empleados) {
                        if (e.getSede().equalsIgnoreCase(nombreSede)) {
                            double nuevoSueldo = e.getSueldo() + e.getSueldo() * 0.15;
                            e.setSueldo(nuevoSueldo);
                            System.out.println("-" + e.getNombre() + " ahora gana S/ " + nuevoSueldo);
                        }
                    }
                } else {
                    System.out.println("La sede no alcanzo la meta. Sin bonificación.");
                }
            }
        }
        
        if (!encontrado) {
            System.out.println("Error. No se encontro la sede.");
        }
    }
    
    public void modificarMeta(double nuevaMeta) {
        for (Sede s : sedes) {
            s.setMeta(nuevaMeta);
        }
        System.out.println("Meta actualizada a " + nuevaMeta + " para todas las sedes.");
    }
    
    public void mostrarReportes() {
        System.out.println("\n~~~ Reporte General Tambo ~~~");
        for (Sede s : sedes) {
            System.out.println("Sede: " + s.getNombre());
            System.out.println("Ventas: " + s.getVentas());
            System.out.println(s.calcularBonificacion());
            System.out.println();
        }
    }
}
