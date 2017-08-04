
package lab3_jefryhernandez_delmerespinal;

import java.util.Date;

/**
 *
 * @author Owner
 */
public class Hombre extends Integrante{
    Arma arma;

    public Hombre() {
        super();
    }

    public Hombre(Arma arma, String nombre, String apellido, double altura, Date fecha_nacimiento, Bestia bestia) {
        super(nombre, apellido, altura, fecha_nacimiento, bestia);
        this.arma = arma;
        
        ataque = 150 + arma.getAtaque();
        defensa = 140;
        curacion = 50;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
    
    
}
