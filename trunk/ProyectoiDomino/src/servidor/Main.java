package servidor;

import servidor.datos.*;
import java.io.*;
import java.util.Calendar;
//import com.toedter.calendar.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mis hijos
 */
public class Main {

    public static void main(String args[]) {

        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int j = 0;
        ListaUsuarios listadoUsuarios;
        listadoUsuarios = new ListaUsuarios();
        ListaPartidas listadoPartidas = new ListaPartidas();
        Partida laPartida = new Partida(null);

        //Agregar Usuario

    /*    listadoUsuarios.agregarUsuario(new Usuario("Daniel", "Sierra", "123456", "danieluchin", "dani54", 1, 5, 9, 4));
        listadoUsuarios.agregarUsuario(new Usuario("Alberly", "Martinez", "654321", "alberlykida12", "abe28", 4, 6, 5, 9));
        listadoUsuarios.agregarUsuario(new Usuario("Sheryl", "Ravelo", "135790", "shishi348", "shi8", 7, 8, 1, 3));
*/

        System.out.println("\nLISTADO DE USUARIOS\n");
        listadoUsuarios.mostrarUsuario();

        //Modificar Usuario
        /*System.out.println("\nMODIFICAR USUARIO\n");
        Usuario elUsuario;
        elUsuario = new Usuario("", "", "", "shishi348", "", 0, 0, 0, 0);

        if (listadoUsuarios.buscarNickname(elUsuario)) {


            System.out.println("Que desea modificar? \n");
            System.out.println("1: Nombre");
            System.out.println("2: Apellido");
            System.out.println("3: Clave");
            System.out.println("4: Avatar");
            System.out.println("5: Salir");
            System.out.print("Ingrese Opcion  ");


            try {
                String x = br.readLine();
                int opcion = Integer.parseInt(x);

                switch (opcion) {
                    case 1:
                        elUsuario = new Usuario("Jesse", "", "", "shishi348", "", 0, 0, 0, 0);
                        listadoUsuarios.modificarUsuario(elUsuario, "Jesse", opcion);
                        break;
                    case 2:
                        elUsuario = new Usuario("", "Marquez", "", "shishi348", "", 0, 0, 0, 0);
                        listadoUsuarios.modificarUsuario(elUsuario, "Marquez", opcion);
                        break;
                    case 3:
                        elUsuario = new Usuario("", "", "claveNueva", "shishi348", "", 0, 0, 0, 0);
                        listadoUsuarios.modificarUsuario(elUsuario, "claveNueva", opcion);
                        break;
                    case 4:
                        elUsuario = new Usuario("", "", "", "shishi348", "avatarNuevo", 0, 0, 0, 0);
                        listadoUsuarios.modificarUsuario(elUsuario, "avatarNuevo", opcion);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");

                }

            } catch (Exception e) {
            }

        } else {
            System.out.println("Usuario incorrecto");
        }
        listadoUsuarios.mostrarUsuario();
        ///Fin de Modificar Usuario */

        System.out.println("\nCREAR PARTIDA\n");
        //   listadoPartidas.crearPartida("danieluchin");
        //    listadoPartidas.crearPartida("alberlykida");
        System.out.println("\nLISTA PARTIDAS CREADAS\n");
        //listadoPartidas.imprimirPartidas();

        Archivo.guardarDatosArchivoPartidas(listadoPartidas);


        //REPORTE
      /*  Reporte elReporte = new Reporte();
        System.out.println("\nREPORTES \n");
        elReporte.ordenarPorIngresos(listadoUsuarios);
        System.out.println("\n");
        elReporte.ordenarPorPartidasCreadas(listadoUsuarios);
        System.out.println("\n");
        elReporte.ordenPartidasGanadas(listadoUsuarios);
        System.out.println("\n");
        elReporte.usuarioMayorScore(listadoUsuarios);
*/
        Calendar calendario = Calendar.getInstance();
        int diaHoy = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int año = calendario.get(Calendar.YEAR);
        System.out.println("dia: " + diaHoy + " mes: " + mes + " año: " + año);



    }
}
