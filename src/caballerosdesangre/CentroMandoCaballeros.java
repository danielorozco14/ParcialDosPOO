/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class CentroMandoCaballeros {
    private static int vidaHQ;
    private static CentroMandoCaballeros hq;

    private CentroMandoCaballeros() {
    }
    
    public static CentroMandoCaballeros getInstance() {
        if (hq == null) {
            hq = new CentroMandoCaballeros();
        }
        return hq;
    }
    
    public void OperacionesJugadorUno(){
        
        System.out.println("---------------------------------------");
        System.out.println("|              Jugador 1              |");
        System.out.println("---------------------------------------");
        System.out.println("| 1. Creacion de Milicia              |");
        System.out.println("| 2. Creacion de Recursos             |");
        System.out.println("| 3. Recoleccion de Recursos          |");
        System.out.println("| 4. Recoleccion de Milicia           |");
//        System.out.println("|\t\t\t\t      |");
//        System.out.println("|\t\t\t\t      |");
        System.out.println("---------------------------------------");
        
    }
        
    public void OperacionesJugadorDos(){
        
        System.out.println("---------------------------------------");
        System.out.println("|              Jugador 2              |");
        System.out.println("---------------------------------------");
        System.out.println("| 1. Creacion de Milicia              |");
        System.out.println("| 2. Creacion de Recursos             |");
        System.out.println("| 3. Recoleccion de Recursos          |");
        System.out.println("| 4. Recoleccion de Milicia           |");
//        System.out.println("|\t\t\t\t      |");
//        System.out.println("|\t\t\t\t      |");
        System.out.println("---------------------------------------");
        
    }
        
    
}
