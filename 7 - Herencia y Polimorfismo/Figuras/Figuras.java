/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras;

/**
 *
 * @author hcoceres
 */
public class Figuras {
    public static void main(String[] args) {
        System.out.println("Figuras Geometricas");
        
        // los objetos se guardan como el tipo Figura (la superclase) upscasting
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        figuras[2] = new Circulo(2.5);

        for (Figura figura : figuras) {
            System.out.printf("%s con area: %.2f\n", figura.getNombre(), figura.calcularArea());
        }
    }
}