/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

import java.util.Date;

/**
 *
 * @author Owner
 */
public class Maiar extends Integrante {

    private boolean sombrero;
    private boolean baston;

    public Maiar() {
        super();
    }

    public Maiar(boolean sombrero, boolean baston, String nombre, String apellido, double altura, Date fecha_nacimiento, Bestia bestia) {
        super(nombre, apellido, altura, fecha_nacimiento, bestia);
        this.sombrero = sombrero;
        this.baston = baston;

        if (sombrero) {
            ataque = 200;
            defensa = 0;
            curacion = 200;
        } else if (baston) {
            ataque = 200;
            defensa = 0;
            curacion = 250;

        }

    }

    public boolean isSombrero() {
        return sombrero;
    }

    public void setSombrero(boolean sombrero) {
        this.sombrero = sombrero;
    }

    public boolean isBaston() {
        return baston;
    }

    public void setBaston(boolean baston) {
        this.baston = baston;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
