/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Alberly
 */
import java.util.*;

public class ListaPiedras {

    private Set<Piedra> laListaPiedras;

    public Set<Piedra> getLaListaPiedras() {
        return laListaPiedras;
    }

    public void setLaListaPiedras(Set<Piedra> laListaPiedras) {
        this.laListaPiedras = laListaPiedras;
    }

    //Constructor
    public ListaPiedras() {            
        laListaPiedras = new HashSet();
    }

    public void agregarPiedra(Piedra laPiedra) {
        laListaPiedras.add(laPiedra);
    }

    public boolean eliminarPiedra(Piedra laPiedra) {
        return (laListaPiedras.remove(laPiedra));
    }

    public void imprimirListaPiedras() {

        int i;
        Object[] arregloPiedras;
        arregloPiedras = laListaPiedras.toArray();
        Piedra registro;
        System.out.println("PIEDRAS DEL JUEGO");
        for (i = 0; i < arregloPiedras.length; i++) {
            registro = (Piedra) arregloPiedras[i];
            System.out.println("Piedra " + (i + 1) + ": " + registro.getNum1() + "-" + registro.getNum2());
        }

    }
}
