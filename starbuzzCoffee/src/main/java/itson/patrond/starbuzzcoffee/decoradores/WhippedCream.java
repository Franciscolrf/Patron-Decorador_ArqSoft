/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.decoradores;

import itson.patrond.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase que representa un condimento Whipped Cream
 * 
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public class WhippedCream extends Condiment {

    /**
     * Constructor de la clase
     * 
     * @param beverage
     */
    public WhippedCream(Beverage beverage) {
        super(beverage);
        description = "Whipped Cream";
    }

    /**
     * Calcula el costo de la bebida con el condimento Whipped Cream
     * 
     * @return Costo de la bebida con el condimento Whipped Cream
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 9.00;
    }

}
