/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collecciones;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hcoceres
 */
public class Universidad {
    private final String nombre;
    final List<Profesor> profesores;
    private final List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }


    // Alta de Profesor
    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            this.profesores.add(p);
            System.out.println(" Profesor agregado: " + p.getNombre());
        } else {
            System.out.println(" ERROR: Ya existe profesor con ID: " + p.getId());
        }
    }

    // Alta de Curso
    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            this.cursos.add(c);
            System.out.println(" Curso agregado: " + c.getNombre());
        } else {
            System.out.println(" ERROR: Ya existe curso con código: " + c.getCodigo());
        }
    }

    // Asignacion con Sincronizacin
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println(" ERROR: Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println(" ERROR: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }
        
        // método del curso ques mantiene la invariante automaticamente
        curso.setProfesor(profesor); 
        System.out.println("Asignación completada: " + curso.getNombre() + " -> " + profesor.getNombre());
    }

    // Listado
    public void listarProfesores() {
        System.out.println("\n--- PROFESORES DE " + nombre.toUpperCase() + " ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\n--- CURSOS DE " + nombre.toUpperCase() + " ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Busqueda
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    // Baja de curso
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relacion con el profesor
            if (curso.getProfesor() != null) {
                // Se usa el metodo del profesor para asegurar que rompe la relacion bidireccional
                curso.getProfesor().eliminarCurso(curso); 
            }
            this.cursos.remove(curso);
            System.out.println(" Curso eliminado: " + curso.getNombre());
            return true;
        }
        System.out.println(" ERROR: Curso con código " + codigo + " no encontrado para eliminar.");
        return false;
    }

    // Baja de pofesor
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            List<Curso> cursosDictados = new ArrayList<>(profesor.getCursos());
            for (Curso c : cursosDictados) {
                c.quitarProfesor(); // El curso queda sin profesor
            }
           
            this.profesores.remove(profesor);
            System.out.println(" Profesor eliminado: " + profesor.getNombre());
            return true;
        }
        System.out.println(" ERROR: Profesor con ID " + id + " no encontrado para eliminar.");
        return false;
    }
}