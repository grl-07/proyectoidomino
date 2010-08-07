
import Modelo.*;
import java.io.*;
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
        Partida laPartida = new Partida();

        //Agregar Usuario
        listadoUsuarios.agregarUsuario(new Usuario("Daniel", "Sierra", "123456", "danieluchin", "dani54", 0, 0, 0, 0));
        listadoUsuarios.agregarUsuario(new Usuario("Alberly", "Martinez", "654321", "alberlykida12", "abe28", 0, 0, 0, 0));
        listadoUsuarios.agregarUsuario(new Usuario("Sheryl", "Ravelo", "135790", "shishi348", "shi8", 0, 0, 0, 0));

        listadoUsuarios.mostrarUsuario();

        //Modificar Usuario
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

                switch(opcion) {
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
        listadoUsuarios.modificarUsuario(elUsuario, null, i);/*modificarUsuario();*///Fin de Modificar Usuario

        //Reporte objeto = new Reporte();
        //objeto.ordenPartidasGanadas(listadoUsuarios);

        
        laPartida.crearPartida();

        //listadoUsuarios.ordenPartidasGanadas();




        //ESTO NO VA AQUI (CREO) PORQUE YA SE HACE EN CREAR PARTIDA
        /*LLENAR LA LISTA CON TODAS LAS PIEDRAS DEL JUEGO*/
    /*    ListaPiedras laListaPiedras;
        laListaPiedras = new ListaPiedras();

        for (i = 0; i <= 6; i++) {

            for (j = i; j <= 6; j++) {
                laListaPiedras.agregarPiedra(new Piedra(i, j));
            }

        }

        Jugador elJugador = new Jugador("Daniel", "Sierra", "123456", "danieluchin", "dani54", 0, 0, 0, 0);
        Maquina laMaquina = new Maquina();
        Mesa laMesa = new Mesa();

        laListaPiedras.elRepartidor(elJugador, laMaquina, laMesa);*/

    }
}
