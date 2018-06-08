/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;
import caballerosdesangre.*;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class DanielOrozcoWorldMain {

    public static void main(String[] args) {

//        Caballeros caballero=new Caballeros();
//        caballero.Crear();        
//        caballero.Atacar(caballero, caballero.getPuntosAtaque());
        CentroMandoCaballeros cab= CentroMandoCaballeros.getInstance();
        cab.OperacionesJugadorUno();
              
    }

}
