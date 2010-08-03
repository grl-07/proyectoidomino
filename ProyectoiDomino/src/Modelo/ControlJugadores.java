/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alberly
 */
public class ControlJugadores {

    private boolean estado;
    private boolean pass;
    private ListaPiedras PiedrasEnMano;

    public ListaPiedras getPiedrasEnMano() {
        return PiedrasEnMano;
    }

    public void setPiedrasEnMano(ListaPiedras PiedrasEnMano) {
        this.PiedrasEnMano = PiedrasEnMano;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    //Constructor
    public ControlJugadores(boolean estado, boolean pass, ListaPiedras PiedrasEnMano) {
        this.estado = estado;
        this.pass = pass;
        this.PiedrasEnMano = PiedrasEnMano;
    }

    /*public void finalize() throws Throwable {

    }*/
    public boolean cambiarEstado() {
        return false;
    }

    public boolean pasarTurno() {
        return false;
    }

    /**
     *
     * @param laMesa
     * @param laPiedra
     */
    public boolean ponerPieza(Mesa laMesa, Piedra laPiedra) {
        return false;
    }

    /**
     *
     * @param laMesa
     */
    public Piedra tomarDelPozo(Mesa laMesa) {
        return null;
    }
}
