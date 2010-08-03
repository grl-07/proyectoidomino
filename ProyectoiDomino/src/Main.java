import Modelo.*;
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mis hijos
 */
public class Main {

    public static void main(String args[]){

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        ListaUsuarios listadoUsuarios;
        listadoUsuarios = new ListaUsuarios();

        for (i=0;i<2;i++){

        try
        {
            System.out.println("Introduzca su nombre: ");
            String nombre = br.readLine();
            System.out.println("Introduzca su apellido: ");
            String apellido = br.readLine();
            System.out.println("Introduzca nombre de Usuario: ");
            String nickname = br.readLine();
            System.out.println("Introduzca clave secreta: ");
            String clave = br.readLine();
            System.out.println("Elija una imagen para su Avatar: ");
            String avatar = br.readLine();

            listadoUsuarios.agregarUsuario(new Usuario(nombre,apellido,clave,nickname,avatar,0,0));
        }
        catch (Exception e)
        {
            
        }
        }
        listadoUsuarios.imprimir();
        }
}
