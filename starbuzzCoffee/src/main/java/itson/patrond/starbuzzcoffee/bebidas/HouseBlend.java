/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida HouseBlend
 * 
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public class HouseBlend extends Beverage {

    /**
     * Constructor de la clase
     */
    public HouseBlend() {
        description = "Cafe House Blend";
    }

    /**
     * Calcula el costo de la bebida HouseBlend
     * 
     * @return Costo de la bebida
     */
    @Override
    public double cost() {
        return 38.00;
    }

}
