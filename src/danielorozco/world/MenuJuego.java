/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;

import caballerosdesangre.*;
import java.util.ArrayList;
import java.util.Scanner;
import necromantes.*;
import orcos.*;
/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */


/**
 * Se encarga de la interaccion de los usuarios.
 * 
 */
public class MenuJuego {
    
    private static String nomJugador1;
    private static String nomJugador2;
    private static int opcionRaza1;
    private static int opcionRaza2;
  
    public ArrayList<String>NombresJugador;

    public  int getOpcionRaza1() {
        return opcionRaza1;
    }

    public void setOpcionRaza1(int opcionRaza1) {
        MenuJuego.opcionRaza1 = opcionRaza1;
    }

    public  int getOpcionRaza2() {
        return opcionRaza2;
    }

    public  void setOpcionRaza2(int opcionRaza2) {
        MenuJuego.opcionRaza2 = opcionRaza2;
    }
    
    public  String getNomJugador1() {
        return nomJugador1;
    }

    public void setNomJugador1(String nomJugador1) {
        MenuJuego.nomJugador1 = nomJugador1;
    }

    public String getNomJugador2() {
        return nomJugador2;
    }

    public void setNomJugador2(String nomJugador2) {
        MenuJuego.nomJugador2 = nomJugador2;
    }
    
    public MenuJuego(){
        NombresJugador= new ArrayList<>();
        
    }
    
    public void InicioJuego(){
        Scanner op = new Scanner(System.in);
        String nombres1,nombres2;
        System.out.println("************** BIENVENIDO A DANIELOROZCO'S WORLD **************");
        
        System.out.println("\t\tIngresen sus apodos por favor:");
        System.out.println("Jugador 1 :");
        nombres1=op.nextLine();
        setNomJugador1(nombres1);
//        NombresJugador.add(nombres1);
        
        System.out.println("Jugador 2 :");
        nombres2=op.nextLine();
        setNomJugador2(nombres2);
//        NombresJugador.add(nombres2);
        
        System.out.println("\t\t"+nombres1+" Elija su raza por favor: ");
        System.out.println("1. Caballeros de Sangre");
        System.out.println("2. Necromantes");
        System.out.println("3. Orcos");
        setOpcionRaza1(op.nextInt());
        
        System.out.println("\t\t"+nombres2+" Elija su raza por favor: ");
        System.out.println("1. Caballeros de Sangre");
        System.out.println("2. Necromantes");
        System.out.println("3. Orcos");
        setOpcionRaza2(op.nextInt());
             
         Juego iniciarJuego=new Juego();
        iniciarJuego.adminTurnos();
    }
    
    
}
