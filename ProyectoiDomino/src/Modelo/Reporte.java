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
import java.util.*;

public class Reporte {

    private Set<Usuario> listaOrdenIn;

    public Reporte() {
        listaOrdenIn = new TreeSet(new ComparadorIngresos());
    }

    /*public void finalize() throws Throwable {

    }*/
    /**
     *
     * @param lista
     */
    public void imprimirReporte(Set lista) {
        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];

            System.out.println("Nombre: " + registro.getNombre());
            System.out.println("Apellido: " + registro.getApellido());
            System.out.println("Clave: " + registro.getClave());
            System.out.println("Nickname: " + registro.getNickname());
            System.out.println("Avatar: " + registro.getAvatar());
            System.out.println("Numero de Partidas Ganadas: " + registro.getNumPartidasGan());
            System.out.println("Numero de Ingresos: " + registro.getNumIngresos());
            System.out.println("Puntaje: " + registro.getPuntaje());
        }
    }

    /**
     *
     * @param Lista
     */
    public void ordenarPorIngresos(ListaUsuarios lista) {

        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.getListadoUsuarios().toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];
            listaOrdenIn.add(registro);
        }
        this.imprimirReporte(listaOrdenIn);
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
    public ListaUsuarios ordenPartidasGanadas(ListaUsuarios Lista) {
        return null;
    }

    /**
     *
     * @param Lista
     */
    public Usuario usuarioMayorScore(ListaUsuarios Lista) {
        return null;
    }
}

