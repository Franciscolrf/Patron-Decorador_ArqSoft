/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.decoradores;

import itson.patrond.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa un condimento Chocolate
 * 
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public class Chocolate extends Condiment {

    /**
     * Constructor de la clase
     * 
     * @param beverage
     */
    public Chocolate(Beverage beverage) {
        super(beverage);
        description = "Chocolate";
    }

    /**
     * Calcula el costo de la bebida con el condimento Chocolate
     * 
     * @return Costo de la bebida con el condimento Chocolate
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 12.00;
    }
}
