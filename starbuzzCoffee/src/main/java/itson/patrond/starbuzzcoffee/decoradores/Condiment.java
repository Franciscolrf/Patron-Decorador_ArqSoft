/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.decoradores;

import itson.patrond.starbuzzcoffee.bebidas.Beverage;

/**
 * Clase abstracta que representa un condimento a agregar a una bebida
 * 
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public abstract class Condiment extends Beverage {

    protected Beverage beverage;

    /**
     * Constructor de la clase
     * 
     * @param beverage
     */
    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con el condimento
     * 
     * @return Descripción de la bebida con el condimento
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    /**
     * Obtiene el costo de la bebida con el condimento
     * 
     * @return Costo de la bebida con el condimento
     */
    @Override
    public abstract double getCost();
}
