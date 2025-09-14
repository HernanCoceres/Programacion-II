/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion.a.poo;

/**
 *
 * @author Herna
 */
public class Tarea03_EncapsulamientoConLaCLaseLibro {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupery", 1943);

        // Mostrar informacion inicial
        System.out.println("Informacion inicial del libro:");
        mostrarInformacion(libro);

        // Intentar modificar el año con un valor invalido
        System.out.println("\nIntentando asignar anio invalido (1200):");
        libro.setAnioPublicacion(1200); // No deberia cambiar

        // Intentar modificar el año con un valor valido
        System.out.println("\nAsignando anio valido (2000):");
        libro.setAnioPublicacion(2000); // Deberia cambiar

        // Mostrar informacion final
        System.out.println("\nInformacion final del libro:");
        mostrarInformacion(libro);
    }

    // Metodo auxiliar para mostrar los datos del libro
    public static void mostrarInformacion(Libro libro) {
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Anio de publicacion: " + libro.getAnioPublicacion());
    }

    // Clase Libro con encapsulamiento
    public static class Libro {
        private String titulo;
        private String autor;
        private int anioPublicacion;

        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            setAnioPublicacion(anioPublicacion); // Usamos el setter para validar
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

        // Setter con validacion
        public void setAnioPublicacion(int anio) {
            if (anio >= 1500 && anio <= 2025) {
                this.anioPublicacion = anio;
            } else {
                System.out.println("Anio invalido. Debe estar entre 1500 y 2025.");
            }
        }
    }
}

