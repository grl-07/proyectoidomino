/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.io.*;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author CASITA
 */
public class ClienteTest {

    public static void main(String[] args) {
        ClienteSocket cliente = new ClienteSocket();
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese opcion (del 1 al 7) ");
            String linea = br.readLine();
            int opcion = Integer.parseInt(linea);

            switch (opcion) {
                case 1:
                    String resultado = cliente.ejecutarPeticion("1:shishi:claveSheryl", "localhost", 7687);
                    System.out.println(resultado);
                    break;
                case 2:
                    String resultado2 = cliente.ejecutarPeticion("2:shishi", "localhost", 7687);
                    System.out.println(resultado2);
                    break;
                case 3:
                    String resultado3 = cliente.ejecutarPeticion("3:shishi:claveSheryl:Sheryl:Ravelo:IDAvatar", "localhost", 7687);
                    System.out.println(resultado3);
                    break;
                case 4:
                    String resultado4 = cliente.ejecutarPeticion("4:shishi:1991", "localhost", 7687);
                    System.out.println(resultado4);
                    break;
                case 5:
                    String resultado5 = cliente.ejecutarPeticion("5:shishi:1991", "localhost", 7687);
                    System.out.println(resultado5);
                    break;
                case 6:
                    String resultado6 = cliente.ejecutarPeticion("6:shishi", "localhost", 7687);
                    System.out.println(resultado6);
                    break;
                case 7:
                    String resultado7 = cliente.ejecutarPeticion("7:shishi:1991", "localhost", 7687);
                    System.out.println(resultado7);
                    break;
            }
        } catch (Exception e) {
        }


    }
}

