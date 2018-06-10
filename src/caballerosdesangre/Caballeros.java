/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre;

import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
/**
 * Implementa los aspectos basicos del tipo de milicia "Caballeros"
 *
 */
public class Caballeros  implements InterfazCaballeros  {

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
        if (caballero instanceof Caballeros) {
            System.out.println("RECOLECTANDO MILICIA!!");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
            AlmacenCaballeros.add(caballero);
        } else {
            System.out.println("Aun no se han creado Caballeros para poder recolectar");
        }
    }

    @Override
    public void Entrenar(Caballeros caballero) {
        //AQUI VA EL CODIGO PARA ENTRENAR A LOS CABALLEROS ALMACENADOS EN LA 
        //EDIFICACION CORRESPONDIENTE
        if (caballero instanceof Caballeros) {
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
    public void Atacar(Caballeros caballero, int vidaEnemiga) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if (caballero instanceof Caballeros) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de caballeros Atacando!!!");
            //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
        }
    }

    @Override
    public void Defender(Caballeros caballero, int vidaAliada) {
        System.out.println("Unidad de caballeros Defendiendo!!!");
        //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();

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
    public void EntrenarSerafin(Serafin paladin) {
    }

    @Override
    public void AtacarSerafin(Serafin paladin) {
    }

    @Override
    public void DefenderSerafin(Serafin paladin) {
    }

    @Override
    public void RecolectarSerafin(Serafin serafin) {
    }

}
