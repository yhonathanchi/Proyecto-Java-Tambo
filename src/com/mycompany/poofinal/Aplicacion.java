package com.mycompany.poofinal;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        AdminTambo tambo = new AdminTambo();
        
        int op;
        
        do {
            System.out.println("\n\t*.*.*.*.* Sistema de Gestion Tambo *.*.*.*.*");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Registrar sede");
            System.out.println("3. Mostrar historial");
            System.out.println("4. Modificar datos de empleado");
            System.out.println("5. Modificar ventas de sede");
            System.out.println("6. Modificar meta de ventas");
            System.out.println("7. Generar reportes");
            System.out.println("8. Salir");
            do {
                System.out.print("\nIngrese la opcion (1-8): ");
                op = sc.nextInt();
                sc.nextLine();
                if (op < 1 || op > 8) {
                    System.out.println("Error. Opcion no valida. Intente de nuevo.");
                }
            } while (op < 1 || op > 8);
            
            switch (op) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Puesto: ");
                    String puesto = sc.nextLine();
                    System.out.print("Sueldo: ");
                    double sueldo = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("\nSedes disponibles:");
                    tambo.mostrarSedes();
                    System.out.print("Ingrese el nombre de la sede: ");
                    String nombreSede = sc.nextLine();
                    
                    Empleado empleado = new Empleado(puesto, nombreSede, sueldo, nombre);
                    tambo.agregarEmpleado(empleado);
                    System.out.println(" Empleado registrado exitosamente!\n");
                    break;
                    
                case 2:
                    System.out.print("Nueva sede: ");
                    String nuevaSede = sc.nextLine();
                    System.out.print("Ubicacion de la sede: ");
                    String ubicacion = sc.nextLine();
                    System.out.print("Ventas mensuales de la sede: ");
                    int ventas = sc.nextInt();
                    Sede sede = new Sede(nuevaSede, ubicacion, ventas);
                    tambo.agregarSede(sede);
                    System.out.println(" Sede registrada exitosamente!\n");
                    break;
                    
                case 3:
                    System.out.println(tambo.mostrarHistorialTexto());
                    break;
                    
                case 4:
                    System.out.print("Ingrese el nombre del empleado a modificar: ");
                    String nomEmp = sc.nextLine();
                    System.out.println("[1] Cambiar sede\n[2] Modificar sueldo\n");
                    int op2 = sc.nextInt();
                    sc.nextLine();
                    
                    if (op2 == 1) {
                        System.out.print("Nueva sede: ");
                        String nuevaSedeEmp = sc.nextLine();
                        tambo.cambiarSedeEmpleado(nomEmp, nuevaSedeEmp);
                    } else if (op2 == 2) {
                        System.out.print("Nuevo sueldo: ");
                        double nuevoSueldo = sc.nextDouble();
                        tambo.modificarSueldo(nomEmp, nuevoSueldo);
                    } else {
                        System.out.println("Error. Opcion no valida.");
                    }
                    break;
                    
                case 5:
                    System.out.print("Ingrese el nombre de la sede: ");
                    String nombreSedeVentas = sc.nextLine();
                    System.out.print("Nuevas ventas: ");
                    int nuevasVentas = sc.nextInt();
                    sc.nextLine();
                    tambo.modificarVentas(nombreSedeVentas, nuevasVentas);
                    break;
                    
                case 6:
                    System.out.print("Ingrese nueva meta de ventas: ");
                    double nuevaMeta = sc.nextDouble();
                    sc.nextLine();
                    tambo.modificarMeta(nuevaMeta);
                    break;
                    
                case 7:
                    tambo.mostrarReportes();
                    break;
                    
                default:
                    System.out.println("Finalizando programa...");
                    System.exit(0);
                    break;
            }
            
        } while (op != 8);
    }
}
