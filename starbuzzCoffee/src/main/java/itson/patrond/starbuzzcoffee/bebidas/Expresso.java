/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.patrond.starbuzzcoffee.bebidas;

/**
 * Clase que representa una bebida Expresso
 * 
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public class Expresso extends Beverage {

    /**
     * Constructor de la clase
     */
    public Expresso() {
        description = "Cafe Expresso";
    }

    /**
     * Calcula el costo de la bebida Expresso
     * 
     * @return Costo de la bebida
     */
    @Override
    public double getCost() {
        return 36.00;
    }

}
