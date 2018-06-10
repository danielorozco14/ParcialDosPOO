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
    
    

    @Override
    public SegadoresAlmas CrearSegador() {
        //AQUI VA EL CODIGO PARA CREAR A LOS ESQUELETOS
        System.out.println("CREANDO Segador de Alma ESPERE 15 SEGUNDOS");
        System.out.println("\t\tCreando Caballeros!! ");
        SegadoresAlmas segador = new SegadoresAlmas();
        for (int i = 1; i < 15; i++) {
            while (i <= 5) {
                System.out.print("Creando...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                i++;
            }

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
        }

        setVidaSegador(1900);
        setPuntosAtaque(900);
        System.out.println("\nUNIDAD DE ESQUELETOS CREADA CON EXITO!!\n\n");
        return segador;
    }

    @Override
    public void EntrenarSegador(SegadoresAlmas segador) {
        //AQUI VA EL CODIGO PARA ENTRENAR A LOS CABALLEROS ALMACENADOS EN LA 
        //EDIFICACION CORRESPONDIENTE
        if (segador instanceof SegadoresAlmas) {
            System.out.println("Se ha seleccionado una unidad de Segador de Almas,"
                    + "se procedera a entrenarlo y ponerlo en el arrayList");
            System.out.println("UNIDAD DE SEGADOR EN ENTRENAMIENTO");
            System.out.println("Entrenando Segador...Espere 10 segundos ");
            for (int i = 1; i < 10; i++) {
                System.out.print("Entrenando...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            System.out.println("\nUnidad de Segador Entrenada");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
        } else {
            System.out.println("Aun no se han creado Segadores para poder ENTRENAR");
        }
    }
    @Override
    public void RecolectarSegador(SegadoresAlmas segador) {
        if (segador instanceof SegadoresAlmas) {
            System.out.println("RECOLECTANDO MILICIA!!");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
            AlmacenSegadores.add(segador);
        } else {
            System.out.println("Aun no se han creado Segadores para poder recolectar");
        }
    }

    @Override
    public void AtacarSegador(SegadoresAlmas segador) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if (segador instanceof SegadoresAlmas) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de esqueletos Atacando!!!");
            //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
        }
    }
    
    

    @Override
    public void DefenderSegador(SegadoresAlmas segador) {
        System.out.println("Unidad de esqueletos Defendiendo!!!");
        //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
    }

    @Override
    public void RecolectarEsqueleto(Esqueleto esqueleto) {
    }

    

    @Override
    public void CrearRecursos(int a) {
    }

    @Override
    public void RecolectarCristales(int cantidadCristal) {
    }

    @Override
    public void RecolectarHuesos(int cantidadHuesos) {
    }

    @Override
    public void RecolectarAlmas(int cantidadAlmas) {
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
    
}
