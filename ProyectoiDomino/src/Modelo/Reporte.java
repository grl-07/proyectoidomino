/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Sheryl
 */
public class Reporte {

    private SortedSet<Usuario> ordenUsuarios;

    public Reporte() {
        ordenUsuarios = new TreeSet();
    }

    /*public void finalize() throws Throwable {

    }*/
    /**
     *
     * @param lista
     */
    public void imprimirReporte(ListaUsuarios lista) {
    }

    /**
     *
     * @param Lista
     */
    public ListaUsuarios ordenarPorIngresos(ListaUsuarios Lista) {
        return null;
    }

    /**
     *
     * @param Lista
     */
    public ListaUsuarios ordenPartidasCreadas(ListaUsuarios Lista) {
        return null;
    }

    /**
     *
     * @param Lista
     */
    public void ordenPartidasGanadas() {
        ListaUsuarios objeto = new ListaUsuarios();



    }

    public int compare(Object primeraPartida, Object segundaPartida) {


        Usuario primera = (Usuario) primeraPartida, segunda = (Usuario) segundaPartida;

        //int resultado = primera.getNumPartidasGan().compareTo(segunda.getNumPartidasGan());

        if (primera.getNumPartidasGan() == 0) {
            return 0;
        }

        if (segunda.getNumPartidasGan() <= 0) {
            return -1;
        }

        return 1;
    }

    /**
     *
     * @param Lista
     */
    public Usuario usuarioMayorScore(ListaUsuarios Lista) {
        return null;
    }
}
