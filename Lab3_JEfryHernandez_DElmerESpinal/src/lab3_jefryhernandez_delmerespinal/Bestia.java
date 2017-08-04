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
    private int ataque;
    private int curacion;

    public Bestia(int garra, String veneno, int vida, int ataque, int curacion) {
        this.garra = garra;
        this.veneno = veneno;
        this.vida = vida;
        this.ataque = ataque;
        this.curacion = curacion;
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

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    @Override
    public String toString() {
        return "Bestia {" + "garra = " + garra + ", veneno = " + veneno + ", vida = " + vida + ", ataque = " + ataque + ", curacion = " + curacion + '}';
    }
    
}
