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
    
    Serafin CrearSerafin();
    void EntrenarSerafin(Serafin paladin);
    void AtacarSerafin(Serafin paladin);
    void DefenderSerafin(Serafin paladin);
    
    void RecolectarCaballero(Caballeros caballero);
    void RecolectarSerafin(Serafin serafin);
    
    void CrearRecursos(int a);
    
    void RecolectarMadera(int cantidadMadera);
    void RecolectarOrbes(int cantidadOrbes);
    void RecolectarOro(int cantidadOro);
}
