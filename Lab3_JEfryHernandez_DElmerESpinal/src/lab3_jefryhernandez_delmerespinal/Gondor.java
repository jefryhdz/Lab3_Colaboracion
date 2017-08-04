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
public class Gondor extends Lugares {

    private int numero_parajes;
    
    public Gondor() {
        super();
    }

    public Gondor(int numero_parajes, double extension) {
        super(extension);
        this.numero_parajes = numero_parajes;
    }

    public int getNumero_parajes() {
        return numero_parajes;
    }

    public void setNumero_parajes(int numero_parajes) {
        this.numero_parajes = numero_parajes;
    }

    @Override
    public String toString() {
        return "Gondor: " + "numero parajes=" + numero_parajes + '}';
    }
    
    
    
}
