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
public class Orcos implements InterfazOrcos {
    
    private static int vidaOrcos, puntosAtaque;

    private static ArrayList<Orcos> AlmacenOrcos;

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public static void setPuntosAtaque(int puntosAtaque) {
        Orcos.puntosAtaque = puntosAtaque;
    }

    public int getVidaCaballero() {
        return vidaOrcos;
    }

    public void setVidaCaballero(int vida) {
        Orcos.vidaOrcos = vida;
    }

    public Orcos() {
        AlmacenOrcos = new ArrayList<>();
    }
    
    
    
    
    
    @Override
    public boolean ComprobarObjetos() {
        int cont = 0, cont1 = 0;

        for (Orcos orcos : AlmacenOrcos) {

            if (AlmacenOrcos.contains(orcos) && cont == 0) {
                return true;
            } else if (AlmacenOrcos.contains(orcos) && cont != 0) {
                return true;
            } else if (AlmacenOrcos.contains(orcos) == false) {
                cont1++;
                if (AlmacenOrcos.size() == cont1) {
                    System.out.println("No existen Orcos entrenados");
                }
            }
            cont++;
        }
        return false;
    }
    

    @Override
    public Orcos Crear() {
        System.out.println("CREANDO ESCUADRON DE ORCOS ESPERE 15 SEGUNDOS");
        System.out.println("\t\tCreando Caballeros!! ");
        Orcos orco = new Orcos();
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
        System.out.println("\nUNIDAD DE ORCOS CREADA CON EXITO!!\n\n");
        return orco;
  
    }

    @Override
    public void Entrenar() {
        if(ComprobarObjetos()){
            System.out.println("Se ha seleccionado una unidad de caballeros,"
                    + "se procedera a entrenarlos y ponerlos en el arrayList");
            System.out.println("UNIDAD DE ORCOS EN ENTRENAMIENTO");
            System.out.println("Entrenando Caballeros...Espere 10 segundos ");
            for (int i = 1; i < 10; i++) {
                System.out.print("Entrenando...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            System.out.println("\nUnidad de Orcos Entrenada");
            //ArrayListDeCaballerosEntrenados.add(caballlero);
        } else {
            System.out.println("Aun no se han creado Orcos para poder ENTRENAR");
        }
    }

    @Override
    public void Atacar(int vidaEnemiga) {
         System.out.println("ATACANDO TERRITORIO ENEMIGO!!");
        if(ComprobarObjetos()){
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de orcos Atacando!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        }else{
            System.out.println("No se han creado Orcos");
        }
        
    }

    @Override
    public void Defender(int vidaAliada) {
        System.out.println("Unidad de caballeros Defendiendo!!!");
        if(ComprobarObjetos()){
            //Obtener del arraylist de caballeros, un caballero y enviarlo a atacar
            System.out.println("Unidad de caballeros Defendiendo!!!");
            //setVidaEnemiga= vidaEnemiga - getPuntosAtaque();
        }
    }

    @Override
    public DarkSwordsman CrearSwordman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EntrenarSwordman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtacarSwordman(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DefenderSwordman(int vidaEnemiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarOrco(Orcos orco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarSwordman(DarkSwordsman swordman) {
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
    public void RecolectarDiamantes(int cantidadDiamantes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarOrbesOscuros(int cantidadOrbesOscuros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecolectarRocas(int cantidadRocas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
