/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necromantes;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public interface InterfazNecromantes {
    boolean ComprobarObjetos();
    Esqueleto Crear();
    void Entrenar();
    void Atacar( int vidaEnemiga);
    void Defender(int vidaAliada);
    
    SegadoresAlmas CrearSegador();
    void EntrenarSegador();
    void AtacarSegador(int vidaEnemiga);
    void DefenderSegador(int vidaEnemiga);
    
    void RecolectarEsqueleto(Esqueleto esqueleto);
    void RecolectarSegador(SegadoresAlmas segador);
    
    void CrearRecursos(int a);
    boolean ComprobarRecursos();
    void RecolectarCristales(int cantidadCristal);
    void RecolectarHuesos(int cantidadHuesos);
    void RecolectarAlmas(int cantidadAlmas);

}
