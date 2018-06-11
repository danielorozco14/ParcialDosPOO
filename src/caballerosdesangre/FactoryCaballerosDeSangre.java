/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre;

import danielorozco.world.AbstractFactory;
import java.util.Scanner;
import necromantes.InterfazNecromantes;
import orcos.InterfazOrcos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryCaballerosDeSangre implements AbstractFactory {


    @Override
    public InterfazCaballeros getCaballero(int type) {
        //AQUI SE PONDRA TODAS LAS ACCIONES QUE VA A REALIZAR LA RAZA CABALLEROS 
        //CREAR MILICIA,RECOLECTAR RECURSOS,ETC(return Caballeros(),return Serafin();
        
        switch(type){
            case 1:
                return new Caballeros();
            case 2: 
                return new Serafin();
            case 3:
                return new Recursos();
            default:
                System.out.println("Opcion equivocada");
        }
      
//        Scanner opciones1=new Scanner(System.in);
//        System.out.println("---------------------------------------");
//        System.out.println("|              Jugador 1              |");
//        System.out.println("---------------------------------------");
//        System.out.println("| 1. Creacion de Caballero            |");
//        System.out.println("| 2. Creacion de Paladin              |");
//        System.out.println("| 3. Creacion de Recursos             |");
//        System.out.println("| 4. Recoleccion de Recursos          |");
//        System.out.println("| 5. Recoleccion de Milicia           |");
////        System.out.println("|\t\t\t\t      |");
////        System.out.println("|\t\t\t\t      |");
//        System.out.println("---------------------------------------");
//        type=opciones1.nextInt();
    
        return null;
    }

    @Override
    public InterfazOrcos getOrcos(int type) {
        return null;
    }

    @Override
    public InterfazNecromantes getNecromantes(int type) {
            return null;
    }
    
}
