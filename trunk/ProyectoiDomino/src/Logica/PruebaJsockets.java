/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CASITA
 */
package Logica;
import ve.edu.ucab.server.logica.LogicaServidor;
//import Logica.Conector.*;
import datos.*;


public class PruebaJsockets implements LogicaServidor {
    //private static ListaUsuarios listaDeUsuarios = new ListaUsuarios();
    
    public String realizarOperacion(String arg) { //args es la cadena de String a la que se le hara split
        String[] subArg = arg.split(":");
        Usuario elUsuario = new Usuario("","","","","",0,0,0,0);
        elUsuario.setID(Integer.parseInt(subArg[0]));
        int opcion = elUsuario.getID();
        switch (opcion) {
            case 1:
                elUsuario.setNickname(subArg[1]);
                elUsuario.setClave(subArg[2]);
                break;
            case 2:
                elUsuario.setNickname(subArg[1]);
                break;
            case 3:
                elUsuario.setNickname(subArg[1]);
                elUsuario.setClave(subArg[2]);
                elUsuario.setNombre(subArg[3]);
                elUsuario.setApellido(subArg[4]);
                elUsuario.setAvatar(subArg[5]);
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

        return respuestaServidor(elUsuario,opcion);
    }

    public String respuestaServidor(Usuario elUsuario, int opcion) {
        String resultado = "FALSE";
        String cadena;
        String[] subArg;
        //Usuario registro = null;
        //System.out.println("NICKNAME = " +elUsuario.getNickname());
        //registro = ConexionJsockets.obtenerDatosDeUsuario(elUsuario.getNickname());

        switch (opcion) { //estas impresiones salen en el servidor
                case 1:
                    //resultado = "TRUE:" + registro.getNombre() + ":" + registro.getApellido() + ":" + registro.getAvatar();
                    resultado = "TRUE:" + elUsuario.getNickname() + ":" + elUsuario.getClave();
                    System.out.println("operacion exitosa -->" + resultado);
                    break;
                case 2:
                    cadena = "TRUE:" + elUsuario.getNickname() + ":FechaCreacionPartida";
                    subArg = cadena.split(":");
                    resultado = subArg[0];
                    System.out.println("Crear partida (devuelve las puiezas) -> " + cadena);
                    break;
                case 3:
                    cadena = "TRUE";
                    subArg = cadena.split(":");
                    resultado = subArg[0];
                    System.out.println("Registro -> " + cadena);
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



