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
     // 1 Creo la biblioteca
        System.out.println("--- Tarea 1: Creación de la Biblioteca ---");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central POO");
//2 Creo los 3 autores
        System.out.println("\n--- Tarea 2: Creación de Autores ---");
        Autor a1 = new Autor("AUT001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("AUT002", "Jane Austen", "Británica");
        Autor a3 = new Autor("AUT003", "Haruki Murakami", "Japonés");
        
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();
// 3 Agrego los libros
        System.out.println("\n--- Tarea 3: Agregar Libros ---");
        miBiblioteca.agregarLibro("978-01", "Cien años de soledad", 1967, a1);
        miBiblioteca.agregarLibro("978-02", "Orgullo y prejuicio", 1813, a2);
        miBiblioteca.agregarLibro("978-03", "Crónica de una muerte anunciada", 1981, a1); 
        miBiblioteca.agregarLibro("978-04", "Tokio Blues (Norwegian Wood)", 1987, a3);
        miBiblioteca.agregarLibro("978-05", "Emma", 1815, a2);

// 4 Listo todos los  libros con la info
        System.out.println("\n--- Tarea 4: Listar todos los libros ---");
        miBiblioteca.listarLibros();
// busco un libro por la isbn y muesto la info
        String isbnBusqueda = "978-04";
        System.out.println("\n--- Tarea 5: Buscar libro por ISBN (" + isbnBusqueda + ") ---");
        Libro libroEncontrado = miBiblioteca.buscarLibroPorIsbn(isbnBusqueda);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro con ISBN " + isbnBusqueda + " no encontrado.");
        }
// muestro libro segun año
        int anioFiltro = 1815;
        System.out.println("\n--- Tarea 6: Filtrar libros por año (" + anioFiltro + ") ---");
        miBiblioteca.filtrarLibrosPorAnio(anioFiltro);
// elimino un libro por su isbn y muestro el resto
        String isbnEliminar = "978-02";
        System.out.println("\n--- Tarea 7: Eliminar libro por ISBN (" + isbnEliminar + ") ---");
        miBiblioteca.eliminarLibro(isbnEliminar);
        miBiblioteca.listarLibros();

// muestro la cantidad total
        System.out.println("\n--- Tarea 8: Mostrar Cantidad Total de Libros ---");
        System.out.println("Total de libros en la biblioteca: " + miBiblioteca.obtenerCantidadLibros()); 
// muestro todos los autores
        miBiblioteca.mostrarAutoresDisponibles(); 
    }
}