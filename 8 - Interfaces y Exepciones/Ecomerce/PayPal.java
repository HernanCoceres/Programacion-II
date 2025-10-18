/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecomerce;

/**
 *
 * @author hcoceres
 */
public class PayPal implements PagoConDescuento {
    private static final double DESCUENTO = 0.05; // 5% de descuento

    @Override
    public double aplicarDescuento(double montoBase) {
        return montoBase * (1 - DESCUENTO);
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("PayPal: Monto original $" + monto + ". Aplicando 5% de descuento.");
        System.out.println("Procesando pago de $" + montoConDescuento + " con PayPal.");
        return true;
    }
}