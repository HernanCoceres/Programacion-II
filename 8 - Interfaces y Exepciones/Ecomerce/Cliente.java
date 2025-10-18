/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecomerce;

/**
 *
 * @author hcoceres
 */
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Notificable
    @Override
    public void notificar(String mensaje) {
        System.out.println("✉️ Notificación para " + nombre + ": " + mensaje);
    }
}