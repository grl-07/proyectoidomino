package Modelo;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 02-Aug-2010 10:10:21 PM
 */
public class Score {

    private float puntaje;

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public Score() {
    }

    public void finalize() throws Throwable {
    }

    public void ajustarPuntaje(Usuario elUsuario) {
        puntaje = elUsuario.getPuntaje();
        puntaje = puntaje + 10;
    }
}
