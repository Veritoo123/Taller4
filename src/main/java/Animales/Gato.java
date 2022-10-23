/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author Veronica
 */
public class Gato extends Felino{
    @Override
    public String getSonido() {
    return "Maullido";
    }

    @Override
    public String getAlimentos() {
    return "Ratones";
    }
    
    @Override
    public String getHábitat() {
    return "Doméstico";
    }

    @Override
    public String getNombreCientífico() {
    return "Felis silvestris catus";
    }
}
