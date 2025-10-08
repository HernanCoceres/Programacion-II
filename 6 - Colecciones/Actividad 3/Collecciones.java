/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collecciones;

/**
 *
 * @author hcoceres
 */
public class Collecciones {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Universidad u = new Universidad("Universidad Tech");
// creo cursos y profesoras agreg a la uni
        System.out.println("--- Tarea 1 & 2: Creación y Alta ---");
        
        // Profesores
        Profesor p1 = new Profesor("P101", "Dra. Sofía Pérez", "Inteligencia Artificial");
        Profesor p2 = new Profesor("P102", "Ing. Juan Gómez", "Bases de Datos");
        Profesor p3 = new Profesor("P103", "Lic. Ana Torres", "Desarrollo Web");

        u.agregarProfesor(p1);
        u.agregarProfesor(p2);
        u.agregarProfesor(p3);
        
        // Cursos
        Curso c1 = new Curso("IA01", "Introducción a la IA");
        Curso c2 = new Curso("DB01", "Modelado de Datos");
        Curso c3 = new Curso("WEB01", "Frontend Moderno");
        Curso c4 = new Curso("IA02", "Redes Neuronales");
        Curso c5 = new Curso("DB02", "Administración SQL");

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);
//asigno profesores a cursos
        System.out.println("\n--- Tarea 3: Asignación Inicial ---");
        u.asignarProfesorACurso("IA01", "P101"); // Sofía -> IA01
        u.asignarProfesorACurso("DB01", "P102"); // Juan -> DB01
        u.asignarProfesorACurso("WEB01", "P103"); // Ana -> WEB01
        u.asignarProfesorACurso("IA02", "P101"); // Sofía -> IA02
        u.asignarProfesorACurso("DB02", "P102"); // Juan -> DB02
// Listo cursos con profes y profes con cursos
        System.out.println("\n--- Tarea 4: Listado para verificación (Bidireccional) ---");
        u.listarCursos();
        u.listarProfesores();
//cambio profesor de curso y verifico
        System.out.println("\n--- Tarea 5: Cambio de Profesor (WEB01) ---");
        u.asignarProfesorACurso("WEB01", "P102"); 
        
        System.out.println("\nVerificación después del cambio:");
        u.buscarCursoPorCodigo("WEB01").mostrarInfo(); // deberia mostrar  Juan
        u.buscarProfesorPorId("P103").mostrarInfo();
        u.buscarProfesorPorId("P102").mostrarInfo();
        
   //borro un curso y verifico que ya no aparece en la lista del profesor
        System.out.println("\n--- Tarea 6: Eliminación de Curso (DB02) ---");
        u.eliminarCurso("DB02");
        
        System.out.println("\nVerificación de lista de Juan (P102):");
        u.buscarProfesorPorId("P102").mostrarInfo();
//remuevo profesor y dejo null en sus cirsos
        System.out.println("\n--- Tarea 7: Eliminación de Profesor (P101 - Sofía) ---");
        u.eliminarProfesor("P101");
        
        System.out.println("\nVerificación de cursos que dictaba Sofía:");
        u.buscarCursoPorCodigo("IA01").mostrarInfo();
        u.buscarCursoPorCodigo("IA02").mostrarInfo();
        // cantidad de cursos por profesor
        System.out.println("\n--- Tarea 8: Reporte de Cursos por Profesor (Actual) ---");
        for (Profesor p : u.profesores) {
            System.out.println("  " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}