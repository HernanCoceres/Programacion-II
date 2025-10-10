/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author hcoceres
 */
abstract class Figura {
    protected String nombre; // Protected para acceso en subclases

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularArea(); 

    public String getNombre() {
        return nombre;
    }
}