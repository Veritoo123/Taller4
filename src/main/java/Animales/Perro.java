/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Veronica
 */
public class Perro extends Canido{
    @Override
    public String getSonido() {
    return "Ladrido";
    }
    @Override
    public String getAlimentos() {
    return "Carnívoro";
    }
    /**
    * Método que devuelve un String con el hábitat de un perro
    * @return Un valor String con el hábitat de un perro: “Doméstico”
    */
    @Override
    public String getHábitat() {
    return "Doméstico";
    }
    /**
    * Método que devuelve un String con el nombre científico de un perro
    * @return Un valor String con el nombre científico de un perro:
    * “Canis lupus familiaris”
    */
    @Override
    public String getNombreCientífico() {
    return "Canis lupus familiaris";
    }
}
