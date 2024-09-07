/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida Decaf
 * @author Francisco de Jesús López Ruiz - 00000247037
 * Instituto Tecnológico de Sonora (ITSON)
 */
public class Decaf extends Beverage {
    
    /**
     * Constructor de la clase
     */
    public Decaf(){
        description = "Cafe Decaf";
    }
    
    /**
     * Calcula el costo de la bebida Decaf
     * @return Costo de la bebida
     */
    @Override
    public double cost() {
        return 30.00;
    }
    
}
