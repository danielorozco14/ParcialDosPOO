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
public class EdificioOrbes implements InterfazEdificiosCaballeros {

     private int vidaEdificioOrbes = 12500;
    private int costoConstruccion = 1600;
    private ArrayList<EdificioOrbes> AlmacenEdificioOrbes;

    public int getVidaEdificioOrbes() {
        return vidaEdificioOrbes;
    }

    public void setVidaEdificioOrbes(int vidaEdificioOrbes) {
        this.vidaEdificioOrbes = vidaEdificioOrbes;
    }

    public int getCostoConstruccion() {
        return costoConstruccion;
    }

    public void setCostoConstruccion(int costoConstruccion) {
        this.costoConstruccion = costoConstruccion;
    }
    public void EdificioOrbes(){
        AlmacenEdificioOrbes= new ArrayList<>();
    }
    
    
    @Override
    public void CrearEdificio() {
        Recursos recursos = new Recursos();
       
        int porcion1=recursos.getCantidadMadera()-1250;
        int porcion2=recursos.getCantidadOro()-1000;
        
        if(porcion1<0 && porcion2<0){
            System.out.println("*** NO POSEES SUFICIENTES RECURSOS PARA CONSTRUIR EL EDIFICIO ***");
        }
        else if(porcion1<0 || porcion2<0){
            System.out.println("*** NO POSEES SUFICIENTES RECURSOS PARA CONSTRUIR EL EDIFICIO ***");
        }
        else {
            System.out.println("*** CONSTRUYENDO UN EDIFICIO CREADOR DE ORBES ***");
            EdificioOrbes edificioOrbes = new EdificioOrbes();
            AlmacenEdificioOrbes.add(edificioOrbes);
        }
    }
    
}
