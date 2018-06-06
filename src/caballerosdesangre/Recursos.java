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

    private static int cantidadMadera=0;
    private static int cantidadOrbes=0;
    private static int cantidadOro=0;

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
        return null;
    }

    @Override
    public void EntrenarPaladin(Serafin paladin) {
    }

    @Override
    public void AtacarPaladin(Serafin paladin) {
    }

    @Override
    public void DefenderPaladin(Serafin paladin) {
    }

    @Override
    public void RecolectarCaballero(Caballeros caballero) {
    }

    @Override
    public void RecolectarPaladin(Serafin paladin) {
    }
////////////////////////////////////////////////////////////////////////////////

    @Override
    public void CrearRecursos(int a) {
        
        switch (a) {
            case 1:
                setCantidadMadera(cantidadMadera+15);
                break;
            case 2:
                setCantidadOrbes(cantidadOrbes+15);
                break;
            case 3:
                setCantidadOro(cantidadOro+15);
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

}
