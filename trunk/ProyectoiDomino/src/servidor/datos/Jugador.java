package servidor.datos;

public class Jugador extends Usuario {

    private ControlJugadores elJugador;

    /**
     * getElJugador obtiene el jugador de la clase controladora ControlJugadores.
     * @return retorna el jugador de tipo ControlJugadores.
     */
    public ControlJugadores getElJugador() {
        return elJugador;
    }

    /**
     * setElJugador setea al jugador del juego actual.
     * @param recibe un jugador de tipo ControlJugadores.
     */
    public void setElJugador(ControlJugadores elJugador) {
        this.elJugador = elJugador;
    }

    /**
     *Constructor
     * @param nickname nickname del usuario
     * @param avatar avatar del usuario
     * @param numPartidasGan numero de partidas ganadas.
     * @param numIngresos numero de ingresos al sistema.
     * @param numPartCreadas
     * @param puntaje
     */
    public Jugador(String nickname, String avatar, int numPartidasGan, int numIngresos, int numPartCreadas, int puntaje) {
        super(nickname, avatar, numPartidasGan, numIngresos, numPartCreadas, puntaje);
        elJugador = new ControlJugadores();
    }
}