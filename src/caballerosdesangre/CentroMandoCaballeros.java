/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballerosdesangre;

import java.util.Scanner;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class CentroMandoCaballeros {
    private static int vidaHQ;
    private static CentroMandoCaballeros hq;
    public int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    private CentroMandoCaballeros() {
    }
    
    public static CentroMandoCaballeros getInstance() {
        if (hq == null) {
            hq = new CentroMandoCaballeros();
        }
        return hq;
    }
}  