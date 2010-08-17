/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

/**
 *
 * @author Alberly
 */
public class Juego {

    private int estado;
    private Jugador jugador1;
    private Maquina jugador2;
    private Mesa laMesa;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Maquina getJugador2() {
        return jugador2;
    }

    public void setJugador2(Maquina jugador2) {
        this.jugador2 = jugador2;
    }

    public Mesa getLaMesa() {
        return laMesa;
    }

    public void setLaMesa(Mesa laMesa) {
        this.laMesa = laMesa;
    }

    //Constructor
    public Juego(int estado, Jugador jugador1, Maquina jugador2, Mesa laMesa) {
        this.estado = estado;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.laMesa = laMesa;
    }
    /*public void finalize() throws Throwable {

    }*/
}
