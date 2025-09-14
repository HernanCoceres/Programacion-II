/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion.a.poo;

/**
 *
 * @author Herna
 */
public class Tarea02_RegistroDeMascotas {
    public static void main(String[] args) {
        // Crear una mascota
        Mascota mascota = new Mascota("Luna", "Perro", 3);

        System.out.println("Información inicial:");
        mascota.mostrarInfo();

        // Simular el paso del tiempo
        mascota.cumplirAnios();
        mascota.cumplirAnios();

        System.out.println("\nDespués de cumplir años:");
        mascota.mostrarInfo();
    }

    // Clase Mascota
    public static class Mascota {
        private String nombre;
        private String especie;
        private int edad;

        // Constructor
        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        // Mostrar información
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Especie: " + especie);
            System.out.println("Edad: " + edad + " años");
        }

        // Cumplir años
        public void cumplirAnios() {
            edad++;
        }
    }
}

