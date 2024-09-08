/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itson.patrond.starbuzzcoffee.bebidas.Beverage;
import itson.patrond.starbuzzcoffee.bebidas.DarkRoast;
import itson.patrond.starbuzzcoffee.bebidas.Decaf;
import itson.patrond.starbuzzcoffee.bebidas.Expresso;
import itson.patrond.starbuzzcoffee.bebidas.HouseBlend;
import itson.patrond.starbuzzcoffee.decoradores.Chocolate;
import itson.patrond.starbuzzcoffee.decoradores.Milk;
import itson.patrond.starbuzzcoffee.decoradores.Soy;
import itson.patrond.starbuzzcoffee.decoradores.WhippedCream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas
 *
 * @author Francisco de Jesús López Ruiz - 00000247037
 *         Instituto Tecnológico de Sonora (ITSON)
 */
public class BeverageTest {

    @Test
    public void testEspressoCost() {
        Beverage beverage = new Expresso();
        assertEquals(36.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testHouseBlendCostWithMilk() {
        Beverage beverage = new HouseBlend();
        beverage = new Milk(beverage);
        assertEquals(46.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testDarkRoastCostWithSoyAndChocolate() {
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Chocolate(beverage);
        assertEquals(67.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testDecafCostWithWhippedCream() {
        Beverage beverage = new Decaf();
        beverage = new WhippedCream(beverage);
        assertEquals(39.00, beverage.getCost(), 0.01);
    }

    @Test
    public void testEspressoDescriptionWithMilkAndWhippedCream() {
        Beverage beverage = new Expresso();
        beverage = new Milk(beverage);
        beverage = new WhippedCream(beverage);
        assertEquals("Cafe Expresso, Milk, Whipped Cream", beverage.getDescription());
    }

    @Test
    public void testDecafDescriptionWithWhippedCream() {
        Beverage beverage = new Decaf();
        beverage = new WhippedCream(beverage);
        assertEquals("Cafe Decaf, Whipped Cream", beverage.getDescription());
    }

    @Test
    public void testHouseBlendDescriptionWithAllCondiments() {
        Beverage beverage = new HouseBlend();
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Chocolate(beverage);
        beverage = new WhippedCream(beverage);
        assertEquals("Cafe House Blend, Milk, Soy, Chocolate, Whipped Cream", beverage.getDescription());
    }

    @Test
    public void testDarkRoastDescriptionWithNoCondiments() {
        Beverage beverage = new DarkRoast();
        assertEquals("Cafe Dark Roast", beverage.getDescription());
    }
}
