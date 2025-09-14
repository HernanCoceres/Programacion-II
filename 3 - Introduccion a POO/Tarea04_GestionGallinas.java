/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion.a.poo;

/**
 *
 * @author Herna
 */
public class Tarea04_GestionGallinas {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(101, 2, 5);
        Gallina gallina2 = new Gallina(102, 1, 0);

        // Simular acciones
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.envejecer();
        gallina2.ponerHuevo();

        // Mostrar estado final
        System.out.println("Estado de la gallina 1:");
        gallina1.mostrarEstado();

        System.out.println("\nEstado de la gallina 2:");
        gallina2.mostrarEstado();
    }

    // Clase Gallina
    public static class Gallina {
        private int idGallina;
        private int edad;
        private int huevosPuestos;

        public Gallina(int idGallina, int edad, int huevosPuestos) {
            this.idGallina = idGallina;
            this.edad = edad;
            this.huevosPuestos = huevosPuestos;
        }

        public void ponerHuevo() {
            huevosPuestos++;
        }

        public void envejecer() {
            edad++;
        }

        public void mostrarEstado() {
            System.out.println("ID: " + idGallina);
            System.out.println("Edad: " + edad);
            System.out.println("Huevos puestos: " + huevosPuestos);
        }
    }


}
