/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos;

import java.util.ArrayList;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class DarkSwordsman implements InterfazOrcos {
    
   private static int vidaSwordman, puntosAtaque;
    
    private static ArrayList<DarkSwordsman> AlmacenSwordsman;

    public static int getVidaSwordman() {
        return vidaSwordman;
    }

    public static void setVidaSwordman(int vidaSwordman) {
        DarkSwordsman.vidaSwordman = vidaSwordman;
    }

    public static int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        DarkSwordsman.puntosAtaque = puntosAtaque;
    }
    
    public DarkSwordsman(){
        AlmacenSwordsman= new ArrayList<>();
    }
    
    
    @Override
    public boolean ComprobarObjetos() {
        int cont = 0, cont1 = 0;

        for (DarkSwordsman swordsman : AlmacenSwordsman) {

            if (AlmacenSwordsman.contains(swordsman) && cont == 0) {
                return true;
            } else if (AlmacenSwordsman.contains(swordsman) && cont != 0) {
                return true;
            } else if (AlmacenSwordsman.contains(swordsman) == false) {
                cont1++;
                if (AlmacenSwordsman.size() == cont1) {
                    return false;
                }
            }
            cont++;
        }
        return false;
    }

    @Override
    public Orcos Crear() {
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
    public DarkSwordsman CrearSwordman() {
        System.out.println("CREANDO SEGADOR ESPERE 25 SEGUNDOS");
        System.out.println("\t\tCreando Serafin!! ");
        DarkSwordsman swordsman = new DarkSwordsman();
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

        setVidaSwordman(10000);
        setPuntosAtaque(1036);
        System.out.println("\nSEGADOR CREADO CON EXITO!!\n\n");
        return swordsman;
    }
    @Override
    public void RecolectarSwordman(DarkSwordsman swordman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EntrenarSwordman() {
        System.out.println("Se ha seleccionado un Serafin,"
                    + "se procedera a entrenarlo y ponerlo en el arrayList");
            System.out.println("Dark Swordman EN ENTRENAMIENTO");
            System.out.println("Entrenando Dark Swordman...Espere 20 segundos ");
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

            System.out.println("\nUNIDAD DE DARK SWORDMAN ENTRENADA CON EXITO!!");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
       
            System.out.println("Aun no se ha creado un Dark Swordman para poder ENTRENAR");
    }

    @Override
    public void AtacarSwordman(int vidaEnemiga) {
        System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if(ComprobarObjetos()){
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Dark Swordman Atacando!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        }else{
            System.out.println("No se ha creado Dark Swordman");
        }
    }
    
    @Override
    public void DefenderSwordman(int vidaEnemiga) {
        System.out.println("Unidad de Dark Swordman Defendiendo!!!");
        //setVidaEnemigo= vidaEnemiga - getPuntosAtaque();
    }

    @Override
    public void RecolectarOrco(Orcos orco) {
    }

    

    @Override
    public void CrearRecursos(int a) {
    }

    @Override
    public boolean ComprobarRecursos() {
        return false;
    }

    @Override
    public void RecolectarDiamantes(int cantidadDiamantes) {
    }

    @Override
    public void RecolectarOrbesOscuros(int cantidadOrbesOscuros) {
    }

    @Override
    public void RecolectarRocas(int cantidadRocas) {
    }

   
    
}
