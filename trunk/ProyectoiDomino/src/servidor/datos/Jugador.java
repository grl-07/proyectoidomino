/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

//import com.toedter.calendar.JCalendar;

/**
 *
 * @author Alberly
 */
public class Jugador extends Usuario {

    private ControlJugadores elJugador;

    public ControlJugadores getElJugador() {
        return elJugador;
    }

    public void setElJugador(ControlJugadores elJugador) {
        this.elJugador = elJugador;
    }

  /*  public JCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(JCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }*/

    //Constructor
    public Jugador(String nickname, String avatar, int numPartidasGan, int numIngresos, int numPartCreadas, int puntaje) {
        super(nickname, avatar, numPartidasGan, numIngresos, numPartCreadas, puntaje);
        elJugador = new ControlJugadores();
    }
    /*	public void finalize() throws Throwable {
    super.finalize();
    }*/
}
