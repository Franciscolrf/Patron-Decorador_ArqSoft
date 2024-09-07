/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.bebidas;

/**
 * Clase abstracta que representa una bebida
 * @author Francisco de Jesús López Ruiz - 00000247037
 * Instituto Tecnológico de Sonora (ITSON)
 */
public abstract class Beverage {
    
    String description = "Bebida Main";
    
    /**
     * Obtiene la descripción de la bebida
     * @return
     */
    public String getDescription(){
        return description;
    }
    
    /**
     * Calcula el costo de la bebida
     * @return
     */
    public abstract double cost();
}
