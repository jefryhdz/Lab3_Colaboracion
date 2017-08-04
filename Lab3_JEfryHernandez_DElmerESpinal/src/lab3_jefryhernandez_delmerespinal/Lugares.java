/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

import java.util.ArrayList;

/**
 *
 * @author Jefry Hernandez
 */
public class Lugares {
    private double extension;
    protected ArrayList<Integrante> integrantes = new ArrayList();

    public Lugares(double extension) {
        this.extension = extension;
        
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Lugares{" + "extension=" + extension + ", integrantes=" + integrantes + '}';
    }

   
}
