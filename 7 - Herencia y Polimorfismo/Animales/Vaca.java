/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author hcoceres
 */
class Vaca extends Animal {
    public Vaca() {
        super("Vaca");
    }

    // Sobrescribe el comportamiento
    @Override
    public void hacerSonido() {
        System.out.println(especie + " dice: Muuuu");
    }
}