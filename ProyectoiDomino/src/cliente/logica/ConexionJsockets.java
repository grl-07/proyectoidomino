/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente.logica;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author CASITA
 */
public class ConexionJsockets {

    /**
     * solicitudServidor1 ejecuta la peticion al servidor con la cadena de protocolo para el ingreso al sistema
     * @param username es un jTextField que tiene el nickname del usuario
     * @param clave es un jPassword que tiene la clave del usuario
     * @return retorna un string con la cadena de la respuesta del servidor
     */
    public static String solicitudServidor1(JTextField username, JPasswordField clave) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "1";
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println("RESULTADO = " + resultado);
        String[] subArg = resultado.split(":");
        String respuesta = subArg[0];
        if (respuesta.equals("TRUE")) {
            System.out.println("CLIENTE Entro al sistema ->" + nickname);
        } else {
            System.out.println("FALSE");
        }
        return resultado;
    }

    /**
     * solicitudServidor2 ejecuta la peticion al servidor con la cadena de protocolo para el crear partida
     * @param username es un jLabel con el nickname del usuario
     * @param fechaInicio
     * @return retorna un string con la cadena de la respuesta del servidor
     */
    public static String solicitudServidor2(JLabel username, String fechaInicio) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();

        System.err.println("nickname = @" + nickname + "@");

        String opcion = "2";
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + fechaInicio, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

    /**
     * solicitudServidor3 ejecuta la peticion al servidor con la cadena de protocolo para el registro en el sistema
     * @param name en un jTextField con el nombre del usuario a registrar
     * @param lastName en un jTextField con el apellido del usuario a registrar
     * @param username en un jTextField con el nickname del usuario a registrar
     * @param clave en un jTextField con la clave del usuario a registrar
     * @param avatar en un string con el avatar del usuario a registrar
     * @param fechaNac en un string con la fecha de nacimiento del usuario a registrar
     * @return retorna un string con la cadena de la respuesta del servidor
     */
    public static String solicitudServidor3(JTextField name, JTextField lastName, JTextField username, JPasswordField clave, String avatar, String fechaNac) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "3";
        String nickname = username.getText();
        String password = clave.getText();
        String nombre = name.getText();
        String apellido = lastName.getText();
        //String avatar = IDavatar.getText();
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password + ":" + nombre + ":" + apellido + ":" + fechaNac + ":" + avatar, "localhost", 9999);
        System.out.println("RESULTADO = " + resultado);
        if (resultado.equals("TRUE")) {
            System.out.println("CLIENTE Registro en el sistema -> de " + nombre + " " + apellido);
        } else {
            System.out.println("FALSE");
        }
        return resultado;
    }

    /**
     * solicitudServidor4 ejecuta la peticion al servidor con la cadena de protocolo para el guardar partida
     * @param nickname un string con el nickname del usuario
     * @return retorna un string con la cadena de la respuesta del servidor
     */
    public static String solicitudServidor4(String nickname) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "4";
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

    /**
     * solicitudServidor5 ejecuta la peticion al servidor con la cadena de protocolo para el enviar jugada
     * @param username
     * @param piedra
     * @param posicion
     * @param imagen
     * @return
     */
    public static String solicitudServidor5(String username, String piedra, String posicion, String imagen) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "5";
        /*String nickname = username.getText();
        String password = clave.getText();*/
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + username + ":" + piedra + ":" + posicion + ":" + imagen, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

    public static String solicitudServidor5(String username, String piedra) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "5";
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + username + ":" + piedra, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

    /**
     * solicitudServidor6 ejecuta la peticion al servidor con la cadena de protocolo para el fin de partida
     * @param username
     * @param clave
     * @param opcion
     * @return
     */
    public static String solicitudServidor6(JTextField username, JPasswordField clave, String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

    /**
     * solicitudServidor7 ejecuta la peticion al servidor con la cadena de protocolo para el obtener ficha del pote
     * @param nickname
     * @return
     */
    public static String solicitudServidor7(String nickname) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "7";
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

    /**
     * solicitudServidor8 ejecuta la peticion al servidor con la cadena de protocolo para el modificar datos
     * @param nickname
     * @param dato
     * @param bandera
     * @return
     */
    public static String solicitudServidor8(String nickname, String dato, String bandera) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "8";
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + dato + ":" + bandera, "localhost", 9999);
        System.out.println("RESULTADO = " + resultado);
        /*
        if (resultado.equals("TRUE")) {
        System.out.println("CLIENTE Registro en el sistema -> de " + nombre + " " + apellido);
        } else {
        System.out.println("FALSE");
        }*/
        return resultado;
    }
}
