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
    
    Serafin CrearPaladin();
    void EntrenarPaladin(Serafin paladin);
    void AtacarPaladin(Serafin paladin);
    void DefenderPaladin(Serafin paladin);
    
    void RecolectarCaballero(Caballeros caballero);
    void RecolectarPaladin(Serafin paladin);
    
    void CrearRecursos(int a);
    
    void RecolectarMadera(int cantidadMadera);
    void RecolectarOrbes(int cantidadOrbes);
    void RecolectarOro(int cantidadOro);
}
