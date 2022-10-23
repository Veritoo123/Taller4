/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Veronica
 */
public class Prueba {
    public static void main(String[] args) {
    Animal[] animales = new Animal[4]; 
    animales[0] = new Gato();
    animales[1] = new Perro();
    animales[2] = new Lobo();
    animales[3] = new Leon();
        for (Animal animale : animales) {
            System.out.println(animale.getNombreCientífico());
            System.out.println("Sonido: " + animale.getSonido());
            System.out.println("Alimentos: " + animale.getAlimentos());
            System.out.println("Hábitat: " + animale.getHábitat());
            System.out.println();
        }
    }
}
