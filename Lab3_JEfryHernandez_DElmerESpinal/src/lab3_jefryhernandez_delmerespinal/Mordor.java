/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

/**
 *
 * @author Owner
 */
public class Mordor extends Lugares{
    private int numero_guardianes;

    public Mordor() {
        super();
    }

    public Mordor(int numero_guardianes, double extension) {
        super(extension);
        this.numero_guardianes = numero_guardianes;
    }

    public int getNumero_guardianes() {
        return numero_guardianes;
    }

    public void setNumero_guardianes(int numero_guardianes) {
        this.numero_guardianes = numero_guardianes;
    }

    @Override
    public String toString() {
        return "Mordor: numero de guardianes=" + numero_guardianes;
    }
    
    
    
    
}
