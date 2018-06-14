/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos;

import caballerosdesangre.InterfazCaballeros;
import danielorozco.world.AbstractFactory;
import necromantes.InterfazNecromantes;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryOrcos implements AbstractFactory {

    @Override
    public InterfazCaballeros getCaballero(int type) {
        return null;
    }

    @Override
    public InterfazOrcos getOrcos(int type) {
        //AQUI SE PONDRA TODAS LAS ACCIONES QUE VA A REALIZAR LA RAZA ORCOS 
        //CREAR MILICIA,RECOLECTAR RECURSOS,ETC(return Orcos(),return DarkSwordman();
        switch(type){
            case 1:
                return new Orcos();//ESCUADRON
            case 2: 
                return new DarkSwordsman();//ESPECIALISTA
            case 3:
                return new Recursos();
            default:
                System.out.println("Opcion equivocada");
        }
        
        return null;
    }

    @Override
    public InterfazNecromantes getNecromantes(int type) {
        return null;
    }

    
    
}
