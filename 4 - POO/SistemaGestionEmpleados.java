/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Herna
 */
public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        // Instanciar empleados usando el primer constructor (todos los atributos)
        Empleado empleado1 = new Empleado(101, "Ana Lopez", "Gerente de Proyectos", 75000.00);
        Empleado empleado2 = new Empleado(102, "Carlos Ruiz", "Desarrollador Senior", 60000.00);

        // Instanciar empleados usando el segundo constructor (nombre y puesto)
        Empleado empleado3 = new Empleado("Marta Gomez", "Diseadora UX");
        Empleado empleado4 = new Empleado("David Perez", "Analista de Datos");
        
        System.out.println("--- Informacion inicial de los empleados ---");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        // Muestra el total de empleados creados con el mtodo estatico
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Aplicar los metodos de actualizacion de salario sobrecargados
        System.out.println("\n--- Aplicando aumentos salariales ---");
        
        // Actualizar salario de empleado1 con un porcentaje
        System.out.println("Salario de " + empleado1.getNombre() + " antes del aumento: $" + String.format("%.2f", empleado1.getSalario()));
        empleado1.actualizarSalario(10.0); // Aumento del 10%
        System.out.println("Salario de " + empleado1.getNombre() + " después del aumento del 10%: $" + String.format("%.2f", empleado1.getSalario()));

        // Actualizar salario de empleado2 con una cantidad fija
        System.out.println("\nSalario de " + empleado2.getNombre() + " antes del aumento: $" + String.format("%.2f", empleado2.getSalario()));
        empleado2.actualizarSalario(5000); // Aumento de 5000
        System.out.println("Salario de " + empleado2.getNombre() + " después del aumento de $5000: $" + String.format("%.2f", empleado2.getSalario()));
        
        // Imprimir la informacion actualizada de todos los empleados
        System.out.println("\n--- Información actualizada de todos los empleados ---");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
    }
}
