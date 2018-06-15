/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;

import caballerosdesangre.CentroMandoCaballeros;
import java.util.Scanner;
import caballerosdesangre.InterfazCaballeros;
import necromantes.CentroMandoNecromante;
import necromantes.InterfazNecromantes;
import orcos.CentroMandoOrco;
import orcos.InterfazOrcos;

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
    AbstractFactory factory;
    private static boolean Jugador1;
    private static boolean Jugador2;

    public boolean isJugador1() {
        return Jugador1;
    }

    public void setJugador1(boolean Jugador1) {
        Juego.Jugador1 = Jugador1;
    }

    public boolean isJugador2() {
        return Jugador2;
    }

    public void setJugador2(boolean Jugador2) {
        Juego.Jugador2 = Jugador2;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
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
        } else if (numero == 2) {
            setTurnoJugador(2);
        }
        while (true) {
            if (getTurnoJugador() == 1) {
                MenuJuego nomPlayer1 = new MenuJuego();
                System.out.println("\nTurno Jugador 1: " + nomPlayer1.getNomJugador1());
                OperacionesJugadorUno();
                setTurnoJugador(2);
            } else if (getTurnoJugador() == 2) {
                MenuJuego nomPlayer2 = new MenuJuego();
                System.out.println("********* Turno Jugador 2: " + nomPlayer2.getNomJugador2() + " **************");
                OperacionesJugadorDos();
                setTurnoJugador(1);
            }
        }
    }

    public void OperacionesJugadorUno() {

        MenuJuego menu = new MenuJuego();
        setJugador1(true);
        switch (menu.getOpcionRaza1()) {
            case 1:
                CentroMandoCaballeros caballeros = CentroMandoCaballeros.getInstance();
                caballeros.CentroMandoCaballero();
//                factory = FactoryProducer.getFactory(1);
//                InterfazCaballeros caballero = factory.getCaballero(1);
//                opcionesJugadorUno();
                break;
            case 2:
                CentroMandoNecromante necromante = CentroMandoNecromante.getInstance();
                necromante.CentroMandoNecromante();
                // CENTRO DE MANDO NECROMANTES
                break;
            case 3:
                // CENTRO DE MANDO ORCOS 
                CentroMandoOrco orcos = CentroMandoOrco.getInstance();
                orcos.CentroMandoOrco();
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }

    }

    public void OperacionesJugadorDos() {

        MenuJuego menu = new MenuJuego();
        setJugador2(true);
        switch (menu.getOpcionRaza2()) {
            case 1:
                CentroMandoCaballeros caballeros = CentroMandoCaballeros.getInstance();
                caballeros.CentroMandoCaballero();
                break;
            case 2:
                // CENTRO DE MANDO NECROMANTES
                CentroMandoNecromante necromante = CentroMandoNecromante.getInstance();
                necromante.CentroMandoNecromante();
                break;
            case 3:
                // CENTRO DE MANDO ORCOS
                CentroMandoOrco orcos = CentroMandoOrco.getInstance();
                orcos.CentroMandoOrco();
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }

}
