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
        Inventario inventario = new Inventario();
// Punto 1 crear los 5 productos
        System.out.println("--- Tarea 1: Creación y adición de productos ---");
        Producto p1 = new Producto("A001", "Laptop Gamer", 2500.50, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("A002", "Camiseta Algodón", 850.99, 50, CategoriaProducto.ROPA);
        Producto p3 = new Producto("A003", "Leche Descremada", 150.75, 120, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("A004", "Licuadora Pro", 1200.00, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A005", "Smartphone X", 3100.00, 25, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

  // 2 listar los productos
        inventario.listarProductos();
// 3 buscar por ID
        System.out.println("\n--- Tarea 3: Búsqueda por ID (A004) ---");
        Producto encontrado = inventario.buscarProductoPorId("A004");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto con ID A004 no encontrado.");
        }

// 4 mostrar por categoria
        System.out.println("\n--- Tarea 4: Filtrar por Categoría (ELECTRONICA) ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
//5 eliminar producto por id  y mostrar el resto
        System.out.println("\n--- Tarea 5: Eliminar producto (A003) ---");
        inventario.eliminarProducto("A003");
        inventario.listarProductos(); 
//Actualizar el stock de un producto
        System.out.println("\n--- Tarea 6: Actualizar stock (A001) ---");
        inventario.actualizarStock("A001", 8); 
        inventario.listarProductos();
// mostrar el stock disponible
        System.out.println("\n--- Tarea 7: Obtener Stock Total ---");
        System.out.println(" Stock total disponible en el inventario: " + inventario.obtenerTotalStock());

//obtener y mostrar el producto
        System.out.println("\n--- Tarea 8: Producto con Mayor Stock ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
//filtra productos por prefcio
        System.out.println("\n--- Tarea 9: Filtrar por Rango de Precios ---");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
//mostrar categorias disponivles con las descripciones 
        System.out.println("\n--- Tarea 10: Mostrar Categorías Disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
