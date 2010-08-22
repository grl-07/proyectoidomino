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
        int num1, num2;
        String[] subArg = arg.split(":");
        Usuario elUsuario = new Usuario("", "", "", "", "", 0, 0, 0, 0);
        Partida laPartida = new Partida();
        Piedra laPiedra = new Piedra(0, 0, "0");
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
                String[] subArg2 = subArg[2].split("-");
                num1 = Integer.parseInt(subArg2[0]);
                num2 = Integer.parseInt(subArg2[1]);
                laPiedra.setNum1(num1);
                laPiedra.setNum2(num2);
                laPiedra.setPosicion(subArg[3]);
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

        return respuestaServidor(elUsuario, laPartida, laPiedra, opcion);
    }

    public String respuestaServidor(Usuario elUsuario, Partida laPartida, Piedra laPiedra, int opcion) {
        String resultado = "FALSE";
        String cadena;
        Partida partidaNueva = null;
        Partida partidaExistente = null;
        String[] subArg;
        Usuario registro = null;
        String piedraStr;
        boolean confirm = false;


        switch (opcion) {
            case 1:
                confirm = Conector.comprobarDatos(elUsuario.getNickname(), elUsuario.getClave());
                if (confirm == true) {
                    registro = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());
                    resultado = "TRUE:" + registro.getNombre() + ":" + registro.getApellido() + ":" + registro.getAvatar() + ":" + registro.getFechaNac();
                    System.out.println("EN SERVIDOR Entrar al sistema -->" + resultado);
                }
                break;
            case 2:
                //Datos.inicializarListasJuego();
                Datos.inicializarMatrizPiedras();

                partidaNueva = Datos.obtenerPartidaCreada(elUsuario.getNickname());

                cadena = partidaNueva.getElJuego().getJugador1().getElJugador().getPiedrasEnMano().obtenerPiedras();
                //System.out.println("cadenaPiedras =  " + partidaNueva.getElJuego().getLaMesa().);
                System.out.println("cadenaPiedras =  " + cadena);
                resultado = cadena;
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
                /*cadena = "TRUE:x1-y1";
                subArg = cadena.split(":");
                resultado = subArg[0];*/
                /*partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());

                cadena = partidaNueva.getElJuego().getLaMesa().getMatrizPiedrasMesa().validarJugada(subArg[2], subArg[3]);
                resultado = "TRUE:" + cadena;*/
                //System.out.println("Enviar Jugada -> " + cadena);
                piedraStr = laPiedra.getNum1() + "-" + laPiedra.getNum2();
                partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());

                laPiedra = partidaExistente.getElJuego().getLaMesa().validarJugada(piedraStr, laPiedra.getPosicion(), Datos.getListaDePiedras(), Datos.getMatrizPiedrasMesa());

                if (laPiedra != null) {
                    resultado = "TRUE:NULL";
                } else {
                    resultado = "FALSE";
                }
                break;
            case 6:
                cadena = "TRUE";
                subArg = cadena.split(":");
                resultado = subArg[0];
                System.out.println("Fin de partida -> " + cadena);
                break;
            case 7:
                partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());

                cadena = partidaExistente.getElJuego().getLaMesa().getElPozo().obtenerPiedraPozo();

                if (!cadena.equalsIgnoreCase("")) {
                    resultado = "TRUE:" + cadena;
                }
                /*subArg = cadena.split(":");
                resultado = subArg[0];*/
                System.out.println("Agarrar pieza del Pozo -> " + resultado);
                break;
        }


        return resultado;
    }
}