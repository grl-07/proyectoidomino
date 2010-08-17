/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente.logica;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author CASITA
 */
public class ConexionJsockets {
    
    public static String solicitudServidor1(JTextField username, JPasswordField clave) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "1";
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println("RESULTADO = " + resultado);
        String [] subArg = resultado.split(":");
        String respuesta = subArg[0];
        if (respuesta.equals("TRUE")) {
            System.out.println("CLIENTE Entro al sistema ->" + nickname );
        }
        else {
            System.out.println("FALSE");
        }
        return resultado;
    }

     public static String solicitudServidor2(JTextField username,String fechaInicio) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String opcion = "2";
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + fechaInicio, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

     public static String solicitudServidor3(JTextField name, JTextField lastName, JTextField username, JPasswordField clave,String avatar) {
        ClienteSocket cliente = new ClienteSocket();
        String opcion = "3";
        String nickname = username.getText();
        String password = clave.getText();
        String nombre = name.getText();
        String apellido = lastName.getText();
        //String avatar = IDavatar.getText();
        String resultado = cliente.ejecutarPeticion(opcion + ":" + nombre + ":" + apellido + ":" + nickname + ":" + password + ":" + avatar, "localhost", 9999);
        System.out.println("RESULTADO = " + resultado);
        if (resultado.equals("TRUE")) {
            System.out.println("CLIENTE Registro en el sistema -> de " + nombre + " " + apellido);
        } else {
            System.out.println("FALSE");
        }
        return resultado;
    }

        public static String solicitudServidor4(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }
        public static String solicitudServidor5(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }
         public static String solicitudServidor6(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }
          public static String solicitudServidor7(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }
        public static String solicitudServidor8(JTextField username, JPasswordField clave,String opcion) {
        ClienteSocket cliente = new ClienteSocket();
        String nickname = username.getText();
        String password = clave.getText();
        String resultado = "";
        resultado = cliente.ejecutarPeticion(opcion + ":" + nickname + ":" + password, "localhost", 9999);
        System.out.println(resultado);
        return resultado;
    }

}
