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
public class Bestias_Aladas extends Bestia {

    private long Velocidad;

    public Bestias_Aladas(long Velocidad, int garra, String veneno, int vida, int ataque, int curacion) {
        super(garra, veneno, vida, ataque, curacion);
        this.Velocidad = Velocidad;
    }

    public long getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(long Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return "Bestias_Aladas{" + "Velocidad=" + Velocidad + '}';
    }

    
}
