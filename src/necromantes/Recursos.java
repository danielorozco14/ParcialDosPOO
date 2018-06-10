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

    private static int cantidadCristal=0;
    private static int cantidadHuesos=0;
    private static int cantidadAlmas=0;

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
    public void Entrenar(Esqueleto esqueleto) {
    }

    @Override
    public void Atacar(Esqueleto esqueleto, int vidaEnemiga) {
    }

    @Override
    public void Defender(Esqueleto esqueleto, int vidaAliada) {
    }

    @Override
    public SegadoresAlmas CrearSegador() {
        return null;
    }

    @Override
    public void EntrenarSegador(SegadoresAlmas segador) {
    }

    @Override
    public void AtacarSegador(SegadoresAlmas segador) {
    }

    @Override
    public void DefenderSegador(SegadoresAlmas segador) {
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
                setCantidadCristal(cantidadCristal+15);
                break;
            case 2:
                setCantidadHuesos(cantidadHuesos+15);
                break;
            case 3:
                setCantidadAlmas(cantidadAlmas+15);
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

    

   

    
}
