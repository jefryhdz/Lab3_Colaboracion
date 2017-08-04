/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

import java.util.ArrayList;

/**
 *
 * @author Jefry Hernandez
 */
public class Comarca extends Lugares {

    private int casa;

    public Comarca() {
        super();
    }
  
    public Comarca(int casa, double extension) {
        super(extension);
        this.casa = casa;

    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public void addIntegrante(Integrante integrante) {
        if (integrante instanceof Hobbit) {
            ((Hobbit) integrante).ataque += 100;
            ((Hobbit) integrante).defensa += 100;
            ((Hobbit) integrante).curacion += 100;
        }
        integrantes.add(integrante);
        
    }

    @Override
    public String toString() {
        return "Comarca: numero de casas=" + casa;
    }
    
    

}
