/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import datos.*;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author CASITA
 */
public class ConexionJsockets {
    private static ListaUsuarios listaDeUsuarios;

    public static Usuario obtenerDatosDeUsuario(String nickname) {
        listaDeUsuarios = Conector.getListaDeUsuarios();
        Usuario auxiliar = new Usuario("","","",nickname,"",0,0,0,0);
       return (listaDeUsuarios.buscarDatos(auxiliar));
        
    }

    public static String solicitudServidor1(JTextField username, JPasswordField clave) {
        ClienteSocket cliente = new ClienteSocket();
        Usuario elUsuario = null;
        String opcion = "1";
        String nickname = username.getText();
        String password = clave.getText();
        elUsuario = obtenerDatosDeUsuario(nickname);
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        //System.out.println(resultado);
        String[] subArg = resultado.split(":");
        resultado = subArg[0];
        if (resultado.equals("TRUE")) {
            //System.out.println("Acceso al sistema -> de " + subArg[1] + " " + subArg[2] + " " + subArg[3]);
            System.out.println("Acceso al sistema -> de " + elUsuario.getNombre() + " " + elUsuario.getApellido());
        }
        //System.out.println("RESULTADO = " +resultado);
        return resultado;
    }

     public static String solicitudServidor2(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        System.out.println(resultado);
        return resultado;
    }

     public static String solicitudServidor3(JTextField name, JTextField lastName, JTextField username, JPasswordField clave,JTextField IDavatar) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "3";
        String nickname = username.getText();
        String password = clave.getText();
        String nombre = name.getText();
        String apellido = lastName.getText();
        String avatar = IDavatar.getText();
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nombre + ":" + apellido + ":" + nickname + ":" + password + ":" + avatar, "localhost", 7687);
        String[] subArg = resultado.split(":");
        resultado = subArg[0];
        if (resultado.equals("TRUE")) {
            System.out.println("Registro en el sistema -> de " + nombre + " " + apellido);
        }
        return resultado;
    }

        public static String solicitudServidor4(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        System.out.println(resultado);
        return resultado;
    }
        public static String solicitudServidor5(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        System.out.println(resultado);
        return resultado;
    }
         public static String solicitudServidor6(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        System.out.println(resultado);
        return resultado;
    }
          public static String solicitudServidor7(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        System.out.println(resultado);
        return resultado;
    }
        public static String solicitudServidor8(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 7687);
        System.out.println(resultado);
        return resultado;
    }
       
}