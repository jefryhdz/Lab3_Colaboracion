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
public class Elfo extends Integrante {

    private boolean arma;

    public Elfo() {
        super();
    }

    public Elfo(boolean arma, String nombre, String apellido, double altura, Date fecha_nacimiento) {
        super(nombre, apellido, altura, fecha_nacimiento);
        this.arma = arma;
        
        ataque = 443;
        defensa = 150;
        curacion = 335;
            
        if(arma){
            ataque += 10;
            defensa+= 10;
            curacion += 10;
        }
       

    }

    public boolean isArma() {
        return arma;
    }

    public void setArma(boolean arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
