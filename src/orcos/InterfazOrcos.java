/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public interface InterfazOrcos {
    boolean ComprobarObjetos();
    Orcos Crear();
    void Entrenar();
    void Atacar( int vidaEnemiga);
    void Defender(int vidaAliada);
    
    DarkSwordsman CrearSwordman();
    void EntrenarSwordman();
    void AtacarSwordman(int vidaEnemiga);
    void DefenderSwordman(int vidaEnemiga);
    
    void RecolectarOrco(Orcos orco);
    void RecolectarSwordman(DarkSwordsman swordman);
    
    void CrearRecursos(int a);
    boolean ComprobarRecursos();
    void RecolectarDiamantes(int cantidadDiamantes);
    void RecolectarOrbesOscuros(int cantidadOrbesOscuros);
    void RecolectarRocas(int cantidadRocas);

}
