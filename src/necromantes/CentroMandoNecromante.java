/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necromantes;

import java.util.Scanner;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class CentroMandoNecromante {
    private static int vidaHQ;
    private static CentroMandoNecromante hq;

    public int getVidaHQ() {
        return vidaHQ;
    }

    public void setVidaHQ(int vidaHQ) {
        this.vidaHQ = vidaHQ;
    }

    private CentroMandoNecromante() {
    }

    public static CentroMandoNecromante getInstance() {
        if (hq == null) {
            hq = new CentroMandoNecromante();
        }
        return hq;
    }

    public void CentroMandoCaballero() {
        Scanner opcion = new Scanner(System.in);
        setVidaHQ(20000);
        Recursos tipoRecurso = new Recursos();
        System.out.println("******** CENTRO DE MANDO CABALLEROS DE SANGRE *********");
        System.out.println("\t\t1. Recolectar Recursos Cristal");
        System.out.println("\t\t2. Recolectar Recursos Almas");
        System.out.println("\t\t3. Recolectar Recursos Huesos");

        switch (opcion.nextInt()) {
            case 1:
                System.out.println("Cantidad de cristal a Recolectar: " + Recursos.getCantidadCristal());
                tipoRecurso.RecolectarCristales(Recursos.getCantidadCristal());
                break;
            case 2:
                System.out.println("Cantidad de almas a Recolectar: " + Recursos.getCantidadAlmas());
                tipoRecurso.RecolectarAlmas(Recursos.getCantidadAlmas());
                break;

            case 3:
                System.out.println("Cantidad de huesos a Recolectar: " + Recursos.getCantidadHuesos());
                tipoRecurso.RecolectarHuesos(Recursos.getCantidadHuesos());
                break;
        }

    }

}
