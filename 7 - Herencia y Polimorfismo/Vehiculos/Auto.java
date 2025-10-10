/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author hcoceres
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor que llama al constructor de la superclase (super(...))
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Inicializa atributos de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura del método (Polimorfismo / @Override)
    @Override
    public void mostrarInfo() {
        // Reutilización de código de la superclase
        super.mostrarInfo(); 
        System.out.println("  -> Tipo: Auto con " + cantidadPuertas + " puertas.");
    }
}