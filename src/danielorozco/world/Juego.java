/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;

import java.util.Scanner;
import caballerosdesangre.InterfazCaballeros;
import orcos.InterfazOrcos;
import necromantes.InterfazNecromantes;

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
                OperacionesJugadorUno();
                setTurnoJugador(2);
            } else if (getTurnoJugador() == 2) {
                OperacionesJugadorDos();
                setTurnoJugador(1);
            }
        }
    }

    public void OperacionesJugadorUno() {

        MenuJuego menu = new MenuJuego();
        switch (menu.getOpcionRaza1()) {
            case 1:
                factory = FactoryProducer.getFactory(1);
                InterfazCaballeros caballero = factory.getCaballero(1);
                break;
            case 2:
                factory = FactoryProducer.getFactory(2);
                InterfazNecromantes necromante = factory.getNecromantes(2);
                break;
            case 3:
                factory = FactoryProducer.getFactory(3);
                InterfazOrcos orcos = factory.getOrcos(3);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }

    }

    public void OperacionesJugadorDos() {
        MenuJuego menu = new MenuJuego();
        
        switch (menu.getOpcionRaza2()) {
            case 1:
                factory = FactoryProducer.getFactory(1);
                InterfazCaballeros caballero = factory.getCaballero(1);
                break;
            case 2:
                factory = FactoryProducer.getFactory(2);
                InterfazNecromantes necromante = factory.getNecromantes(2);
                break;
            case 3:
                factory = FactoryProducer.getFactory(3);
                InterfazOrcos orcos = factory.getOrcos(3);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }

    public void opcionesJugadorUno() {

        Scanner opciones1 = new Scanner(System.in);
        MenuJuego menu = new MenuJuego();
        String nom1 = (menu.getNomJugador1());
        System.out.println(numero);
        System.out.println("\n---------------------------------------");
        System.out.println("\t\t" + nom1);
        System.out.println("---------------------------------------");
        System.out.println("| 1. Creacion de Milicia              |");
        System.out.println("| 2. Creacion de Recursos             |");
        System.out.println("| 3. Recoleccion de Recursos          |");
        System.out.println("| 4. Recoleccion de Milicia           |");
//        System.out.println("|\t\t\t\t      |");
//        System.out.println("|\t\t\t\t      |");
        System.out.println("---------------------------------------");
        setType(opciones1.nextInt());
        switch(getType()){
            case 1:
                factory = FactoryProducer.getFactory(1);
                InterfazCaballeros caballero = factory.getCaballero(1);
                caballero.Atacar(400);
            
        }
    }
    
    public void opcionesJugadorDos() {

        Scanner opciones2 = new Scanner(System.in);
        MenuJuego menu = new MenuJuego();
        String nom2 = (menu.getNomJugador2());
        System.out.println(numero);
        System.out.println("\n---------------------------------------");
        System.out.println("\t\t" + nom2);
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
