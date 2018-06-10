/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielorozco.world;

import caballerosdesangre.InterfazCaballeros;
import necromantes.InterfazNecromantes;
import orcos.InterfazOrcos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public interface AbstractFactory {
    InterfazCaballeros getCaballero(int type);
    InterfazOrcos getOrcos(int type);
    InterfazNecromantes getNecromantes(int type);
}
