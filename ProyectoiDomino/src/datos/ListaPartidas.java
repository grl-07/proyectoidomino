/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
    }

    public boolean guardarPartida(Partida laPartidaAGuardar, Usuario elUsuario) {
        //buscar nickname en la lista de partidas guardadas

        ListaUsuarios laListaUsuarios;
        laListaUsuarios = new ListaUsuarios();

        boolean confirm = false;

        confirm = laListaUsuarios.buscarNickname(elUsuario);

        if (confirm == true) {
            Partida elGame = buscarUsuario(elUsuario);
            eliminarPartida(elGame);
            agregarPartida(laPartidaAGuardar);

        } else {
            agregarPartida(laPartidaAGuardar);
        }
        return true;
    }

    public boolean agregarPartida(Partida laPartida) {
        return laListaPartidas.add(laPartida);
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
        return auxiliar;

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
        int i;
        Partida auxiliarPartida;
        Object arreglo[];

        arreglo = laListaPartidas.toArray();

        for (i = 0; i < arreglo.length; i++) {
            auxiliarPartida = (Partida) arreglo[i];
            System.out.println("Username: " + auxiliarPartida.getElUsuario().getNickname());
            System.out.println("IDPartida: " + auxiliarPartida.getIDPartida());
        }
    }



}
