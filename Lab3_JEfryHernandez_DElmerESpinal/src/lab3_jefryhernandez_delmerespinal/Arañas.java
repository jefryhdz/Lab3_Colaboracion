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
public class Arañas extends Bestia{
    private String sexo;

    public Arañas(String sexo, int garra, String veneno, int vida) {
        super(garra, veneno, vida);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Ara\u00f1as{" + "sexo=" + sexo + '}';
    }
    
    
}
