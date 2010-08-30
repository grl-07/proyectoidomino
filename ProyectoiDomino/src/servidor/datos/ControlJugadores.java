package servidor.datos;

public class ControlJugadores {

    private boolean estado;
    private boolean pass;
    private ListaPiedras piedrasEnMano;

    /**
     * getPiedrasEnMano se utiliza para obtener las piedras en mano de un jugador.
     * @return un tipo List que se utilizará para las listas de los jugadores.
     */
    public ListaPiedras getPiedrasEnMano() {
        return piedrasEnMano;
    }

    /**
     * setPiedrasEnMano setea las piedras en mano de un jugador.
     * @param la lista que se le asignará al tipo List.
     */
    public void setPiedrasEnMano(ListaPiedras PiedrasEnMano) {
        this.piedrasEnMano = PiedrasEnMano;
    }

    /**
     * isEstado método utilizado para obtener el estado de un jugador, es decir, si ha ganado o no.
     * @return retorna true si el jugador ha ganado, false si no ha pasado nada.
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * setEstado asigna el estado de un jugador.
     * @param recibe el estado actual del jugador, es decir, si ha ganado o no.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * isPass se utiliza para saber si el jugador ha pasado.
     * @return retorna true si el jugador ha pasado.
     */
    public boolean isPass() {
        return pass;
    }

    /**
     * setPass asigna el valor a la variable pass que informa si el jugador ha pasado o no.
     * @param variable que indica si el jugador ha pasado o no.
     */
    public void setPass(boolean pass) {
        this.pass = pass;
    }

    /**
     * Constructor
     */
    public ControlJugadores() {
        pass = false;
        estado = false;
        piedrasEnMano = new ListaPiedras();
    }
}