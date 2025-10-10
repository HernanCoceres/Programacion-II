/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author hcoceres
 */
class Gato extends Animal {
    public Gato() {
        super("Gato");
    }

    // Sobrescribe el comportamiento
    @Override
    public void hacerSonido() {
        System.out.println(especie + " dice: Miau miau");
    }
}