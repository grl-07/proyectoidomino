/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import datos.*;

/**
 *
 * @author Alberly
 */
public class Datos {

    private static ListaPiedras listaDePiedras = null;

    private Datos() {
    }

    public static boolean inicializarListasDeDatos() {
        if (listaDePiedras == null) {
            listaDePiedras = new ListaPiedras();
            return true;
        }

        return false;
    }

    public static ListaPiedras getListaDePiedras() {
        return listaDePiedras;
    }

    public static boolean agregarLaPiedra(int num1, int num2) {
        return (listaDePiedras.agregarPiedra(new Piedra(num1, num2)));
    }

    public static void imprimirListaPiedras() {
        listaDePiedras.imprimirListaPiedras();
    }
}
