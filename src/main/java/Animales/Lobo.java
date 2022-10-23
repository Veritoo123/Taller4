/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Veronica
 */
public class Lobo extends Canido {
    @Override
    public String getSonido() {
    return "Aullido";
    }
    /**
    * Método que devuelve un String con los alimentos de un lobo
    * @return Un valor String con el tipo de alimentación de un lobo:
    * “Carnívoro”
    */
    @Override
    public String getAlimentos() {
    return "Carnívoro";
    }
    /**
    * Método que devuelve un String con el hábitat de un lobo
    * @return Un valor String con el hábitat de un lobo: “Bosque”
    */
    @Override
    public String getHábitat() {
    return "Bosque";
    }
    @Override
    public String getNombreCientífico() {
    return "Canis lupus";
    }
}
