/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import Modelo.*;

/**
 *
 * @author Alberly
 */
public class Conector {

    private static ListaUsuarios listaDeUsuarios;

    public static boolean inicializarEstructuras()
    {
        listaDeUsuarios = new ListaUsuarios();
        Archivo.cargarDatosDeArchivo(listaDeUsuarios);
        return true;
    }

    public static boolean comprobarDatos(String nickname, String password){
        boolean confirm;
        confirm = false;
        confirm = listaDeUsuarios.comprobarDatos(nickname, password);
        return confirm;
    }

}
