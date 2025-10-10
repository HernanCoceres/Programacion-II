/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hcoceres
 */
public class Animales {
    public static void main(String[] args) {
        System.out.println("Animales");
        
        // lista de Animal (la superclase upcasting)
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro());
        granja.add(new Gato());
        granja.add(new Vaca());
        granja.add(new Animal("Pez")); // Un animal generico

        for (Animal animal : granja) {
            animal.describirAnimal();
            System.out.print(" -> ");
            // llama al metodo hacerSonido() especifico de cada clase
            animal.hacerSonido();
        }
    }
}
