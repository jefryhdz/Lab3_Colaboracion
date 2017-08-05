/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jefryhernandez_delmerespinal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jefry Hernandez
 */
public class Lab3_JEfryHernandez_DElmerESpinal {

    static ArrayList<Integrante> integrantes = new ArrayList();
    static Scanner read = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Menu = "Menu: \n"
                + "a) Agregar un integrante\n"
                + "b) Simular batalla\n"
                + "c) Imprimir \n"
                + "d) Modificar\n"
                + "e) Eliminar\n"
                + "f) Salir\n";

        char opc = 0;
        char opc2 = 0;
        do {
            System.out.println(Menu);
            opc = read.next().charAt(0);

            switch (opc) {
                case 'a':

                    integrantes.add(getIntegrante());

                    break;
                case 'b':
                    System.out.println("Elija tipo de simulacion\n"
                            + "a) Por intengrante\n"
                            + "b) Por lugar\n");

                    char resp2 = read.next().charAt(0);
                    switch (resp2) {
                        case 'a':
                            break;

                    }

                case 'c':
                    for (Integrante inte : integrantes) {
                        System.out.println(inte.getNombre() + " " + inte.getApellido() + " " + inte.getBestia() + "\n "
                                + "ATK= " + inte.getAtaque() + "DEF= " + inte.getDefensa() + "CUR= " + inte.getCuracion());

                    }

                    break;
                case 'd':
                    System.out.println("Escoja el index para modificar");
                    for (int i = 0; i < integrantes.size(); i++) {
                        System.out.println(i + ")" + integrantes.get(i).getNombre());
                    }
                    int pos = read.nextInt();
                    integrantes.set(pos, getIntegrante());

                    break;
                case 'e':
                    System.out.println("Escoja el index para eliminar");
                    for (int i = 0; i < integrantes.size(); i++) {
                        System.out.println(i + ")" + integrantes.get(i).getNombre());
                    }
                    pos = read.nextInt();
                    integrantes.remove(pos);
                    break;

            }

        } while (opc != 'f');
    }

    public static Integrante getIntegrante() {

        Integrante nuevo;

        System.out.println("Ingrese el nombre");
        String nombre = read.next();
        System.out.println("Ingrese el apellido");
        String apellido = read.next();
        System.out.println("Ingrese la altura");
        double altura = read.nextDouble();
        System.out.println("Ingrese la fecha en formato dd/MM/yyyy");
        String fecha = read.next();
        Date nacimiento = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            nacimiento = df.parse(fecha);
        } catch (Exception e) {
        }

        System.out.println("Ingrese el tipo de integrante:\n"
                + "a) Elfo\n"
                + "b) Enano\n"
                + "c) Hobbit\n"
                + "d) Hombres\n"
                + "e) Maiar");

        char opc2 = read.next().charAt(0);
        switch (opc2) {
            case 'a':
                System.out.println("Lleva arma [S/N]");
                char resp = read.next().charAt(0);
                boolean arma = false;
                if (resp == 's') {
                    arma = true;
                }
                nuevo = new Elfo(arma, nombre, apellido, altura, nacimiento);

                break;
            case 'b':
                System.out.println("Lleva barba [S/N]");
                boolean barba = false;
                resp = read.next().charAt(0);
                if (resp == 's') {
                    barba = true;
                }
                System.out.println("Lleva hacha [S/N]");
                boolean hacha = false;
                resp = read.next().charAt(0);
                if (resp == 's') {
                    hacha = true;
                }
                nuevo = new Enano(barba, hacha, nombre, apellido, altura, nacimiento);
                System.out.println("Se creara el hermano:");
                System.out.println("Lleva barba [S/N]");
                barba = false;
                resp = read.next().charAt(0);
                if (resp == 's') {
                    barba = true;
                }
                System.out.println("Lleva hacha [S/N]");
                hacha = false;
                resp = read.next().charAt(0);
                if (resp == 's') {
                    hacha = true;
                }
                Integrante hermano = new Enano(barba, hacha, nombre, apellido, altura, nacimiento);
                ((Enano) nuevo).setHermano((Enano) hermano);
                ((Enano) hermano).setHermano((Enano) hermano);
                break;
            case 'c':
                System.out.println("Ingrese la cantidad de anillos:");
                int anillos = read.nextInt();
                nuevo = new Hobbit(anillos, nombre, apellido, altura, nacimiento);

                break;
            case 'd':
                System.out.println("Ingrese el arma:\n"
                        + "a)Espada\n"
                        + "b)Lanza\n"
                        + "c)Arco\n");
                char armas = read.next().charAt(0);
                Arma arm;
                switch (armas) {
                    case 'a':
                        arm = new Arma("Espada", 150);
                        break;
                    case 'b':
                        arm = new Arma("Lanza", 100);
                        break;
                    default:
                        arm = new Arma("Arco", 115);

                }
                nuevo = new Hombre(arm, nombre, apellido, altura, nacimiento);
                break;
            default:
                System.out.println("Tiene baston: ");
                boolean baston = false;
                boolean sombrero = false;
                char respu = read.next().charAt(0);
                if (respu == 's') {
                    baston = true;
                } else {
                    sombrero = true;
                }
                nuevo = new Maiar(sombrero, baston, nombre, apellido, altura, nacimiento);
                break;
        }

        System.out.println("Vamos a crear una bestia");
        int garras;
        do {
            System.out.println("Ingrese el numero de garras: ");
            garras = read.nextInt();
        } while (garras < 0 || garras > 6);
        String veneno = "";
        System.out.println("Tiene veneno: ");
        veneno = read.next();
        Random ale = new Random();
        int vida = 50 + ale.nextInt(100);

        Bestia bestia;
        System.out.println("Escoja la bestia \n"
                + "a) Aguila \n"
                + "b) Araña"
                + "\nc) Balrogs"
                + "\nd) Bestias Aladas \n"
                + "e) Dragones");
        char bestial = read.next().charAt(0);
        switch (bestial) {
            case 'a':
                System.out.println("Ingrese el color del plumaje: ");
                String color = read.next();
                bestia = new Aguila(color, garras, veneno, vida);
                break;
            case 'b':
                System.out.println("Ingrese el sexo [M/F]: ");
                char sexo = read.next().charAt(0);
                if (sexo == 'M' || sexo == 'm') {
                    vida += 50;
                }
                bestia = new Arañas(sexo, garras, veneno, vida);
                break;
            case 'c':
                System.out.println("Tiene latigo: ");
                String latigo = read.next();
                bestia = new Balrogs(latigo, garras, veneno, vida);
                break;
            case 'd':
                System.out.println("Ingrese la velocidad: ");
                Long velocidad = read.nextLong();
                bestia = new Bestias_Aladas(velocidad, garras, veneno, vida);
                break;
            default:
                System.out.println("Ingrese la longitud del ala: ");
                double longitud = read.nextDouble();
                bestia = new Dragones(longitud, garras, veneno, vida);
        }
        nuevo.ataque += vida;
        nuevo.curacion += vida;
        nuevo.defensa += vida;

        nuevo.setBestia(bestia);

        return nuevo;

    }

    public void SimularA() {

        for (Integrante inte : integrantes) {
            System.out.println(integrantes.indexOf(inte) + ") " + inte.getNombre() + " " + inte.getApellido() + " " + inte.getBestia() + "\n "
                    + "ATK= " + inte.getAtaque() + "DEF= " + inte.getDefensa() + "CUR= " + inte.getCuracion());

        }
        System.out.println("Seleccione el index del primer jugador:");
        int pos = read.nextInt();
        System.out.println("Seleccione el index del segundo jugador:");
        int pos2 = read.nextInt();

        Integrante peleador1 = integrantes.get(pos);
        Integrante peleador2 = integrantes.get(pos2);

        Random ale = new Random();
        int cont = ale.nextInt(2);

        while (peleador1.getDefensa() <= 0 || peleador2.getDefensa() <= 0) {
            if (cont % 2 == 0) {
                if (peleador2.getBestia().getVida() < 0) {
                    int atk = peleador1.getAtaque();
                    int vidaB = peleador2.getBestia().getVida();

                    peleador2.getBestia().setVida(vidaB - atk);

                } else {
                    int atk = peleador1.getAtaque();
                    int vida = peleador2.getDefensa();

                    peleador2.setDefensa(vida - atk);

                }

            } else {
                if (peleador1.getBestia().getVida() < 0) {
                    int atk = peleador2.getAtaque();
                    int vidaB = peleador1.getBestia().getVida();

                    peleador1.getBestia().setVida(vidaB - atk);

                } else {
                    int atk = peleador2.getAtaque();
                    int vida = peleador1.getDefensa();

                    peleador1.setDefensa(vida - atk);

                }
            }
            cont++;
        }

    }

}
