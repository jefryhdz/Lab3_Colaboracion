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
public class Balrogs extends Bestia {
    private String latigo;

    public Balrogs(int garra, String veneno, int vida, int ataque, int curacion) {
        super(garra, veneno, vida, ataque, curacion);
    }

    public String getLatigo() {
        return latigo;
    }

    public void setLatigo(String latigo) {
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return "Balrogs{" + "latigo=" + latigo + '}';
    }
    
    
}
