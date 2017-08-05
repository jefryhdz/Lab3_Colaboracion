
package lab3_jefryhernandez_delmerespinal;

/**
 *
 * @author Owner
 */
public class Historial {
    Integrante ganador;
    Integrante perdedor;

    public Historial(Integrante ganador, Integrante perdedor) {
        this.ganador = ganador;
        this.perdedor = perdedor;
    }

    public Integrante getGanador() {
        return ganador;
    }

    public void setGanador(Integrante ganador) {
        this.ganador = ganador;
    }

    public Integrante getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(Integrante perdedor) {
        this.perdedor = perdedor;
    }

    @Override
    public String toString() {
        return "ganador=" + ganador + ", perdedor=" + perdedor;
    }
    
    
    
    
}
