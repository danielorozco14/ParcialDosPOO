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
public class Paladin implements InterfazCaballeros {

    private static int vidaPaladin, puntosAtaque;
    private static ArrayList<Paladin> AlmacenPaladin;

    public static int getVidaPaladin() {
        return vidaPaladin;
    }

    public static void setVidaPaladin(int vidaPaladin) {
        Paladin.vidaPaladin = vidaPaladin;
    }

    public static int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        Paladin.puntosAtaque = puntosAtaque;
    }
    
    public Paladin(){
        AlmacenPaladin = new ArrayList<>();
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
    public Paladin CrearPaladin() {
        //AQUI VA EL CODIGO PARA CREAR A LOS CABALLEROS
        System.out.println("CREANDO PALADIN ESPERE 25 SEGUNDOS");
        System.out.println("\t\tCreando Paladin!! ");
        Paladin paladin = new Paladin();
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

        setVidaPaladin(10000);
        setPuntosAtaque(1036);
        System.out.println("\nPALADIN CREADO CON EXITO!!\n\n");
        return paladin;
    }
    
    @Override
    public void RecolectarPaladin(Paladin paladin) {
        if (paladin instanceof Paladin) {
            System.out.println("RECOLECTANDO PALADIN!!");
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
            AlmacenPaladin.add(paladin);
        } else {
            System.out.println("Aun no se han creado Caballeros para poder recolectar");
        }
    }


    @Override
    public void EntrenarPaladin(Paladin paladin) {
        if (paladin instanceof Paladin) {
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
    public void AtacarPaladin(Paladin paladin) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if (paladin instanceof Paladin) {
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Paladin Atacando!!!");
            //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
        }
    }

    @Override
    public void DefenderPaladin(Paladin paladin) {
         System.out.println("Unidad de Paladin Defendiendo!!!");
        //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
    }

    @Override
    public void RecolectarCaballero(Caballeros caballero) {
    }

    
    @Override
    public void RecolectarMadera(RecursoMadera madera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarOrbes(RecursoOrbesLuz orbes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarOro(RecursoOro oro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CrearRecursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
