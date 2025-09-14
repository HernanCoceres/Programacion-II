/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccion.a.poo;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class Tarea01_RegistroDeEstudiantes {
            
    public static void main(String[] args) {
        Scanner mi = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese nombre: ");
        String nombre = mi.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = mi.nextLine();

        System.out.print("Ingrese curso: ");
        String curso = mi.nextLine();

        System.out.print("Ingrese calificación inicial: ");
        int calificacion = mi.nextInt();

        // Instanciar estudiante
        Estudiante estudiante = new Estudiante(nombre, apellido, curso, calificacion);

        // Mostrar información inicial
        System.out.println("\nInformación del estudiante:");
        estudiante.mostrarInfo();

        // Aumentar calificación
        estudiante.subirCalificacion(5);
        System.out.println("\nDespués de subir calificación:");
        estudiante.mostrarInfo();

        // Disminuir calificación
        estudiante.bajarCalificacion(3);
        System.out.println("\nDespués de bajar calificación:");
        estudiante.mostrarInfo();

        mi.close();
    }

    // Clase Estudiante
    public static class Estudiante {
        private String nombre;
        private String apellido;
        private String curso;
        private int calificacion;

        //PAra crear el estudiante
        public Estudiante(String nombre, String apellido, String curso, int calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        // Mostrar información
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Curso: " + curso);
            System.out.println("Calificación: " + calificacion);
        }

        // Subir calificación
        public void subirCalificacion(int puntos) {
            calificacion += puntos;
        }

        // Bajar calificación
        public void bajarCalificacion(int puntos) {
            calificacion -= puntos;
        }
    }
}

