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
public class Recursos implements InterfazCaballeros {

    private static ArrayList<Integer> RecursosMadera;
    private static ArrayList<Integer> RecursosOrbes;
    private static ArrayList<Integer> RecursosOro;

    private static int cantidadMadera=5000;
    private static int cantidadOrbes=10000;
    private static int cantidadOro=3000;

    public int getCantidadMadera() {
        return cantidadMadera;
    }

    public void setCantidadMadera(int cantidadMadera) {
        this.cantidadMadera = cantidadMadera;
    }

    public int getCantidadOrbes() {
        return cantidadOrbes;
    }

    public void setCantidadOrbes(int cantidadOrbes) {
        this.cantidadOrbes = cantidadOrbes;
    }

    public int getCantidadOro() {
        return cantidadOro;
    }

    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

    public Recursos() {
        RecursosMadera = new ArrayList<>();
        RecursosOrbes = new ArrayList<>();
        RecursosOro = new ArrayList<>();
    }

    @Override
    public Caballeros Crear() {
        return null;
    }
////////////////////////////////////////////////////////////////////////////////

    @Override
    public void CrearRecursos(int a) {
        
        switch (a) {
            case 1:
                System.out.println("Creando recursos de madera");
                setCantidadMadera(cantidadMadera+35);
                break;
            case 2:
                System.out.println("Creando recursos de Orbes");
                setCantidadOrbes(cantidadOrbes+35);
                break;
            case 3:
                System.out.println("Creando recursos de oro");
                setCantidadOro(cantidadOro+35);
                break;
            default:
                System.out.println("No se ha seleccionado nada valido");
        }
        
    }

    @Override
    public void RecolectarMadera(int cantidadMadera) {
        RecursosMadera.add(cantidadMadera);

    }

    @Override
    public void RecolectarOrbes(int cantidadOrbes) {
        RecursosOrbes.add(cantidadOrbes);
    }

    @Override
    public void RecolectarOro(int cantidadOro) {
        RecursosOro.add(cantidadOro);
    }

    @Override
    public Serafin CrearSerafin() {
        return null;
    }

   

    @Override
    public void RecolectarCaballero(Caballeros caballero) {
    }

    @Override
    public void RecolectarSerafin(Serafin serafin) {
    }

    @Override
    public boolean ComprobarObjetos() {
        int cont = 0, cont1 = 0;

        for (Integer RecursosMadera1 : RecursosMadera) {
            if (RecursosMadera.contains(15) && cont == 0) {
                return true;
            } else if (RecursosMadera.contains(15) && cont != 0) {
                return true;
            } else if (RecursosMadera.contains(15) == false) {
                cont1++;
                if (RecursosMadera.size() == cont1) {
                    System.out.println("NO HAY RECURSOS DE MADERA");
                }
            }
            cont++;
        }
        return false;
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
    public void EntrenarSerafin() {
    }

    @Override
    public void AtacarSerafin() {
    }

    @Override
    public void DefenderSerafin() {
    }

    @Override
    public boolean ComprobarRecursos(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
