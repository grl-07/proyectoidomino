/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.io.*;
import ve.edu.ucab.cliente.ClienteSocket;
import datos.Usuario;
import Logica.PruebaJsockets;
import View.VentanaLogin;

/**
 *
 * @author CASITA
 */
public class ClienteTest {

    public static void main(String[] args) {

         VentanaLogin ventana = new VentanaLogin();
         ventana.setVisible(true);
        /*ClienteSocket cliente = new ClienteSocket();

        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese opcion (del 1 al 7) ");
            String linea = br.readLine();

            int opcion = Integer.parseInt(linea);
            String resultado;
            //int opcion = 1;
            //System.out.println("args = " +args[0]);
            PruebaJsockets.cargarArchivo();

            switch (opcion) {
                case 1:
                    resultado = cliente.ejecutarPeticion("1:shishi:claveSheryl", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = cliente.ejecutarPeticion("2:shishi", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = cliente.ejecutarPeticion("3:shishi:claveSheryl:Sheryl:Ravelo:IDAvatar", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = cliente.ejecutarPeticion("4:shishi:1991", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 5:
                    resultado = cliente.ejecutarPeticion("5:shishi:1991", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 6:
                    resultado = cliente.ejecutarPeticion("6:shishi", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 7:
                    resultado = cliente.ejecutarPeticion("7:shishi:1991", "localhost", 7687);
                    System.out.println(resultado);
                    break;
            }
        } catch (Exception e) {
        }*/


    }

}

