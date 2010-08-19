/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CASITA
 */
package servidor.logica;

import ve.edu.ucab.server.logica.LogicaServidor;
//import Logica.Conector.*;
import servidor.datos.*;

public class PruebaJsockets implements LogicaServidor {
    //private static ListaUsuarios listaDeUsuarios = new ListaUsuarios();

    public String realizarOperacion(String arg) {
        String[] subArg = arg.split(":");
        Usuario elUsuario = new Usuario("", "", "", "", "", 0, 0, 0, 0);
        Partida laPartida = new Partida();
        elUsuario.setID(Integer.parseInt(subArg[0]));
        int opcion = elUsuario.getID();
        switch (opcion) {
            case 1:
                elUsuario.setNickname(subArg[1]);
                elUsuario.setClave(subArg[2]);
                break;
            case 2:
                elUsuario.setNickname(subArg[1]);
                laPartida.setFechaIni(subArg[2]);
                break;
            case 3:
                elUsuario.setNickname(subArg[1]);
                elUsuario.setClave(subArg[2]);
                elUsuario.setNombre(subArg[3]);
                elUsuario.setApellido(subArg[4]);
                elUsuario.setFechaNac(subArg[5]);
                elUsuario.setAvatar(subArg[6]);
                break;
            case 4:
                elUsuario.setNickname(subArg[1]);
                //laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 5:
                elUsuario.setNickname(subArg[1]);
                //laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 6:
                elUsuario.setNickname(subArg[1]);
                //laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 7:
                elUsuario.setNickname(subArg[1]);
                break;
        }

        return respuestaServidor(elUsuario, laPartida, opcion);
    }

    public String respuestaServidor(Usuario elUsuario, Partida laPartida, int opcion) {
        String resultado = "FALSE";
        String cadena;
        String[] subArg;
        Usuario registro = null;


        switch (opcion) {
            case 1:
                boolean confirm = Conector.comprobarDatos(elUsuario.getNickname(), elUsuario.getClave());
                if (confirm == true) {
                    registro = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());
                    resultado = "TRUE:" + registro.getNombre() + ":" + registro.getApellido() + ":" + registro.getAvatar();
                    System.out.println("EN SERVIDOR Entrar al sistema -->" + resultado);
                }
                break;
            case 2:
                Partida partidaNueva = Datos.obtenerPartidaCreada(elUsuario.getNickname());
                //Datos.crearPartida(elUsuario.getNickname());
                String cadenaPiedras;
                cadenaPiedras = partidaNueva.getElJuego().getLaMesa().getElPozo().obtenerPiedras();
                //System.out.println("cadenaPiedras =  " + partidaNueva.getElJuego().getLaMesa().);
                System.out.println("cadenaPiedras =  " + cadenaPiedras);
                resultado = cadenaPiedras;
                break;
            case 3:
                if (Conector.comprobarNickname(elUsuario.getNickname()) == false) {
                    Conector.guardarDatos(elUsuario.getNombre(), elUsuario.getApellido(), elUsuario.getNickname(), elUsuario.getClave(), elUsuario.getAvatar(), elUsuario.getFechaNac());
                    resultado = "TRUE";
                    System.out.println("EN SERVIDOR Registro del sistema -> " + resultado);
                }
                break;
            case 4:
                cadena = "TRUE:" + elUsuario.getNickname() + ":IDPartida";
                subArg = cadena.split(":");
                resultado = subArg[0];
                System.out.println("Guardar Partida -> " + cadena);
                break;
            case 5:
                cadena = "TRUE:x1-y1";
                subArg = cadena.split(":");
                resultado = subArg[0];
                System.out.println("Enviar Jugada -> " + cadena);
                break;
            case 6:
                cadena = "TRUE";
                subArg = cadena.split(":");
                resultado = subArg[0];
                System.out.println("Agarrar pieza del Pozo -> " + cadena);
                break;
            case 7:
                cadena = "TRUE:mensaje";
                subArg = cadena.split(":");
                resultado = subArg[0];
                System.out.println("Fin de partida -> " + cadena);
                break;
        }


        return resultado;
    }
}
