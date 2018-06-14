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
public class Esqueleto implements InterfazNecromantes {

    private static int vidaEsqueleto, puntosAtaque;

    private static ArrayList<Esqueleto> AlmacenEsqueletos;

    public static int getVidaEsqueleto() {
        return vidaEsqueleto;
    }

    public static void setVidaEsqueleto(int vidaEsqueleto) {
        Esqueleto.vidaEsqueleto = vidaEsqueleto;
    }

    public static int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        Esqueleto.puntosAtaque = puntosAtaque;
    }

    public Esqueleto() {
        AlmacenEsqueletos = new ArrayList<>();
    }

    @Override
    public Esqueleto Crear() {
        //AQUI VA EL CODIGO PARA CREAR A LOS ESQUELETOS
        System.out.println("CREANDO ESCUADRON DE ESQUELETOS ESPERE 15 SEGUNDOS");
        System.out.println("\t\tCreando Caballeros!! ");
        Esqueleto esqueleto = new Esqueleto();
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

        setVidaEsqueleto(819);
        setPuntosAtaque(600);
        System.out.println("\nUNIDAD DE ESQUELETOS CREADA CON EXITO!!\n\n");
        return esqueleto;
    }

    @Override
    public void Entrenar() {
        //AQUI VA EL CODIGO PARA ENTRENAR A LOS CABALLEROS ALMACENADOS EN LA 
        //EDIFICACION CORRESPONDIENTE
        if (ComprobarObjetos()) {
            System.out.println("Se ha seleccionado una unidad de esqueletos,"
                    + "se procedera a entrenarlos y ponerlos en el arrayList");
            System.out.println("UNIDAD DE ESQUELETOS EN ENTRENAMIENTO");
            System.out.println("Entrenando Esqueletos...Espere 10 segundos ");
            for (int i = 1; i < 10; i++) {
                System.out.print("Entrenando...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            System.out.println("\nUnidad de Esqueletos Entrenada");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
        } else {
            System.out.println("Aun no se han creado Esqueletos para poder ENTRENAR");
        }
    }

    @Override
    public void Atacar(int vidaEnemiga) {

        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if (ComprobarObjetos()) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de esqueletos Atacando!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        } else {
            System.out.println("No se han creado Esqueletos");
        }

    }

    @Override
    public void Defender(int vidaAliada) {
        if (ComprobarObjetos()) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de Esqueletos Defendiendo!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        }

    }

    @Override
    public void RecolectarEsqueleto(Esqueleto esqueleto) {
        if (esqueleto instanceof Esqueleto) {
            System.out.println("RECOLECTANDO MILICIA!!");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
            AlmacenEsqueletos.add(esqueleto);
        } else {
            System.out.println("Aun no se han creado Esqueletos para poder recolectar");
        }
    }
    
    @Override
    public boolean ComprobarObjetos() {
           int cont = 0, cont1 = 0;

        for (Esqueleto esqueleto : AlmacenEsqueletos) {

            if (AlmacenEsqueletos.contains(esqueleto) && cont == 0) {
                return true;
            } else if (AlmacenEsqueletos.contains(esqueleto) && cont != 0) {
                return true;
            } else if (AlmacenEsqueletos.contains(esqueleto) == false) {
                cont1++;
                if (AlmacenEsqueletos.size() == cont1) {
                    System.out.println("No existen Caballeros entrenados");
                }
            }
            cont++;
        }
        return false;
    }

    @Override
    public boolean ComprobarRecursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SegadoresAlmas CrearSegador() {
        return null;
    }

    @Override
    public void EntrenarSegador() {
    }

    @Override
    public void AtacarSegador(int vidaEnemiga) {
    }

    @Override
    public void DefenderSegador(int vidaEnemiga) {
    }

    @Override
    public void RecolectarSegador(SegadoresAlmas segador) {
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

    

}
