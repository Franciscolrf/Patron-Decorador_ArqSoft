/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.decoradores;

import itson.patrond.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa un condimento Milk
 * 
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public class Milk extends Condiment {

    /**
     * Constructor de la clase
     * 
     * @param beverage
     */
    public Milk(Beverage beverage) {
        super(beverage);
        description = "Milk";
    }

    /**
     * Calcula el costo de la bebida con el condimento Milk
     * 
     * @return Costo de la bebida con el condimento Milk
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 8.00;
    }
}
