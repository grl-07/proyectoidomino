/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
//import com.toedter.calendar.JCalendar;

/**
 *
 * @author Sheryl
 */
public class Partida {

    private Usuario elUsuario;
    /*private JCalendar fechaactual;
    private JCalendar fechaIni;*/
    private float IDPartida;

    public float getIDPartida() {
        return IDPartida;
    }

    public void setIDPartida(float IDPartida) {
        this.IDPartida = IDPartida;
    }

    public Usuario getElUsuario() {
        return elUsuario;
    }

    public void setElUsuario(Usuario elUsuario) {
        this.elUsuario = elUsuario;
    }

    //Constructor
    public Partida() {
    }

    /*public void finalize() throws Throwable {

    }*/
    public void cargarPartida() {
    }

    public void crearPartida() {
    }

    public boolean guardarPartida() {
        return false;
    }

    public void salirPartida() {
    }
}
