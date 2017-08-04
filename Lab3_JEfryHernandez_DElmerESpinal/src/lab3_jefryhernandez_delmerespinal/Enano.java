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
public class Enano extends Integrante{
    private boolean barba;
    private boolean hacha;
    private Enano Hermano;

    public Enano() {
        super();
    }

    public Enano(boolean barba, boolean hacha, String nombre, String apellido, double altura, Date fecha_nacimiento) {
        super(nombre, apellido, altura, fecha_nacimiento);
        this.barba = barba;
        this.hacha = hacha;
        
        ataque = 300;
        defensa = 200;
        curacion = 50;
        
        if(barba){
            ataque += 50;
            
        }
        if(hacha){
            ataque += 50;
        }
       
    }

    public boolean isBarba() {
        return barba;
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }

    public boolean isHacha() {
        return hacha;
    }

    public void setHacha(boolean hacha) {
        this.hacha = hacha;
    }

    public Enano getHermano() {
        return Hermano;
    }

    public void setHermano(Enano Hermano) {
        this.Hermano = Hermano;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
    
    
    
    
}
