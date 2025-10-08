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
public class Profesor {
    private final String id;
    private final String nombre;
    private final String especialidad;
    // La lista representa el lado "N" de la relación bidireccional
    private final List<Curso> cursos; 

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }

    // agregarCurso mantiene la invariante del lado del Profesor
    public void agregarCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
        }
        if (c.getProfesor() != this) {
            c.setProfesor(this); // Llama al metodo que sincroniza el lado del curso
        }
    }

    //  eliminar curso mantiene la invariante del lado del profesor
    public void eliminarCurso(Curso c) {
        if (this.cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.quitarProfesor();
            }
        }
    }
    
    //  listar Cursos
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("   [No dicta cursos actualmente]");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("   - [" + c.getCodigo() + "] " + c.getNombre());
        }
    }

    // mostrar Info
    public void mostrarInfo() {
        System.out.println(" ID: " + id + " | Nombre: " + nombre + " | Especialidad: " + especialidad);
        System.out.println("   Cursos dictados: " + cursos.size());
    }
}