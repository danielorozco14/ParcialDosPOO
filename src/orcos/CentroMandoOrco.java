/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcos;

import danielorozco.world.AbstractFactory;
import danielorozco.world.FactoryProducer;
import danielorozco.world.MenuJuego;
import java.util.Scanner;



/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class CentroMandoOrco {
     private static int vidaHQ;
    private static CentroMandoOrco hq;
    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getVidaHQ() {
        return vidaHQ;
    }

    public void setVidaHQ(int vidaHQ) {
        this.vidaHQ = vidaHQ;
    }

    private CentroMandoOrco() {
    }

    public static CentroMandoOrco getInstance() {
        if (hq == null) {
            hq = new CentroMandoOrco();
        }
        return hq;
    }

    public void CentroMandoOrco() {
        Scanner opcion = new Scanner(System.in);
        setVidaHQ(20000);
        Scanner opciones1 = new Scanner(System.in);
        Recursos tipoRecurso = new Recursos();
        AbstractFactory factory;
        setVidaHQ(20000);

        MenuJuego menu = new MenuJuego();
        String nom1 = (menu.getNomJugador1());
        System.out.println("\t\t******** CENTRO DE MANDO ORCOS ***********");
        System.out.println("\t\t---------- HP Centro de Mando =" + getVidaHQ() + " -----------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|\t\t 1. Creacion de Milicia                             |");
        System.out.println("|\t\t 2. Creacion de Recursos                            |");
        System.out.println("|\t\t 3. Creacion de Vehiculos                           |");
        System.out.println("|\t\t 4. Creacion de Edificios                           |");
        System.out.println("|\t\t 5. Recolectar Vehiculos                            |");
        System.out.println("|\t\t 6. Recolectar Recursos                             |");
        System.out.println("|\t\t---------------------------------------");
        System.out.println("|\t\t 7. Atacar Territorio Enemigo                       |");
        System.out.println("|\t\t 8. Defender Ataque Enemigo                         |");
        System.out.println("----------------------------------------------------------------------");
        //        System.out.println("|\t\t\t\t      |");
        //        System.out.println("|\t\t\t\t      |");

        //        System.out.println("\t\t1. Recolectar Recursos Madera");
        //        System.out.println("\t\t2. Recolectar Recursos Orbes");
        //        System.out.println("\t\t3. Recolectar Recursos Oro");
        setType(opciones1.nextInt());

        switch (getType()) {
            case 1:
                System.out.println("Que milicia desea crear?");
                System.out.println("1. Orcos");
                System.out.println("2. Dark Swordsman");
                int type = opciones1.nextInt();
                switch (type) {
                    case 1:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                        InterfazOrcos orcos = factory.getOrcos(1);
                        orcos.Crear();
                        break;
                    case 2:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                        orcos = factory.getOrcos(2);
                        orcos.CrearSwordman();
                        break;
                    default:
                        System.out.println("No ha seleccionado nada valido");
                }
                break;

            case 2:
                factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                InterfazOrcos orco;
                System.out.println("Que recursos desea crear?");
                System.out.println("1.Huesos");
                System.out.println("2.Cristal");
                System.out.println("3.Almas");
                orco = factory.getOrcos(3);//ESTA OPCION SERIA LA QUE DEFINE SI SE CREAN MILICIAS O RECURSOS;
                orco.CrearRecursos(opciones1.nextInt());
                break;
            case 3:
                System.out.println("Aun no esta implementada la creacion de vehiculos");
                break;
            case 4:
                System.out.println("Aun no esta implementada la creacion de edificios");
                break;
            case 5:
                System.out.println("Aun no esta implementada la recoleccion de vehiculos");
                break;
            case 6:
                System.out.println("Que recurso desea recolectar?");
                System.out.println("1.Orbes Oscuros");
                System.out.println("2.Rocas");
                System.out.println("3.Diamantes");
                switch (opciones1.nextInt()) {
                    case 1:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                        orco = factory.getOrcos(3);
                        orco.RecolectarOrbesOscuros(15);
                        break;
                    case 2:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                        orco = factory.getOrcos(3);
                        orco.RecolectarRocas(15);
                        break;
                    case 3:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                        orco = factory.getOrcos(3);
                        orco.RecolectarDiamantes(15);
                        break;
                    default:
                        System.out.println("No eligio nada valido");
                }
            case 7:
                System.out.println("Que edificacion enemiga desea atacar?");
                System.out.println("1. Edificios de Recursos de Madera Enemigo");
                System.out.println("2. Edificios de Recursos de Orbes Enemigo");
                System.out.println("3. Edificios de Recursos de Oro Enemigo");
                System.out.println("4. Edificio Militar Enemigo");
                System.out.println("5. Centro de Mando Enemigo");
                switch (opciones1.nextInt()) {
                    case 1:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                        orco = factory.getOrcos(3);
                        orco.Atacar(300);
                        break;
                    case 2:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                         orco = factory.getOrcos(3);
                        orco.Atacar(300);
                        break;
                    case 3:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                   orco = factory.getOrcos(3);
                        orco.Atacar(300);
                        break;
                    case 4:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                         orco = factory.getOrcos(3);
                        orco.Atacar(5000);
                        break;
                    case 5:
                        factory = FactoryProducer.getFactory(menu.getOpcionRaza1());
                       orco = factory.getOrcos(3);
                        orco.Atacar(5000);
                        break;
                    default:
                        System.out.println("No opcion valida");
                }
            default:
                System.out.println("No ha seleccionado nada valido");
        }

    }
}
