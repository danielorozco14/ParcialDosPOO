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
public class EdificioOro implements InterfazEdificiosCaballeros {

    private int vidaEdificioOro = 12500;
    private int costoConstruccion = 1600;
    private ArrayList<EdificioOro> AlmacenEdificioOro;

    public int getVidaEdificioOro() {
        return vidaEdificioOro;
    }

    public void setVidaEdificioOro(int vidaEdificioOro) {
        this.vidaEdificioOro = vidaEdificioOro;
    }

    public int getCostoConstruccion() {
        return costoConstruccion;
    }

    public void setCostoConstruccion(int costoConstruccion) {
        this.costoConstruccion = costoConstruccion;
    }
    
    

    @Override
    public void CrearEdificio() {
        Recursos recursos = new Recursos();

        int porcion1 = recursos.getCantidadMadera() - 950;
        int porcion2 = recursos.getCantidadOrbes() - 2100;

        if (porcion1 < 0 && porcion2 < 0) {
            System.out.println("*** NO POSEES SUFICIENTES RECURSOS PARA CONSTRUIR EL EDIFICIO ***");
        } else if (porcion1 < 0 || porcion2 < 0) {
            System.out.println("*** NO POSEES SUFICIENTES RECURSOS PARA CONSTRUIR EL EDIFICIO ***");
        } else {
            System.out.println("*** CONSTRUYENDO UN EDIFICIO CREADOR DE ORO ***");
            EdificioOro edificioOro = new EdificioOro();
            AlmacenEdificioOro.add(edificioOro);
        }
    }

}
