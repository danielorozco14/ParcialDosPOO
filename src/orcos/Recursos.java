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
        return false;
    }

    @Override
    public Orcos Crear() {
        return null;
    }

    @Override
    public void Entrenar() {
    }

    @Override
    public void Atacar(int vidaEnemiga) {
    }

    @Override
    public void Defender(int vidaAliada) {
    }

    @Override
    public DarkSwordsman CrearSwordman() {
        return null;
    }

    @Override
    public void EntrenarSwordman() {
    }

    @Override
    public void AtacarSwordman(int vidaEnemiga) {
    }

    @Override
    public void DefenderSwordman(int vidaEnemiga) {
    }

    @Override
    public void RecolectarOrco(Orcos orco) {
    }

    @Override
    public void RecolectarSwordman(DarkSwordsman swordman) {
    }

    @Override
    public void CrearRecursos(int a) {
    }

    @Override
    public boolean ComprobarRecursos() {
        return false;
    }

    @Override
    public void RecolectarDiamantes(int cantidadDiamantes) {
    }

    @Override
    public void RecolectarOrbesOscuros(int cantidadOrbesOscuros) {
    }

    @Override
    public void RecolectarRocas(int cantidadRocas) {
    }

    

   

    

   

    
}
