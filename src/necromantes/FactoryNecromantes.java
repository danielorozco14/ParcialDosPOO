/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necromantes;

import caballerosdesangre.InterfazCaballeros;
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
        return null;
    }

    
    
}
