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
public class Hobbit extends Integrante{

    private int anillos;
    
    public Hobbit() {
        super();
    }

    public Hobbit(int anillos, String nombre, String apellido, double altura, Date fecha_nacimiento, Bestia bestia) {
        super(nombre, apellido, altura, fecha_nacimiento, bestia);
        this.anillos = anillos;
        
        ataque = 10 + (anillos*40);
        defensa = 100 + (anillos*40);
        curacion = 1 + (anillos*40);
        
        
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
    
}
