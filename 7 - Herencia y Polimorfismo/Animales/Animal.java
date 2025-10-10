/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author hcoceres
 */
class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println("El animal generico hace un sonido desconocido.");
    }
    
    public void describirAnimal() {
        System.out.print("Especie: " + especie);
    }
}