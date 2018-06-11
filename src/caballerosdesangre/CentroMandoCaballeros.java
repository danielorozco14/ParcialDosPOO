/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre;

import java.util.Scanner;
import danielorozco.world.Juego;

/**
 * ENCARGADO DE ALMACENAR LOS RECURSOS DE LA RAZA CABALLEROS
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class CentroMandoCaballeros {

    private static int vidaHQ;
    private static CentroMandoCaballeros hq;

    public int getVidaHQ() {
        return vidaHQ;
    }

    public void setVidaHQ(int vidaHQ) {
        this.vidaHQ = vidaHQ;
    }

    private CentroMandoCaballeros() {
    }

    public static CentroMandoCaballeros getInstance() {
        if (hq == null) {
            hq = new CentroMandoCaballeros();
        }
        return hq;
    }

    public void CentroMandoCaballero() {
        Scanner opcion = new Scanner(System.in);
        setVidaHQ(20000);
        Recursos tipoRecurso = new Recursos();
        System.out.println("******** CENTRO DE MANDO CABALLEROS DE SANGRE *********");
        System.out.println("\t\t1. Recolectar Recursos Madera");
        System.out.println("\t\t2. Recolectar Recursos Orbes");
        System.out.println("\t\t3. Recolectar Recursos Oro");

        switch (opcion.nextInt()) {
            case 1:
                System.out.println("Cantidad de madera a Recolectar: " + tipoRecurso.getCantidadMadera());
                tipoRecurso.RecolectarMadera(tipoRecurso.getCantidadMadera());
                break;
            case 2:
                System.out.println("Cantidad de orbes a Recolectar: " + tipoRecurso.getCantidadOrbes());
                tipoRecurso.RecolectarOrbes(tipoRecurso.getCantidadOrbes());
                break;

            case 3:
                System.out.println("Cantidad de orbes a Recolectar: " + tipoRecurso.getCantidadOro());
                tipoRecurso.RecolectarOrbes(tipoRecurso.getCantidadOro());
                break;
        }

    }

}
