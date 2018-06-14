/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necromantes;

import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class SegadoresAlmas implements InterfazNecromantes {
    
    private static int vidaSegador, puntosAtaque;
    
    private static ArrayList<SegadoresAlmas> AlmacenSegadores;

    public static int getVidaSegador() {
        return vidaSegador;
    }

    public static void setVidaSegador(int vidaSegador) {
        SegadoresAlmas.vidaSegador = vidaSegador;
    }

    public static int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        SegadoresAlmas.puntosAtaque = puntosAtaque;
    }
    
    public SegadoresAlmas(){
        AlmacenSegadores = new ArrayList<>();
    }

    @Override
    public boolean ComprobarObjetos() {
        int cont = 0, cont1 = 0;

        for (SegadoresAlmas segador : AlmacenSegadores) {

            if (AlmacenSegadores.contains(segador) && cont == 0) {
                return true;
            } else if (AlmacenSegadores.contains(segador) && cont != 0) {
                return true;
            } else if (AlmacenSegadores.contains(segador) == false) {
                cont1++;
                if (AlmacenSegadores.size() == cont1) {
                    return false;
                }
            }
            cont++;
        }
        return false;
    }

    @Override
    public Esqueleto Crear() {
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
    public SegadoresAlmas CrearSegador() {
       
        System.out.println("CREANDO SEGADOR ESPERE 25 SEGUNDOS");
        System.out.println("\t\tCreando Serafin!! ");
        SegadoresAlmas segador = new SegadoresAlmas();
        for (int i = 1; i < 25; i++) {
            while (i <= 10) {
                System.out.print("Creando...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                i++;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

        setVidaSegador(10000);
        setPuntosAtaque(1036);
        System.out.println("\nSEGADOR CREADO CON EXITO!!\n\n");
        return segador;
    }

    @Override
    public void EntrenarSegador() {
        System.out.println("Se ha seleccionado un Serafin,"
                    + "se procedera a entrenarlo y ponerlo en el arrayList");
            System.out.println("SEGADOR EN ENTRENAMIENTO");
            System.out.println("Entrenando Segador de Almas...Espere 20 segundos ");
            for (int i = 1; i < 20; i++) {
                while (i <= 10) {
                    System.out.print("Entrenando...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    i++;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            System.out.println("\nUNIDAD DE SEGADOR ENTRENADA CON EXITO!!");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
       
            System.out.println("Aun no se ha creado un Segador para poder ENTRENAR");
    }

    @Override
    public void AtacarSegador(int vidaEnemiga) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if(ComprobarObjetos()){
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Segador de Almas Atacando!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        }else{
            System.out.println("No se han creado Segadores");
        }
    }

    @Override
    public void DefenderSegador(int vidaEnemiga) {
        System.out.println("Unidad de Segador Defendiendo!!!");
        //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
    }

    @Override
    public void RecolectarEsqueleto(Esqueleto esqueleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarSegador(SegadoresAlmas segador) {
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
    public void RecolectarCristales(int cantidadCristal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarHuesos(int cantidadHuesos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarAlmas(int cantidadAlmas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

    
}
