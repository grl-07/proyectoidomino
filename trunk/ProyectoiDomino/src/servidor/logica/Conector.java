/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.logica;

import servidor.datos.ListaUsuarios;
import servidor.datos.Archivo;
import servidor.datos.Usuario;
import servidor.datos.Partida;
import servidor.datos.Mesa;
import servidor.datos.ListaPiedras;

/**
 *
 * @author Alberly
 */
public class Conector {

    /*private static ListaUsuarios listaDeUsuarios;

    public static ListaUsuarios getListaDeUsuarios() {
    return listaDeUsuarios;
    }*/
    public static boolean comprobarDatos(String nickname, String password) {
        boolean confirm;
        confirm = false;
        confirm = Datos.getListaDeUsuarios().comprobarDatos(nickname, password);
        return confirm;
    }

    public static void guardarDatos(String name, String lastName, String nickname, String password, String avatar, String fechaNac) {
        Datos.getListaDeUsuarios().agregarUsuario(new Usuario(name, lastName, password, nickname, avatar, fechaNac));
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static boolean comprobarNickname(String nickname) {
        Usuario elUsuario = new Usuario("", "", "", nickname, "", "");
        if (Datos.getListaDeUsuarios().buscarNickname(elUsuario) == false) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean llamarCliente(Usuario elUsuario) {
        //ClienteTest.main(args, elUsuario);
        return false;
    }

    public static void solicitarCargaDatosPiedras() {
        Archivo.cargarPiedrasArchivo(Datos.getListaDePiedras());
    }

    public static void solicitarCargaDatosUsuario() {
        Archivo.cargarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static void solicitarCargaDatosPartidas() {
        Archivo.cargarPartidasArchivo(Datos.getListaDePartidas());
    }

    public static void solicitarImpresionPartidas() {
        Datos.getListaDePartidas().imprimirPartidas();
    }

    public static void solicitarImpresionPiedras() {
        Datos.getListaDePiedras().imprimirListaPiedras();
    }

    public static Usuario obtenerDatosDeUsuario(String nickname) {
        //listaDeUsuarios = Conector.getListaDeUsuarios();
        //listaDeUsuarios = Datos.getListaDeUsuarios();
        Usuario auxiliar = new Usuario("", "", "", "", nickname, "", 0, 0, 0, 0);
        return (Datos.getListaDeUsuarios().buscarDatos(auxiliar));

    }

    public static void solicitarGuardarDatosPartidas() {
        Archivo.guardarDatosArchivoPartidas(Datos.getListaDePartidas());
    }

    public static void guardarNumIngresos(Usuario elUsuario, int cont) {
        cont++;
        elUsuario.setNumIngresos(cont);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static void guardarNuevoDato(Usuario registro, Usuario elUsuario, String op) {
        if (op.equalsIgnoreCase("1")) {
            registro.setNombre(elUsuario.getNombre());
        } else if (op.equalsIgnoreCase("2")) {
            registro.setApellido(elUsuario.getApellido());
        } else if (op.equalsIgnoreCase("3")) {
            registro.setClave(elUsuario.getClave());
        } else if (op.equalsIgnoreCase("4")) {
            registro.setAvatar(elUsuario.getAvatar());
        }

        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static void guardarNumPartidasCreadas(Usuario elUsuario, int cont) {
        cont++;
        elUsuario.setNumPartCreadas(cont);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static boolean solicitarGuardarPartidaEnLista(String nickname) {
        Mesa laMesa=new Mesa();
        Usuario elUsuario = new Usuario("","","","",nickname,"",0,0,0,0);

        Partida partidaExistente = Datos.obtenerPartidaExistente(nickname);
        partidaExistente.getElJuego().getLaMesa().setPiedrasMesa(laMesa.pasarMatrizPiedrasMesaALista(Datos.getMatrizPiedrasMesa()));

        return (Datos.guardarPartidaEnLista(partidaExistente, elUsuario));
    }
}