/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collecciones;

import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {
    private final ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // agregarProducto
    public void agregarProducto(Producto p) {
        // Validacion para evitar ids duplicados
        if (buscarProductoPorId(p.getId()) != null) {
            System.out.println(" ERROR: Ya existe un producto con el ID: " + p.getId());
            return;
        }
        this.productos.add(p);
        System.out.println(" Producto agregado: " + p.getNombre());
    }

    // listarProductos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("-------------------------------------");
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null; //sino lo encuentro
    }
    //  eliminar Producto
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            this.productos.remove(p);
            System.out.println("️ Producto eliminado: " + p.getNombre());
            return true;
        }
        System.out.println("ERROR: No se encontró el producto con ID " + id + " para eliminar.");
        return false;
    }

    //  actualizar Stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad); // Uso del setter del Producto
            System.out.println(" Stock actualizado para " + p.getNombre() + ". Nuevo stock: " + nuevaCantidad);
            return true;
        }
        System.out.println(" ERROR: No se encontró el producto con ID " + id + " para actualizar el stock.");
        return false;
    }

    // filtrar por Categoria
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        System.out.println("\n--- PRODUCTOS EN CATEGORÍA: " + categoria + " ---");
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
                p.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("️ No hay productos en la categoría " + categoria + ".");
        }
        System.out.println("-------------------------------------------------");
        return filtrados;
    }

    // obtenerTotalStock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8. obtener Product con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        return productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad))
                .orElse(null);
    }

    // filtrar productos por precio
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        System.out.println("\n--- PRODUCTOS CON PRECIO ENTRE $" + min + " y $" + max + " ---");
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
                p.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("️ No se encontraron productos en ese rango de precios.");
        }
        System.out.println("----------------------------------------------------------");
        return filtrados;
    }

    // mostrar categorias
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat + ": " + cat.getDescripcion());
        }
        System.out.println("------------------------------");
    }
}