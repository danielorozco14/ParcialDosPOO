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
public class Serafin implements InterfazCaballeros {

    private static int vidaSerafin, puntosAtaque;
    private static ArrayList<Serafin> AlmacenSerafin;

    public static int getVidaSerafin() {
        return vidaSerafin;
    }

    public static void setVidaSerafin(int vidaSerafin) {
        Serafin.vidaSerafin = vidaSerafin;
    }

    public static int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        Serafin.puntosAtaque = puntosAtaque;
    }
    
    public Serafin(){
        AlmacenSerafin = new ArrayList<>();
    }
    @Override
    public Caballeros Crear() {
        return null;
    }

    @Override
    public void Entrenar(Caballeros caballero) {
    }

    @Override
    public void Atacar(Caballeros caballero, int vidaEnemiga) {
    }

    @Override
    public void Defender(Caballeros caballero, int vidaAliada) {
    }

    @Override
    public Serafin CrearPaladin() {
        //AQUI VA EL CODIGO PARA CREAR A LOS CABALLEROS
        System.out.println("CREANDO PALADIN ESPERE 25 SEGUNDOS");
        System.out.println("\t\tCreando Paladin!! ");
        Serafin paladin = new Serafin();
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

        setVidaSerafin(10000);
        setPuntosAtaque(1036);
        System.out.println("\nPALADIN CREADO CON EXITO!!\n\n");
        return paladin;
    }
    
    @Override
    public void RecolectarPaladin(Serafin paladin) {
        if (paladin instanceof Serafin) {
            System.out.println("RECOLECTANDO PALADIN!!");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
            AlmacenSerafin.add(paladin);
        } else {
            System.out.println("Aun no se han creado Caballeros para poder recolectar");
        }
    }


    @Override
    public void EntrenarPaladin(Serafin paladin) {
        if (paladin instanceof Serafin) {
            System.out.println("Se ha seleccionado un Paladin,"
                    + "se procedera a entrenarlo y ponerlo en el arrayList");
            System.out.println("PALADIN EN ENTRENAMIENTO");
            System.out.println("Entrenando Paladin...Espere 20 segundos ");
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

            System.out.println("\nUNIDAD DE PALADIN ENTRENADA CON EXITO!!");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
        } else {
            System.out.println("Aun no se ha creado un Paladin para poder ENTRENAR");
        }
    }

    @Override
    public void AtacarPaladin(Serafin paladin) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if (paladin instanceof Serafin) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Paladin Atacando!!!");
            //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
        }
    }

    @Override
    public void DefenderPaladin(Serafin paladin) {
         System.out.println("Unidad de Paladin Defendiendo!!!");
        //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
    }

    @Override
    public void RecolectarCaballero(Caballeros caballero) {
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

}
