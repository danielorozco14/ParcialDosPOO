/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necromantes;

import caballerosdesangre.*;
import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Recursos implements InterfazNecromantes {

    private static ArrayList<Integer> RecursosCristal;
    private static ArrayList<Integer> RecursosHuesos;
    private static ArrayList<Integer> RecursosAlmas;

    private static int cantidadCristal=5000;
    private static int cantidadHuesos=10000;
    private static int cantidadAlmas=3000;//RECURSO MAS TARDADO DE OBTENER

    public static int getCantidadCristal() {
        return cantidadCristal;
    }

    public static void setCantidadCristal(int cantidadCristal) {
        Recursos.cantidadCristal = cantidadCristal;
    }

    public static int getCantidadHuesos() {
        return cantidadHuesos;
    }

    public static void setCantidadHuesos(int cantidadHuesos) {
        Recursos.cantidadHuesos = cantidadHuesos;
    }

    public static int getCantidadAlmas() {
        return cantidadAlmas;
    }

    public static void setCantidadAlmas(int cantidadAlmas) {
        Recursos.cantidadAlmas = cantidadAlmas;
    }

   
    public Recursos() {
        RecursosCristal = new ArrayList<>();
        RecursosAlmas = new ArrayList<>();
        RecursosHuesos = new ArrayList<>();
    }

    @Override
    public Esqueleto Crear() {
        return null;
    }



    @Override
    public SegadoresAlmas CrearSegador() {
        return null;
    }

    @Override
    public void RecolectarEsqueleto(Esqueleto esqueleto) {
    }

    @Override
    public void RecolectarSegador(SegadoresAlmas segador) {
    }

    @Override
    public void CrearRecursos(int a) {
        switch (a) {
            case 1:
                System.out.println("Creando recursos de cristal");
                setCantidadCristal(cantidadCristal+35);
                break;
            case 2:
                System.out.println("Creando recursos de huesos");
                setCantidadHuesos(cantidadHuesos+35);
                break;
            case 3:
                System.out.println("Creando recursos de almas");
                setCantidadAlmas(cantidadAlmas+35);
                break;
            default:
                System.out.println("No se ha seleccionado nada valido");
        }
    }

    @Override
    public void RecolectarCristales(int cantidadCristal) {
        RecursosCristal.add(cantidadCristal);
    }

    @Override
    public void RecolectarHuesos(int cantidadHuesos) {
        
        RecursosHuesos.add(cantidadHuesos);
    }

    @Override
    public void RecolectarAlmas(int cantidadAlmas) {
        RecursosAlmas.add(cantidadAlmas);
    }

    @Override
    public boolean ComprobarObjetos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean ComprobarRecursos() {
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
    public void EntrenarSegador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtacarSegador(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DefenderSegador(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

    
}
