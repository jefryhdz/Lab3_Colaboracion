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
public class Arma {
    private String nombre;
    private int ataque;

    public Arma( String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    

    @Override
    public String toString() {
        return nombre + " ataque=" + ataque;
    }
    
    
    
}
