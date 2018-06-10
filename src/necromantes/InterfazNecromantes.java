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
    Esqueleto Crear();
    void Entrenar(Esqueleto esqueleto);
    void Atacar(Esqueleto esqueleto,int vidaEnemiga);
    void Defender(Esqueleto esqueleto,int vidaAliada);
    
    SegadoresAlmas CrearSegador();
    void EntrenarSegador(SegadoresAlmas segador);
    void AtacarSegador(SegadoresAlmas segador);
    void DefenderSegador( SegadoresAlmas segador);
    
    void RecolectarEsqueleto(Esqueleto esqueleto);
    void RecolectarSegador(SegadoresAlmas segador);
    
    void CrearRecursos(int a);
    
    void RecolectarCristales(int cantidadCristal);
    void RecolectarHuesos(int cantidadHuesos);
    void RecolectarAlmas(int cantidadAlmas);

}
