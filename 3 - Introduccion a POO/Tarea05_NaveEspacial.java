/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion.a.poo;

/**
 *
 * @author Herna
 */
public class Tarea05_NaveEspacial {
    public static void main(String[] args) {
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Explorer", 50);

        // Intentar avanzar sin recargar
        System.out.println("Intentando avanzar 100 unidades sin recargar:");
        nave.avanzar(100);

        // Recargar combustible
        System.out.println("\nRecargando 30 unidades de combustible:");
        nave.recargarCombustible(30);

        // Avanzar correctamente
        System.out.println("\nAvanzando 60 unidades:");
        nave.avanzar(60);

        // Mostrar estado final
        System.out.println("\nEstado final de la nave:");
        nave.mostrarEstado();
    }

    // Clase NaveEspacial
    public static class NaveEspacial {
        private String nombre;
        private int combustible;
        private final int limiteCombustible = 100;

        public NaveEspacial(String nombre, int combustibleInicial) {
            this.nombre = nombre;
            this.combustible = Math.min(combustibleInicial, limiteCombustible);
        }

        public void despegar() {
            if (combustible >= 10) {
                combustible -= 10;
                System.out.println("La nave ha despegado.");
            } else {
                System.out.println("Combustible insuficiente para despegar.");
            }
        }

        public void avanzar(int distancia) {
            int consumo = distancia / 2; // 1 unidad de combustible por cada 2 de distancia
            if (combustible >= consumo) {
                combustible -= consumo;
                System.out.println("La nave avanzo " + distancia + " unidades.");
            } else {
                System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
            }
        }

        public void recargarCombustible(int cantidad) {
            if (combustible + cantidad <= limiteCombustible) {
                combustible += cantidad;
                System.out.println("Combustible recargado correctamente.");
            } else {
                System.out.println("No se puede superar el limite de " + limiteCombustible + " unidades.");
            }
        }

        public void mostrarEstado() {
            System.out.println("Nombre de la nave: " + nombre);
            System.out.println("Combustible restante: " + combustible);
        }
    }
}

