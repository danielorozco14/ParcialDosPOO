/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos;

import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Recursos implements InterfazOrcos{

    private static ArrayList<Integer> RecursosOrbesOscuros;
    private static ArrayList<Integer> RecursosRocas;
    private static ArrayList<Integer> RecursosDiamantes;

    private static int cantidadOrbesOscuros=5000;
    private static int cantidadRocas=10000;
    private static int cantidadDiamantes=3000;//RECURSO MAS TARDADO DE OBTENER

    public static int getCantidadOrbesOscuros() {
        return cantidadOrbesOscuros;
    }

    public static void setCantidadOrbesOscuros(int cantidadOrbesOscuros) {
        Recursos.cantidadOrbesOscuros = cantidadOrbesOscuros;
    }

    public static int getCantidadRocas() {
        return cantidadRocas;
    }

    public static void setCantidadRocas(int cantidadRocas) {
        Recursos.cantidadRocas = cantidadRocas;
    }

    public static int getCantidadDiamantes() {
        return cantidadDiamantes;
    }

    public static void setCantidadDiamantes(int cantidadDiamantes) {
        Recursos.cantidadDiamantes = cantidadDiamantes;
    }
   
    public Recursos() {
        RecursosOrbesOscuros = new ArrayList<>();
        RecursosRocas = new ArrayList<>();
        RecursosDiamantes = new ArrayList<>();
    }

    @Override
    public boolean ComprobarObjetos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orcos Crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Atacar(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Defender(int vidaAliada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DarkSwordsman CrearSwordman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EntrenarSwordman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtacarSwordman(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DefenderSwordman(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarOrco(Orcos orco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarSwordman(DarkSwordsman swordman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearRecursos(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ComprobarRecursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarDiamantes(int cantidadDiamantes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarOrbesOscuros(int cantidadOrbesOscuros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarRocas(int cantidadRocas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

    

   

    
}
