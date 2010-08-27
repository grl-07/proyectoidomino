package servidor.logica;

import servidor.datos.*;
import javax.swing.*;

/**
 *
 * @author Alberly
 */
public class Datos {

    private static ListaPiedras listaDePiedras = null;
    private static ListaPartidas listaDePartidas = null;
    private static ListaUsuarios listaDeUsuarios = null;
    private static Piedra[][] matrizPiedrasMesa = null;
    private static ListaPiedras listaPiedrasMaquina = null;
    private static ListaPiedras listaPiedrasJugador = null;
    private static ListaPiedras listaPiedrasPozo = null;
private static ListaPiedras listaPiedrasMesa = null;

    private Datos() {
    }

    public static boolean inicializarListasDeDatos() {
        boolean confirm = false;
        if (listaDeUsuarios == null) {
            System.out.println("Entro");
            listaDeUsuarios = new ListaUsuarios();
            confirm = true;
        }
        if (listaDePiedras == null) {
            listaDePiedras = new ListaPiedras();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaDePartidas == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        return confirm;
    }

    public static boolean inicializarListasJuego() {
        boolean confirm = false;
        if (listaPiedrasMaquina == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaPiedrasJugador == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaPiedrasPozo == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
          if (listaPiedrasMesa == null) {
            listaPiedrasMesa = new ListaPiedras();
            confirm = true;
        } else {
            confirm = false;
        }
        return confirm;
    }

    public static boolean inicializarMatrizPiedras() {
        if (matrizPiedrasMesa == null) {
            matrizPiedrasMesa = new Mesa().inicializarMatrizPiedras();
            return true;
        }
        return false;
    }

    public static Piedra[][] getMatrizPiedrasMesa() {
        return matrizPiedrasMesa;
    }

    public static void setMatrizPiedrasMesa(Piedra[][] matrizPiedrasMesa) {
        Datos.matrizPiedrasMesa = matrizPiedrasMesa;
    }

    public static ListaUsuarios getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public static ListaPartidas getListaDePartidas() {
        return listaDePartidas;
    }

    public static ListaPiedras getListaDePiedras() {
        return listaDePiedras;
    }

    public static ListaPiedras getListaPiedrasJugador() {
        return listaPiedrasJugador;
    }

    public static ListaPiedras getListaPiedrasMaquina() {
        return listaPiedrasMaquina;
    }

    public static ListaPiedras getListaPiedrasPozo() {
        return listaPiedrasPozo;
    }

    public static void setListaPiedrasJugador(ListaPiedras listaPiedrasJugador) {
        Datos.listaPiedrasJugador = listaPiedrasJugador;
    }

    public static void setListaPiedrasMaquina(ListaPiedras listaPiedrasMaquina) {
        Datos.listaPiedrasMaquina = listaPiedrasMaquina;
    }

    public static void setListaPiedrasPozo(ListaPiedras listaPiedrasPozo) {
        Datos.listaPiedrasPozo = listaPiedrasPozo;
    }

    public static ListaPiedras getListaPiedrasMesa() {
        return listaPiedrasMesa;
    }

    public static void setListaPiedrasMesa(ListaPiedras listaPiedrasMesa) {
        Datos.listaPiedrasMesa = listaPiedrasMesa;
    }

    public static boolean agregarLaPiedra(int num1, int num2) {
        return (listaDePiedras.agregarPiedra(new Piedra(num1, num2)));
    }

    public static boolean agregarUsuario(Usuario elUsuario) {
        return listaDeUsuarios.agregarUsuario(elUsuario);

    }

    public static void imprimirListaPiedras() {
        listaDePiedras.imprimirListaPiedras();
    }

    public static boolean crearPartida(String nickname) {
        return listaDePartidas.crearPartida(nickname, listaDePiedras);
    }

    public static Partida obtenerPartidaCreada(String nickname) {
        Partida laPartida;
        laPartida = new Partida().crearPartida(nickname, listaDePiedras);
        listaDePartidas.agregarPartida(laPartida);
        return laPartida;
    }

    public static Partida obtenerPartidaExistente(String nickname) {
        return listaDePartidas.buscarUsuario(new Usuario("", "", "", nickname, "", ""));
    }

    public static Usuario modificarDatosUsuario(Usuario elUsuario) {
        //Usuario usuariobuscado = new Usuario("","","",elUsuario.getNickname(),"","");
        System.out.println(elUsuario.getNickname());
        Usuario auxiliar = new Usuario("","","","","","");
        auxiliar = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());//listaDeUsuarios.buscarDatos(elUsuario);
        System.out.println(auxiliar.getNickname());

        return (listaDeUsuarios.modificarUsuario(auxiliar,elUsuario));
    }

     public static boolean guardarPartidaEnLista(Partida laPartida, Usuario elUsuario){
        return (listaDePartidas.guardarPartida(laPartida, elUsuario));
    }
}
