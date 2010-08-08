/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import datos.*;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

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

    public static void guardarDatos(JTextField nombre, JTextField apellido, JTextField username, JPasswordField clave , JTextField imagen){
        String name = nombre.getText();
        String lastName = apellido.getText();
        String nickname = username.getText();
        String password = clave.getText();
        String avatar = imagen.getText();

        listaDeUsuarios.agregarUsuario(new Usuario(name,lastName,password,nickname, avatar,0,0,0,0));
        Archivo.guardarDatosArchivo(listaDeUsuarios);
    }

}
