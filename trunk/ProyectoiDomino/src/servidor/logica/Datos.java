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

    public static ListaUsuarios getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public static ListaPartidas getListaDePartidas() {
        return listaDePartidas;
    }

    public static ListaPiedras getListaDePiedras() {
        return listaDePiedras;
    }

    public static boolean agregarLaPiedra(int num1, int num2) {
        return (listaDePiedras.agregarPiedra(new Piedra(num1, num2)));
    }

    /*public static boolean agregarPartida(String nickname) {
        //Adaptar a JSockets
        Usuario usuarioAuxiliar = new Usuario("", "", "", nickname, "");
        Usuario elUsuario = listaDeUsuarios.buscarDatos(usuarioAuxiliar);
        return listaDePartidas.agregarPartidaCreada(elUsuario);
    }*/

    /*public static void imprimirPartida() {
        listaDePartidas.imprimirPartidas();
    }*/

    public static boolean agregarUsuario(Usuario elUsuario) {
        return listaDeUsuarios.agregarUsuario(elUsuario);

    }

    public static void imprimirListaPiedras() {
        listaDePiedras.imprimirListaPiedras();
    }

    /*public static String asignarIconoUsuario(String nombre, String apellido, String username, String clave, JTextField avatar, JRadioButton perro, JRadioButton sombrilla) {
        Usuario registro, elUsuario;

        elUsuario = new Usuario(nombre, apellido, clave, username, "");

        /*if (registro != null)
        {
        if (perro.isSelected()) {
            elUsuario.setAvatar("perro");
            sombrilla.setSelected(false);
        }
        if (sombrilla.isSelected()) {
            elUsuario.setAvatar("sombrilla");
            perro.setSelected(false);
        }
        avatar.setText(elUsuario.getAvatar());
        return elUsuario.getAvatar();
        //}
    }*/

    public static boolean crearPartida(String nickname) {
        return listaDePartidas.crearPartida(nickname, listaDePiedras);
    }
    public static Partida obtenerPartidaCreada(String nickname) {
        Partida laPartida;
        laPartida = new Partida().crearPartida(nickname, listaDePiedras);
        return laPartida;
    }

    /*public static Partida crearPartida(String nickname) {
        return listaDePartidas.crearPartida(nickname);
    }*/

    /*public static boolean guardarPartida(Partida laPartida){
        return listaDePartidas.agregarPartida(laPartida);
    }*/
}
