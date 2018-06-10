/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;

import java.util.Scanner;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
/**
 * Se encarga de toda la logica del juego y el manejo de turnos
 *
 */
public class Juego {

    //CONTROLADOR DE TURNOS AL AZAR
   
    double numeroRandom = Math.random();
    double numero = (int) (Math.random() * 2) + 1;
    private static int turnoJugador;
    static private int type;

    public  int getType() {
        return type;
    }

    public  void setType(int type) {
        this.type = type;
    }
    

    public int getTurnoJugador() {
        return turnoJugador;
    }

    public void setTurnoJugador(int aTurnoJugador) {
        turnoJugador = aTurnoJugador;
    }

    public Juego() {

    }

    public void adminTurnos() {
        
        if (numero == 1) {
            setTurnoJugador(1);
        } else if(numero==2){
            setTurnoJugador(2);
        }
        while (true) {
            if (getTurnoJugador() == 1) {
                OperacionesJugadorUno();
                setTurnoJugador(2);
            } else if (getTurnoJugador() == 2) {
                OperacionesJugadorDos();
                setTurnoJugador(1);
            }
        }
    }

    public void OperacionesJugadorUno() {
        
        Scanner opciones1 = new Scanner(System.in);
        MenuJuego menu = new MenuJuego();
        String nom1=(menu.getNomJugador1());
        System.out.println(numero);
        System.out.println("\n---------------------------------------");
        System.out.println("\t\t"+nom1);
        System.out.println("---------------------------------------");
        System.out.println("| 1. Creacion de Milicia              |");
        System.out.println("| 2. Creacion de Recursos             |");
        System.out.println("| 3. Recoleccion de Recursos          |");
        System.out.println("| 4. Recoleccion de Milicia           |");
//        System.out.println("|\t\t\t\t      |");
//        System.out.println("|\t\t\t\t      |");
        System.out.println("---------------------------------------");
        setType(opciones1.nextInt());
    }

    public void OperacionesJugadorDos() {
        MenuJuego menu = new MenuJuego();
        String nom2=(menu.getNomJugador2());

        Scanner opciones2 = new Scanner(System.in);
        System.out.println(numero);
        System.out.println("\n---------------------------------------");
        System.out.println("\t\t"+nom2);
        System.out.println("---------------------------------------");
        System.out.println("| 1. Creacion de Milicia              |");
        System.out.println("| 2. Creacion de Recursos             |");
        System.out.println("| 3. Recoleccion de Recursos          |");
        System.out.println("| 4. Recoleccion de Milicia           |");
//        System.out.println("|\t\t\t\t      |");
//        System.out.println("|\t\t\t\t      |");
        System.out.println("---------------------------------------");
        setType(opciones2.nextInt());
    }
}
