package servidor.datos;

import java.util.*;

public class ListaPartidas {

    private List<Partida> laListaPartidas;

    /**
     * getLaListaPartidas obtiene una lista de partidas guardadas.
     * @return retorna un tipo List.
     */
    public List<Partida> getLaListaPartidas() {
        return laListaPartidas;
    }

    /**
     * setLaListaPartidas setea una lista de partidas guardadas.
     * @param recibe una lista de tipo List.
     */
    public void setLaListaPartidas(List<Partida> laListaPartidas) {
        this.laListaPartidas = laListaPartidas;
    }

    /**
     * Constructor
     */
    public ListaPartidas() {
        laListaPartidas = new ArrayList();
    }

    /**
     * obtiene el iterador de la lista.
     * @return retorna el iterador de lista, de tipo Iterator.
     */
    public Iterator getIterator() {
        return laListaPartidas.iterator();
    }

    /**
     * busca usuario y devuelve su partida guardada
     * @param elUsuario el Usuario del cual se quiere buscar la partida.
     * @return retorna la partida de dicho usuario, si existe.
     */
    public Partida buscarUsuario(Usuario elUsuario) {
        Partida auxiliar = null;
        Iterator iterador = laListaPartidas.iterator();

        while (iterador.hasNext()) {
            auxiliar = (Partida) iterador.next();

            if (elUsuario.getNickname().equalsIgnoreCase(auxiliar.getElUsuario().getNickname())) {
                return auxiliar;
            }
        }
        return null;

    }

    /**
     *
     * @param laPartidaAGuardar partida que se quiere guardar
     * @param elUsuario usuario del que se guardará la partida
     * @return true
     */
    public boolean guardarPartida(Partida laPartidaAGuardar, Usuario elUsuario) {
        //buscar nickname en la lista de partidas guardadas
        Partida laPartida = buscarUsuario(elUsuario);
        while (laPartida != null) {   //si tiene partida guardada
            eliminarPartida(laPartida);   //eliminar
            laPartida = buscarUsuario(elUsuario);   //busca otra partida guardada
        }
        agregarPartida(laPartidaAGuardar);
        return true;
    }

    /**
     * crea la partida para un usuario
     * @param nickname el nickname del usuario
     * @param listaDePiedras la lista a donde se le asignarán las piedras al jugador
     * @return true
     */
    public boolean crearPartida(String nickname, ListaPiedras listaDePiedras) {
        Partida laPartida = new Partida().crearPartida(nickname, listaDePiedras);
        return laListaPartidas.add(laPartida);
    }

    /**
     * agrega una partida existente a una lista.
     * @param laPartida la partida a ser agregada.
     */
    public void agregarPartida(Partida laPartida) {
        laListaPartidas.add(0, laPartida);
    }

    /**
     * elimina una partida de una lista.
     * @param laPartida partida a ser eliminada.
     * @return true si se pudo remover, false si no pudo ser eliminada.
     */
    public boolean eliminarPartida(Partida laPartida) {
        boolean encontrado = false;
        Partida partidaAux = null;
        Iterator iterador = laListaPartidas.iterator();

        while (!encontrado && iterador.hasNext()) {
            partidaAux = (Partida) iterador.next();

            if (laPartida.equals(partidaAux)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            if (laListaPartidas.remove(partidaAux)) {
                return true;
            }
        }

        return false;
    }

    public void imprimirPartidas() {

        if (laListaPartidas != null) {
            int i;
            Partida auxiliarPartida;
            Object arreglo[];

            arreglo = laListaPartidas.toArray();

            for (i = 0; i < arreglo.length; i++) {
                auxiliarPartida = (Partida) arreglo[i];

                System.out.println("Username: " + auxiliarPartida.getElUsuario().getNickname());
                System.out.println("IDPartida: " + auxiliarPartida.getIDPartida());
                System.out.println("Lista Piedras Jugador: ");
                auxiliarPartida.getElJuego().getJugador1().getElJugador().getPiedrasEnMano().imprimirListaPiedras();
                System.out.println("Lista Piedras Maquina: ");
                auxiliarPartida.getElJuego().getJugador2().getLaMaquina().getPiedrasEnMano().imprimirListaPiedras();
                System.out.println("Lista Piedras Pozo: ");
                auxiliarPartida.getElJuego().getLaMesa().getElPozo().imprimirListaPiedras();
                System.out.println("Lista Piedras Mesa");
                auxiliarPartida.getElJuego().getLaMesa().getPiedrasMesa().imprimirListaPiedras();
            }
        } else {
            System.out.println("La Lista esta vacia");
        }

    }
}
