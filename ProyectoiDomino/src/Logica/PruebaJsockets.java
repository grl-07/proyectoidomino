/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CASITA
 */
package logica;
import datos.*;
import ve.edu.ucab.server.logica.LogicaServidor;

public class PruebaJsockets implements LogicaServidor {

    public String realizarOperacion(String arg) {
        String[] subArg = arg.split(":");
        Usuario elUsuario = new Usuario("Daniel", "Sierra", "123456", "danieluchin", "dani54", 1, 5, 9, 4);
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
                laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 5:
                elUsuario.setNickname(subArg[1]);
                laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 6:
                elUsuario.setNickname(subArg[1]);
                laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 7:
                elUsuario.setNickname(subArg[1]);
                break;
        }


        return realizarReserva(elUsuario,laPartida,opcion);
    }

    public String realizarReserva(Usuario elUsuario,Partida laPartida, int opcion) {
        String resultado = "TRUE";

        switch (opcion) {
                case 1:
                    System.out.println("El ingreso a " + elUsuario.getNickname() + " " + elUsuario.getClave() + " se ha efectuado");
                    break;
                case 2:
                    System.out.println("El Crear Partida a " + elUsuario.getNickname() + ", FechaCreacionPartida, se ha efectuado");
                    break;
                case 3:
                    System.out.println("El Registro a " + elUsuario.getNickname() + " se ha efectuado");
                    break;
                case 4:
                    System.out.println("El Guardar Partida de " + elUsuario.getNickname() + ", IDPartida = " + laPartida.getIDPartida() + " se ha efectuado");
                    break;
                case 5:
                    System.out.println("El Enviar Jugada de " + elUsuario.getNickname() + ", IDPartida = " + laPartida.getIDPartida() + " se ha efectuado");
                    break;
                case 6:
                    System.out.println("El Agarrar pieza del Pozo de " + elUsuario.getNickname()  + " se ha efectuado");
                    break;
                case 7:
                    System.out.println("El Fin de partida de " + elUsuario.getNickname() + ", IDPartida = " + laPartida.getIDPartida() + " se ha efectuado");
                    break;
            }


        return resultado;
    }
}

