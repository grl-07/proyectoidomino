/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alberly
 */
public class Maquina {

    private ControlJugadores laMaquina;

    public ControlJugadores getLaMaquina() {
        return laMaquina;
    }

    public void setLaMaquina(ControlJugadores laMaquina) {
        this.laMaquina = laMaquina;
    }

    //Constructor
    public Maquina() {
        laMaquina = new ControlJugadores();
    }

    /*public void finalize() throws Throwable {

    }*/
    public void realizarJugada() {
    }
}
