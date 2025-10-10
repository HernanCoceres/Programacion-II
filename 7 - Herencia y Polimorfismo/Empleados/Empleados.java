/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleados;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hcoceres
 */
public class Empleados {
    public static void main(String[] args) {
        System.out.println("\nEmpleados");
        
        // Upcasting: Lista de Empleado (la superclase)
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Ana", 3000.0));
        listaEmpleados.add(new EmpleadoTemporal("Beto", 160, 15.0));
        listaEmpleados.add(new EmpleadoPlanta("Carlos", 3500.0));
        listaEmpleados.add(new EmpleadoTemporal("Diana", 80, 20.0));

        for (Empleado emp : listaEmpleados) {
            // Polimorfismo: llama al método de la subclase correcta
            System.out.println("Nombre: " + emp.getNombre() + ", Sueldo: " + emp.calcularSueldo());
            
            // Uso de instanceof para clasificar
            if (emp instanceof EmpleadoPlanta) {
                System.out.println(" (Tipo: Empleado de Planta)");
                // Aquí se podría hacer Downcasting si se necesitara un método específico
                // EmpleadoPlanta planta = (EmpleadoPlanta) emp;
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println(" (Tipo: Empleado Temporal)");
            }
        }
    }
}