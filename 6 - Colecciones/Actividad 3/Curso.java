/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collecciones;

public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // sin profe inicio
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevoProfesor) {
        //  Si ya tiene un profesorse se borra de la lista del profe anterior
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.getCursos().remove(this); 
        }
        
        // Asigna el nuevo profesor
        this.profesor = nuevoProfesor;

        // Si el nuevo profesor no es null este curso debe estar en su lista
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }
    
    public void quitarProfesor() {
        this.profesor = null;
    }

    //  mostrar Info
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.println(" Código: " + codigo + " | Nombre: " + nombre + " | Profesor: " + nombreProfesor);
    }
}