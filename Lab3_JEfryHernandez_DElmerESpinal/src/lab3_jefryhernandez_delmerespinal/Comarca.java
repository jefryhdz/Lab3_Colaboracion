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

    public Comarca(int casa, double extension) {
        super(extension);
        this.casa = casa;

        for (Integrante inte : integrantes) {
            if (inte instanceof Hobbit) {
             ((Hobbit) inte).ataque+=100;
             ((Hobbit) inte).defensa+=100;
             ((Hobbit) inte).curacion+=100;
            }
        }

    }
}
