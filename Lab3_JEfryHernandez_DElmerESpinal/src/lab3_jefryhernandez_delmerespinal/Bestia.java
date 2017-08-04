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
public class Bestia {
    private int garra;
    private String veneno;
    private int vida;

    public Bestia(int garra, String veneno, int vida) {
        this.garra = garra;
        this.veneno = veneno;
        this.vida = vida;
    }

    public int getGarra() {
        return garra;
    }

    public void setGarra(int garra) {
        this.garra = garra;
    }

    public String getVeneno() {
        return veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    @Override
    public String toString() {
        return "Bestia {" + "garra = " + garra + ", veneno = " + veneno + ", vida = " + vida +'}';
    }
    
}
