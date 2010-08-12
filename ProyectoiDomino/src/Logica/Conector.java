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

    public static ListaUsuarios getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public static boolean inicializarEstructuras() {
        listaDeUsuarios = new ListaUsuarios();
        Archivo.cargarDatosArchivo(listaDeUsuarios);
        return true;
    }

    public static boolean comprobarDatos(JTextField username, JPasswordField clave) {
        String nickname = username.getText();
        String password = clave.getText();
        boolean confirm;
        confirm = false;
        confirm = listaDeUsuarios.comprobarDatos(nickname, password);
        return confirm;
    }

    public static void guardarDatos(JTextField nombre, JTextField apellido, JTextField username, JPasswordField clave, JTextField imagen) {
        String name = nombre.getText();
        String lastName = apellido.getText();
        String nickname = username.getText();
        String password = clave.getText();
        String avatar = imagen.getText();

        listaDeUsuarios.agregarUsuario(new Usuario(name, lastName, password, nickname, avatar, 0, 0, 0, 0));
        Archivo.guardarDatosArchivo(listaDeUsuarios);
    }

    public static boolean comprobarNickname(JTextField username) {
        Usuario elUsuario = new Usuario("", "", "", username.getText(), "", 0, 0, 0, 0);
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

    public static String obtenerNombre(JTextField username) {
        String nickname = username.getText();
        Usuario registro = new Usuario("","","",nickname,"",0,0,0,0);
        String nombre = "";

        registro = listaDeUsuarios.buscarDatos(registro);
        nombre = (registro.getNombre());
        return nombre;
    }

    public static String obtenerApellido(JTextField username) {
        String nickname = username.getText();
        Usuario registro = new Usuario("","","",nickname,"",0,0,0,0);
        String apellido = "";

        registro = listaDeUsuarios.buscarDatos(registro);
        apellido = (registro.getApellido());
        return apellido;
    }
}
