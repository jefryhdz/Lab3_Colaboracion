/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

/**
 *
 * @author Jefry Hernandez
 */
public class Dragones extends Bestia{
    private double longitud;
    public Dragones(int garra, String veneno, int vida, int ataque, int curacion) {
        super(garra, veneno, vida, ataque, curacion);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Dragones{" + "longitud=" + longitud + '}';
    }
    
}
