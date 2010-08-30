package servidor.datos;

public class Juego {

    private Jugador jugador1;
    private Maquina jugador2;
    private Mesa laMesa;

    /**
     * getJugador1 obtiene el jugador actual del juego.
     * @return retorna un jugador de tipo Jugador.
     */
    public Jugador getJugador1() {
        return jugador1;
    }

    /**
     * setJugador1 setea el jugador del juego.
     * @param recibe un jugador de tipo Jugador.
     */
    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    /**
     * getJugador2 obtiene el jugador2 del juego.
     * @return retorna un jugador de tipo Maquina.
     */
    public Maquina getJugador2() {
        return jugador2;
    }

    /**
     * setJugador2 setea el jugador2 del juego.
     * @param recibe un jugador de tipo Maquina.
     */
    public void setJugador2(Maquina jugador2) {
        this.jugador2 = jugador2;
    }

    /**
     * getLaMesa obtiene la mesa del juego actual, donde se efectuará todo el juego.
     * @return retorna la mesa del juego, de tipo Mesa.
     */
    public Mesa getLaMesa() {
        return laMesa;
    }

    /**
     * setLaMesa asigna la mesa del juego actual, donde se efectuará todo el juego.
     * @param recibe la mesa del juego, de tipo Mesa.
     */
    public void setLaMesa(Mesa laMesa) {
        this.laMesa = laMesa;
    }

    /**
     * Constructor
     * @param jugador1 de tipo Jugador, representado siempre por el usuario.
     * @param jugador2 de tipo Maquina, representado por la maquina.
     * @param laMesa de tipo Mesa, es donde se efectuará todo el juego.
     */
    public Juego(Jugador jugador1, Maquina jugador2, Mesa laMesa) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.laMesa = laMesa;
    }
}