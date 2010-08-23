/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.logica;

import servidor.datos.ListaUsuarios;
import servidor.datos.Archivo;
import servidor.datos.Usuario;
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

    public static void solicitarCargaDatosUsuario(){
        Archivo.cargarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    public static void solicitarCargaDatosPartidas(){
        Archivo.cargarPartidasArchivo(Datos.getListaDePartidas());
    }

    public static void solicitarImpresionPartidas(){
        Datos.getListaDePartidas().imprimirPartidas();
    }

    public static void solicitarImpresionPiedras() {
        Datos.getListaDePiedras().imprimirListaPiedras();
    }

    public static Usuario obtenerDatosDeUsuario(String nickname) {
        //listaDeUsuarios = Conector.getListaDeUsuarios();
        //listaDeUsuarios = Datos.getListaDeUsuarios();
        Usuario auxiliar = new Usuario("","","","",nickname,"",0,0,0,0);
       return (Datos.getListaDeUsuarios().buscarDatos(auxiliar));

    }


    public static void solicitarGuardarDatosPartidas(){
        Archivo.guardarDatosArchivoPartidas(Datos.getListaDePartidas());
    }

    public static void guardarNumIngresos(Usuario elUsuario,int cont) {
        cont++;
        elUsuario.setNumIngresos(cont);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }
    public static void guardarNuevoNombre(Usuario elUsuario) {
        elUsuario.setNombre(elUsuario.getNombre());
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }
    
    public static void guardarNumPartidasCreadas(Usuario elUsuario,int cont) {
        cont++;
        elUsuario.setNumPartCreadas(cont);
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }




}
