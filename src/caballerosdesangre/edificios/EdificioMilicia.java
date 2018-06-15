/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre.edificios;

import caballerosdesangre.Recursos;
import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class EdificioMilicia implements InterfazEdificiosCaballeros {

    private int vidaEdificioMilicia = 12500;
    private int costoConstruccion = 1600;
    private ArrayList<EdificioMilicia> AlmacenEdificio;

    public int getVidaEdificioMilicia() {
        return vidaEdificioMilicia;
    }

    public void setVidaEdificioMilicia(int vidaEdificioMilicia) {
        this.vidaEdificioMilicia = vidaEdificioMilicia;
    }

    public int getCostoConstruccion() {
        return costoConstruccion;
    }

    public void setCostoConstruccion(int costoConstruccion) {
        this.costoConstruccion = costoConstruccion;
    }
    
    public EdificioMilicia() {
        AlmacenEdificio = new ArrayList<>();
    }

    @Override
    public void CrearEdificio() {
        Recursos recursos = new Recursos();
       
        int porcion1=recursos.getCantidadOrbes()-1000;
        int porcion2=recursos.getCantidadOro()-600;
        
        if(porcion1<0 && porcion2<0){
            System.out.println("*** NO POSEES SUFICIENTES RECURSOS PARA CONSTRUIR EL EDIFICIO ***");
        }
        else if(porcion1<0 || porcion2<0){
            System.out.println("*** NO POSEES SUFICIENTES RECURSOS PARA CONSTRUIR EL EDIFICIO ***");
        }
        else {
            System.out.println("*** CONSTRUYENDO UN EDIFICIO CREADOR DE MADERA ***");
            EdificioMilicia edificioMilicia = new EdificioMilicia();
            AlmacenEdificio.add(edificioMilicia);
        }
    }

    
}
