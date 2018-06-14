/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necromantes;

import caballerosdesangre.InterfazCaballeros;
import caballerosdesangre.edificios.InterfazEdificiosCaballeros;
import danielorozco.world.AbstractFactory;
import orcos.InterfazOrcos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryNecromantes implements AbstractFactory{

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
        //AQUI SE PONDRA TODAS LAS ACCIONES QUE VA A REALIZAR LA RAZA CABALLEROS 
        //CREAR MILICIA,RECOLECTAR RECURSOS,ETC(return Caballeros(),return Serafin();
        
        switch(type){
            case 1:
                return new Esqueleto();
            case 2: 
                return new SegadoresAlmas();
            case 3:
                return new Recursos();
            default:
                System.out.println("Opcion equivocada");
        }
        return null;
    }

    @Override
    public InterfazEdificiosCaballeros getEdificios(int type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
