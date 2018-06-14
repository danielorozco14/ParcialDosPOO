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

    boolean ComprobarObjetos();
    Caballeros Crear();
    void Entrenar();
    void Atacar(int vidaEnemiga);
    void Defender(int vidaAliada);
    
    Serafin CrearSerafin();
    void EntrenarSerafin();
    void AtacarSerafin();
    void DefenderSerafin();
    
    void RecolectarCaballero(Caballeros caballero);
    void RecolectarSerafin(Serafin serafin);
    
    void CrearRecursos(int a);
    boolean ComprobarRecursos(int a);
    void RecolectarMadera(int cantidadMadera);
    void RecolectarOrbes(int cantidadOrbes);
    void RecolectarOro(int cantidadOro);
}
