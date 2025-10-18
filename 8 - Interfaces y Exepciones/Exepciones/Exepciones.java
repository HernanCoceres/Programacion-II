/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hcoceres
 */
public class Exepciones {
    public static void divisionSegura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n 1. Division Segura ");

        try {
            System.out.print("Ingresa el dividendo: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingresa el divisor: ");
            int b = Integer.parseInt(scanner.nextLine());
            // La excepcion ArithmeticException es unchecked (no necesita throws ni try-catch forzado)
            double resultado = (double) a / b;
            System.out.println("Resultado de la division: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println(" ERROR: No se puede dividir por cero. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println(" ERROR: Entrada invalida. Ingresa solo nomeros enteros.");
        }
    }
public static void convertirCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n 2. Conversion de Cadena a Numero");

        System.out.print("Introduce una cadena para convertir a entero: ");
        String texto = scanner.nextLine();

        try {
            // Si la cadena no es un numero valido, se lanza NumberFormatException
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion exitosa. Numero: " + numero);
        } catch (NumberFormatException e) {
            // Se captura si la conversión falla
            System.err.println("ERROR: La cadena '" + texto + "' no es un formato de numero valido.");
        }
    }
public static void leerArchivo() {
        System.out.println("\n3. Lectura de Archivo");
        String nombreArchivo = "archivo_inexistente.txt"; // Nombre de un archivo que no existe

        try {
            // FileInputStream, FileReader o Scanner pueden lanzar FileNotFoundException
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);
            
            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
            
        } catch (FileNotFoundException e) {
            // Se captura si el archivo no se encuentra. Esta es una exepcion checked.
            System.err.println("ERROR: Archivo no encontrado. " + e.getMessage());
        }
    }
// Método que lanza la excepción
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            // Lanzamiento de la excepcion personalizada
            throw new EdadInvalidaException("La edad (" + edad + ") debe estar entre 0 y 120 años.");
        }
        System.out.println("Edad valida: " + edad + " años.");
    }

    public static void manejarEdadInvalida() {
        System.out.println("\n4. Excepcion Personalizada");
        int edadPrueba1 = 150;
        int edadPrueba2 = 25;

        // Caso 1: Se lanza la excepcion
        try {
            validarEdad(edadPrueba1);
        } catch (EdadInvalidaException e) {
            // Captura de la excepcion personalizada
            System.err.println("?VALIDACION FALLIDA: " + e.getMessage());
        }

        // Caso 2: Exito
        try {
            validarEdad(edadPrueba2);
        } catch (EdadInvalidaException e) {
            System.err.println("VALIDACION FALLIDA: " + e.getMessage());
        }
    }
    public static void usarTryWithResources() {
        System.out.println("\n5. Uso de try-with-resources ");
        String rutaArchivo = "datos.txt"; 

        //  try-with-resources para asegurar el cierre automatico del BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("Contenido leido con try-with-resources:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            // Captura IOException (que incluye FileNotFoundException)
            System.err.println("ERROR al leer el archivo (try-with-resources): " + e.getMessage());
        } // El recurso br se cierra automaticamente aca,  si ocurre una excepcion tambien.
    }
}
