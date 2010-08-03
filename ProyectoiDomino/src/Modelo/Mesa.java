/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alberly
 */
public class Mesa {

    private ListaPiedras elPozo;
    private int extremo1;
    private int extremo2;
    private ListaPiedras PiedrasMesa;

    public ListaPiedras getPiedrasMesa() {
        return PiedrasMesa;
    }

    public void setPiedrasMesa(ListaPiedras PiedrasMesa) {
        this.PiedrasMesa = PiedrasMesa;
    }

    public ListaPiedras getElPozo() {
        return elPozo;
    }

    public void setElPozo(ListaPiedras elPozo) {
        this.elPozo = elPozo;
    }

    public int getExtremo1() {
        return extremo1;
    }

    public void setExtremo1(int extremo1) {
        this.extremo1 = extremo1;
    }

    public int getExtremo2() {
        return extremo2;
    }

    public void setExtremo2(int extremo2) {
        this.extremo2 = extremo2;
    }

    //Constructor
    public Mesa(ListaPiedras elPozo, int extremo1, int extremo2, ListaPiedras PiedrasMesa) {
        this.elPozo = elPozo;
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
        this.PiedrasMesa = PiedrasMesa;
    }

    /*public void finalize() throws Throwable {

    }*/
    /**
     *
     * @param laPiedra
     */
    public boolean aprobarPiedra(Piedra laPiedra) {
        return false;
    }
}
