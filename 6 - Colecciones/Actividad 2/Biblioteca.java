/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author hcoceres
 */
public class Biblioteca {
    private final String nombre;
    private final List<Libro> libros; 


    public Biblioteca(String nombre) {
        this.nombre = nombre;

        this.libros = new ArrayList<>(); 
    }

  
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println(" ERROR: Ya existe un libro con el ISBN: " + isbn);
            return;
        }
        
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println(" Libro agregado a '" + this.nombre + "': " + titulo);
    }

    // 2. listar Libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("️ La biblioteca '" + nombre + "' no tiene libros.");
            return;
        }
        System.out.println("\n--- LISTADO DE LIBROS DE: " + nombre.toUpperCase() + " ---");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // 3. buscar   por isbn
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // 4. elimina Libro
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            System.out.println("️ Libro eliminado: " + libroAEliminar.getTitulo());
            return true;
        }
        System.out.println("ERROR: No se encontró el libro con ISBN " + isbn + " para eliminar.");
        return false;
    }

    // 5. obtener CantidadLibros
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    // 6. filtrar Libros Anio
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        System.out.println("\n--- LIBROS PUBLICADOS EN EL AÑO: " + anio + " ---");
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
                libro.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println(" No hay libros publicados en " + anio + ".");
        }
        return filtrados;
    }

    // 7. mostrar Autores Disponibles
    public void mostrarAutoresDisponibles() {
        Set<String> autoresUnicos = new HashSet<>(); 
        
        System.out.println("\n--- AUTORES DE LIBROS DISPONIBLES EN LA BIBLIOTECA ---");
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor().getNombre() + " (" + libro.getAutor().getNacionalidad() + ")");
        }

        if (autoresUnicos.isEmpty()) {
            System.out.println("ℹ️ No hay autores registrados.");
            return;
        }

        for (String autor : autoresUnicos) {
            System.out.println("• " + autor);
        }
        System.out.println("-------------------------------------------------------");
    }
}