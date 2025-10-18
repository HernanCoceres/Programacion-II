/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecomerce;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author hcoceres
 */
public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private String estado = "PENDIENTE";
    private Notificable cliente; // Para la interfaz Notificable

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    // Implementacion de Pagable: Suma el total de todos los productos
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

//El Pedido notifica al Cliente (Notificable) al cambiar de estado
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
        }
    }
}