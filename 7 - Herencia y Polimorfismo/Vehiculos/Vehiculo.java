/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author hcoceres
 */
class Vehiculo {
    // Atributos privados para control de acceso (Modificadores de acceso)
    private String marca;
    private String modelo;

    // Constructor que usa 'super' si hubiera una superclase, pero aquí inicializa
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Vehiculo: Marca = " + marca + ", Modelo = " + modelo);
    }
    
    // Getters para acceso controlado (buena práctica)
    public String getMarca() {
        return marca;
    }
}