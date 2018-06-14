/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre.edificios;

import caballerosdesangre.InterfazCaballeros;
import danielorozco.world.AbstractFactory;
import necromantes.InterfazNecromantes;
import orcos.InterfazOrcos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryEdificiosCaballeros implements AbstractFactory { 

     @Override
    public InterfazEdificiosCaballeros getEdificios(int type) {
        switch(type){
            case 1:
                return new EdificioMadera();
            case 2: 
                return new EdificioMilicia();
            case 3:
                return new EdificioOrbes();
            case 4:
                return new EdificioOro();
            default:
                System.out.println("Opcion equivocada");
        }
        return null;
    }
    
    @Override
    public InterfazCaballeros getCaballero(int type) {
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
