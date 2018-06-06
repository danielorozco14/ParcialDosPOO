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
public interface InterfazCaballeros {

    Caballeros Crear();
    void Entrenar(Caballeros caballero);
    void Atacar(Caballeros caballero,int vidaEnemiga);
    void Defender(Caballeros caballero,int vidaAliada);
    
    Paladin CrearPaladin();
    void EntrenarPaladin(Paladin paladin);
    void AtacarPaladin(Paladin paladin);
    void DefenderPaladin(Paladin paladin);
    
    void RecolectarCaballero(Caballeros caballero);
    void RecolectarPaladin(Paladin paladin);
    
    void CrearRecursos(int a);
    
    void RecolectarMadera(int cantidadMadera);
    void RecolectarOrbes(int cantidadOrbes);
    void RecolectarOro(int cantidadOro);
}
