/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

import java.awt.Color;

/**
 *
 * @author Jefry Hernandez
 */
public class Aguila extends Bestia {

    private String color;

    public Aguila(String color, int garra, String veneno, int vida) {
        super(garra, veneno, vida);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Aguila{" + "color=" + color + '}';
    }

}
