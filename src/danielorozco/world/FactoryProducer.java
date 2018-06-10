/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;

import caballerosdesangre.FactoryCaballerosDeSangre;
import necromantes.FactoryNecromantes;
import orcos.FactoryOrcos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(int type) {
        switch (type) {
            case 1:
                return new FactoryCaballerosDeSangre();
            case 2:
                return new FactoryNecromantes();
            case 3:
                return new FactoryOrcos();
        }
        return null;

    }
}
