
package lab3_jefryhernandez_delmerespinal;

import java.util.Date;

/**
 *
 * @author Owner
 */
public class Integrante {
    private String nombre;
    private String apellido;
    private double altura;
    private Date fecha_nacimiento;
    private Bestia bestia;
    protected int ataque; 
    protected int defensa;
    protected int curacion;
    
    public Integrante() {
    }

    public Integrante(String nombre, String apellido, double altura, Date fecha_nacimiento, Bestia bestia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.fecha_nacimiento = fecha_nacimiento;
        this.bestia = bestia;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Bestia getBestia() {
        return bestia;
    }

    public void setBestia(Bestia bestia) {
        this.bestia = bestia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
   
}
