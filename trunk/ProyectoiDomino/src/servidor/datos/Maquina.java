package servidor.datos;

public class Maquina {

    private ControlJugadores laMaquina;

    /**
     * getLaMaquina obtiene un jugador de la clase controladora ControlJugadores.
     * @return retorna el jugador de tipo ControlJugadores.
     */
    public ControlJugadores getLaMaquina() {
        return laMaquina;
    }

    /**
     * setLaMaquina setea al jugador2 del juego actual.
     * @param recibe un jugador de tipo ControlJugadores.
     */
    public void setLaMaquina(ControlJugadores laMaquina) {
        this.laMaquina = laMaquina;
    }

    /**
     * Constructor
     */
    public Maquina() {
        laMaquina = new ControlJugadores();
    }
}