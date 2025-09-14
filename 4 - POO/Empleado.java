/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Herna
 */
public class Empleado {
    // Atributos privados para encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estatico para contar el total de empleados
    private static int totalEmpleados = 0;

    // Constructor 1: Recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor 2: Recibe solo nombre y puesto, asignando valores por defecto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // Asigna un ID automatico y unico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.00; // Salario por defecto
    }

    // Metodos Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    // Mtodos Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metodo sobrecargado: Aumenta el salario por porcentaje
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            this.salario += this.salario * (porcentajeAumento / 100);
        }
    }

    // Metodo sobrecargado: Aumenta el salario por cantidad fija
    public void actualizarSalario(int cantidadAumento) {
        if (cantidadAumento > 0) {
            this.salario += cantidadAumento;
        }
    }

    @Override
    public String toString() {
        return "Empleado [ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: $" + String.format("%.2f", this.salario) + "]";
    }

    // Método estático para mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}