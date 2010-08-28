/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

/**
 *
 * @author Alberly
 */
import java.util.*;

public class ListaPartidas {
//private Partida ListaPartidas[];

    private List<Partida> laListaPartidas;

    public List<Partida> getLaListaPartidas() {
        return laListaPartidas;
    }

    public void setLaListaPartidas(List<Partida> laListaPartidas) {
        this.laListaPartidas = laListaPartidas;
    }

    public ListaPartidas() {
        laListaPartidas = new ArrayList();
    }

    public Iterator getIterator(){
        return laListaPartidas.iterator();
    }

     public Partida buscarUsuario(Usuario elUsuario) {  //Busca usuario y devuelve su partida guardada
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


      public boolean guardarPartida(Partida laPartidaAGuardar, Usuario elUsuario) {
        //buscar nickname en la lista de partidas guardadas
        Partida laPartida= buscarUsuario(elUsuario);
        while (laPartida!=null){   //si tiene partida guardada
            eliminarPartida(laPartida);   //eliminar
            laPartida=buscarUsuario(elUsuario);   //busca otra partida guardada
        }
        agregarPartida(laPartidaAGuardar);
        return true;
    }


    public boolean crearPartida(String nickname, ListaPiedras listaDePiedras) {
        Partida laPartida = new Partida().crearPartida(nickname, listaDePiedras);
        return laListaPartidas.add(laPartida);
    }

    public void agregarPartida(Partida laPartida) {
         laListaPartidas.add(0,laPartida);
    }
  
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
        } else System.out.println("La Lista esta vacia");

    }
}
