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

    private static ListaUsuarios listaDeUsuarios;

    public static ListaUsuarios getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public static boolean comprobarDatos(String nickname, String password) {
        boolean confirm;
        confirm = false;
        confirm = listaDeUsuarios.comprobarDatos(nickname, password);
        return confirm;
    }

    public static void guardarDatos(String name, String lastName, String nickname, String password, String avatar) {
        listaDeUsuarios.agregarUsuario(new Usuario(name, lastName, password, nickname, avatar, 0, 0, 0, 0));
        Archivo.guardarDatosArchivo(listaDeUsuarios);
    }

    public static boolean comprobarNickname(String nickname) {
        Usuario elUsuario = new Usuario("", "", "", nickname, "", 0, 0, 0, 0);
        if (listaDeUsuarios.buscarNickname(elUsuario) == false) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean llamarCliente(Usuario elUsuario) {
       //ClienteTest.main(args, elUsuario);
       return false;
   }

    public static void solicitarCargaDeDatos() {
        Archivo.cargarPiedrasArchivo(Datos.getListaDePiedras());
    }

    public static void solicitarImpresionPiedras() {
        Datos.getListaDePiedras().imprimirListaPiedras();
    }

    public static Usuario obtenerDatosDeUsuario(String nickname) {
        listaDeUsuarios = Conector.getListaDeUsuarios();
        Usuario auxiliar = new Usuario("","","",nickname,"",0,0,0,0);
       return (listaDeUsuarios.buscarDatos(auxiliar));

    }
}