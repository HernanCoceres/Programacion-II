/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecomerce;

/**
 *
 * @author hcoceres
 */
public class TarjetaCredito implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Credito.");
        return true;
    }
}
