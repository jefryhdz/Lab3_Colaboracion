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

    private Color color;

    public Aguila(Color color, int garra, String veneno, int vida, int ataque, int curacion) {
        super(garra, veneno, vida, ataque, curacion);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Aguila{" + "color=" + color + '}';
    }

}
