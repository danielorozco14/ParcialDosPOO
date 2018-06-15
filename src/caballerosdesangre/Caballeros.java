/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre;

import caballerosdesangre.edificios.EdificioMadera;
import caballerosdesangre.edificios.EdificioOrbes;
import caballerosdesangre.edificios.EdificioOro;
import danielorozco.world.FactoryProducer;
import danielorozco.world.Juego;
import danielorozco.world.MenuJuego;
import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
/**
 * Implementa los aspectos basicos del tipo de milicia "Caballeros"
 *
 */
public class Caballeros implements InterfazCaballeros {

    private static int vidaCaballero, puntosAtaque;

    private static ArrayList<Caballeros> AlmacenCaballeros;

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        Caballeros.puntosAtaque = puntosAtaque;
    }

    public int getVidaCaballero() {
        return vidaCaballero;
    }

    public void setVidaCaballero(int vida) {
        Caballeros.vidaCaballero = vida;
    }

    public Caballeros() {
        AlmacenCaballeros = new ArrayList<>();
    }

    @Override
    public Caballeros Crear() {
        //AQUI VA EL CODIGO PARA CREAR A LOS CABALLEROS
        System.out.println("CREANDO ESCUADRON DE CABALLEROS ESPERE 15 SEGUNDOS");
        System.out.println("\t\tCreando Caballeros!! ");
        Caballeros caballero = new Caballeros();
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

        setVidaCaballero(1000);
        setPuntosAtaque(425);
        System.out.println("\nUNIDAD DE CABALLEROS CREADA CON EXITO!!\n\n");
        return caballero;
    }

    @Override
    public void RecolectarCaballero(Caballeros caballero) {
        //EL PAQUETE DE EDIFICIOS IMPLEMENTARA ESTA INTERFAZ Y HARA LAS LABORES DE RECOLECCION DE RECURSOS
    }

    @Override
    public void Entrenar() {
        //AQUI VA EL CODIGO PARA ENTRENAR A LOS CABALLEROS ALMACENADOS EN LA 
        //EDIFICACION CORRESPONDIENTE
        if (ComprobarObjetos()) {
            System.out.println("Se ha seleccionado una unidad de caballeros,"
                    + "se procedera a entrenarlos y ponerlos en el arrayList");
            System.out.println("UNIDAD DE CABALLEROS EN ENTRENAMIENTO");
            System.out.println("Entrenando Caballeros...Espere 10 segundos ");
            for (int i = 1; i < 10; i++) {
                System.out.print("Entrenando...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            System.out.println("\nUnidad de Caballeros Entrenada");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
        } else {
            System.out.println("Aun no se han creado Caballeros para poder ENTRENAR");
        }
    }

    @Override
    public void Atacar(int vidaEnemiga) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if (ComprobarObjetos()) {
            System.out.println("Unidad de caballeros Atacando!!!");
            Juego obtenerDatos = new Juego();
            MenuJuego menuJuego = new MenuJuego();
            if (menuJuego.getOpcionRaza2() == 1) {
                EdificioMadera vidaEdificio = new EdificioMadera();
                vidaEdificio.setVidaEdificioMadera(vidaEdificio.getVidaEdificioMadera()-puntosAtaque);
            }else if(menuJuego.getOpcionRaza2()==2){
                EdificioOrbes vidaEdificio = new EdificioOrbes();
                vidaEdificio.setVidaEdificioOrbes(vidaEdificio.getVidaEdificioOrbes()-puntosAtaque);
            }else if(menuJuego.getOpcionRaza2()==3){
                EdificioOro vidaEdificio = new EdificioOro();
                vidaEdificio.setVidaEdificioOro(vidaEdificio.getVidaEdificioOro()-puntosAtaque);
            }

        } else {
            System.out.println("No se han creado Caballeros");
        }

    }

    @Override
    public void Defender(int vidaAliada) {
        System.out.println("Unidad de caballeros Defendiendo!!!");
        if (ComprobarObjetos()) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de caballeros Defendiendo!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        }

    }

    @Override
    public void CrearRecursos(int a) {
    }

    @Override
    public void RecolectarMadera(int cantidadMadera) {
    }

    @Override
    public void RecolectarOrbes(int cantidadOrbes) {
    }

    @Override
    public void RecolectarOro(int cantidadOro) {
    }

    @Override
    public Serafin CrearSerafin() {
        return null;
    }

    @Override
    public boolean ComprobarObjetos() {

        int cont = 0, cont1 = 0;

        for (Caballeros caballero : AlmacenCaballeros) {

            if (AlmacenCaballeros.contains(caballero) && cont == 0) {
                return true;
            } else if (AlmacenCaballeros.contains(caballero) && cont != 0) {
                return true;
            } else if (AlmacenCaballeros.contains(caballero) == false) {
                cont1++;
                if (AlmacenCaballeros.size() == cont1) {
                    System.out.println("No existen Caballeros entrenados");
                }
            }
            cont++;
        }
        return false;
    }

    @Override
    public void EntrenarSerafin() {
    }

    @Override
    public void AtacarSerafin() {
    }

    @Override
    public void DefenderSerafin() {
    }

    @Override
    public void RecolectarSerafin(Serafin serafin) {
    }

    @Override
    public boolean ComprobarRecursos(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
