package servidor.logica;

import ve.edu.ucab.server.logica.LogicaServidor;
import servidor.datos.*;

public class PruebaJsockets implements LogicaServidor {
    //private static ListaUsuarios listaDeUsuarios = new ListaUsuarios();

    /**
     * setea datos del usuario, la piedra, la partida, y llama a respuesta servidor con estos objetos seteados
     * @param arg cadena de protocolo con la información necesaria para ser seteada en el usuario, piedra o partida.
     * @return un string, una cadena con la respuesta del servidor
     */
    public String realizarOperacion(String arg) {
        int num1, num2;
        String[] subArg = arg.split(":");
        Usuario elUsuario = new Usuario("", "", "", "", "", "");
        Partida laPartida = new Partida();
        Piedra laPiedra = new Piedra(0, 0, "0");
        elUsuario.setID(Integer.parseInt(subArg[0]));
        int opcion = elUsuario.getID();

        System.out.println("cadena = " + arg);
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
                if (!subArg2[0].equalsIgnoreCase("NULL")) {
                    num1 = Integer.parseInt(subArg2[0]);
                    num2 = Integer.parseInt(subArg2[1]);
                    laPiedra.setNum1(num1);
                    laPiedra.setNum2(num2);
                    laPiedra.setPosicion(subArg[3]);
                    laPiedra.setImagenActual(subArg[4]);
                } else {
                    laPiedra.setNum1(-1);
                    laPiedra.setNum2(-1);
                }
                //laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 6:
                elUsuario.setNickname(subArg[1]);
                //laPartida.setIDPartida(Integer.parseInt(subArg[2]));
                break;
            case 7:
                elUsuario.setNickname(subArg[1]);
                break;
            case 8:
                elUsuario.setNickname(subArg[1]);
                if (subArg[3].equalsIgnoreCase("1")) {
                    elUsuario.setNombre(subArg[2]);
                } else if (subArg[3].equalsIgnoreCase("2")) {
                    elUsuario.setApellido(subArg[2]);
                } else if (subArg[3].equalsIgnoreCase("3")) {
                    elUsuario.setClave(subArg[2]);
                } else if (subArg[3].equalsIgnoreCase("4")) {
                    elUsuario.setAvatar(subArg[2]);
                }
                //elUsuario.setFechaNac(subArg[5]);
                break;

            case 9:
                elUsuario.setNickname(subArg[1]);
        }
        if (elUsuario.getID() == 8) {
            return respuestaServidor(elUsuario, laPartida, laPiedra, opcion, subArg[3]);
        }

        return respuestaServidor(elUsuario, laPartida, laPiedra, opcion, "");
    }

    /**
     * Este método es el encargado de realizar las diferentes solicitudes del cliente: ingresar al sistema,
     * crear partida, registrar, guardar partida, validar jugada, terminar juego, tomar piedra del pozo, modificar datos del cliente.
     * @param elUsuario con la información del usuario que realizó la solicitud
     * @param laPartida con la información básica (nickname, fecha de inicio) de la partida
     * @param laPiedra con la información necesaria para validar una jugada
     * @param opcion, entero para determinar cual es la solicitud del cliente
     * @param op
     * @return un string, una cadena con el protocolo establecido de retorno de las solicitudes
     */
    public String respuestaServidor(Usuario elUsuario, Partida laPartida, Piedra laPiedra, int opcion, String op) {
        String resultado = "FALSE";
        String cadena = "";
        Partida partidaNueva = null;
        Partida partidaExistente = null;
        String[] subArg;

        String piedraStr;
        boolean confirm = false;
        //Usuario registro = new Usuario("","","","","","",0,0,0,0);;
        Usuario registro = null;


        switch (opcion) {
            case 1:
                confirm = Conector.comprobarDatos(elUsuario.getNickname(), elUsuario.getClave());
                if (confirm == true) {
                    registro = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());
                    int cont = registro.getNumIngresos();
                    Conector.guardarNumIngresos(registro, cont);
                    resultado = "TRUE:" + registro.getNombre() + ":" + registro.getApellido() + ":" + registro.getAvatar() + ":" + registro.getFechaNac();
                    //resultado = "TRUE:prueba:prueba:prueba:prueba";
                    System.out.println("EN SERVIDOR Entrar al sistema -->" + resultado);
                }
                break;
            case 2:
                registro = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());
                System.out.println("Nombre -->" + registro.getNombre());
                System.out.println("NICKNAME -->" + registro.getNickname());
                int cont = registro.getNumPartCreadas();
                Conector.guardarNumPartidasCreadas(registro, cont);
                //Datos.inicializarListasJuego();                

                partidaNueva = Datos.obtenerPartidaCreada(elUsuario.getNickname(), laPartida.getFechaIni());

                //inicializarPiedrasJuego
                Datos.inicializarMatrizPiedras();
                Datos.setListaPiedrasJugador(partidaNueva.getElJuego().getJugador1().getElJugador().getPiedrasEnMano());
                Datos.setListaPiedrasMaquina(partidaNueva.getElJuego().getJugador2().getLaMaquina().getPiedrasEnMano());
                Datos.setListaPiedrasPozo(partidaNueva.getElJuego().getLaMesa().getElPozo());
                //NUEVA LINEA PARA INICIAR LA MATRIZ DE PIEDRAS DEL JUEGO
                Datos.setMatrizPiedrasMesa(partidaNueva.getElJuego().getLaMesa().inicializarMatrizPiedras());

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
                if (Conector.solicitarGuardarPartidaEnLista(elUsuario.getNickname()) == true) {
                    resultado = "TRUE";
                    Conector.solicitarGuardarDatosPartidas();
                } else {
                    resultado = "FALSE";
                }
                System.out.println("Guardar Partida -> " + resultado);
                break;
            case 5:
                partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());
                partidaExistente.getElJuego().getJugador1().getElJugador().setPass(false);
                partidaExistente.getElJuego().getJugador2().getLaMaquina().setPass(false);

                //Jugada del Jugador
                if (laPiedra.getNum1() != -1) {
                    piedraStr = laPiedra.getNum1() + "-" + laPiedra.getNum2();

                    Datos.setListaPiedrasJugador(partidaExistente.getElJuego().getJugador1().getElJugador().getPiedrasEnMano());

                    laPiedra = partidaExistente.getElJuego().getLaMesa().validarJugada(elUsuario.getNickname(), piedraStr, laPiedra.getPosicion(), laPiedra.getImagenActual(), Datos.getListaDePiedras(), Datos.getMatrizPiedrasMesa(), Datos.getListaPiedrasJugador());

                } else {
                    partidaExistente.getElJuego().getJugador1().getElJugador().setPass(true);
                }
                //Jugada del Jugador FIN.

                if (laPiedra != null) {
                    confirm = true;
                    if (Datos.getListaPiedrasJugador().getLaListaPiedras().isEmpty()) {
                        partidaExistente.getElJuego().getJugador1().getElJugador().setEstado(true);
                        System.out.println("\nGano el jugador");
                    }

                    //Jugada de la Maquina
                    cadena = partidaExistente.getElJuego().getLaMesa().realizarJugadaMaquina(Datos.getListaPiedrasMaquina(), Datos.getMatrizPiedrasMesa(), Datos.getListaPiedrasPozo());

                    String subArgCadena[] = cadena.split(":");
                    if (subArgCadena[1].equalsIgnoreCase("")) {
                        cadena = "NULL";
                        partidaExistente.getElJuego().getJugador2().getLaMaquina().setPass(true);
                    } else if (Datos.getListaPiedrasMaquina().getLaListaPiedras().isEmpty() && !partidaExistente.getElJuego().getJugador1().getElJugador().isEstado()) {
                        partidaExistente.getElJuego().getJugador2().getLaMaquina().setEstado(true);
                        System.out.println("\nGano la Maquina");
                    }
                    //Jugada de la Maquina FIN.
                    //}
                }

                if (confirm) {
                    resultado = "TRUE:" + cadena;
                } else {
                    resultado = "FALSE";
                }
                break;
            case 6:
                partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());
                if (partidaExistente.getElJuego().getJugador1().getElJugador().isEstado() == true) {
                    resultado = "TRUE:USTED HA GANADO";
                    registro = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());
                    int partidasGanadas = registro.getNumPartidasGan();
                    Conector.guardarNumPartidasGanadas(registro, partidasGanadas);
                    Conector.guardarNuevoPuntaje(registro);
                } else {
                    if (partidaExistente.getElJuego().getJugador2().getLaMaquina().isEstado() == true) {
                        resultado = "TRUE:USTED HA PERDIDO";
                    } else {
                        if (partidaExistente.getElJuego().getJugador1().getElJugador().isPass() == true && partidaExistente.getElJuego().getJugador2().getLaMaquina().isPass() == true) {

                            System.out.println("JUEGO TRANCADO:::::::::::::::::::::::");
                            resultado = "TRUE:JUEGO TRANCADO";
                        } else {
                            resultado = "FALSE";
                        }
                    }
                }

                System.out.println("Fin de partida -> " + resultado);
                break;
            case 7:
                partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());

                if (!Datos.getListaPiedrasPozo().getLaListaPiedras().isEmpty()) {
                    laPiedra = Datos.getListaPiedrasPozo().obtenerPiedraPozo();
                    cadena = laPiedra.obtenerCadenaPiedraJugador();
                    if (!cadena.equalsIgnoreCase("")) {
                        partidaExistente.getElJuego().getJugador1().getElJugador().getPiedrasEnMano().agregarPiedra(laPiedra);
                        resultado = "TRUE:" + cadena;
                    }
                } else {
                    resultado = "FALSE";
                }

                System.out.println("Agarrar pieza del Pozo -> " + resultado);
                break;
            case 8:
                registro = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());
                if (op.equalsIgnoreCase("1")) {

                    //Conector.guardarNuevoNombre(registro);
                    //registro.setNombre(elUsuario.getNombre());

                    Conector.guardarNuevoDato(registro, elUsuario, op);
                    resultado = "TRUE:" + elUsuario.getNombre();

                } else if (op.equalsIgnoreCase("2")) {

                    registro.setApellido(elUsuario.getApellido());

                    Conector.guardarNuevoDato(registro, elUsuario, op);
                    resultado = "TRUE:" + elUsuario.getApellido();

                } else if (op.equalsIgnoreCase("3")) {

                    registro.setClave(elUsuario.getClave());

                    Conector.guardarNuevoDato(registro, elUsuario, op);
                    resultado = "TRUE:" + elUsuario.getClave();

                } else if (op.equalsIgnoreCase("4")) {

                    registro.setAvatar(elUsuario.getAvatar());

                    Conector.guardarNuevoDato(registro, elUsuario, op);
                    resultado = "TRUE:" + elUsuario.getAvatar();

                }


                /*elUsuario = Datos.modificarDatosUsuario(elUsuario);
                Conector.guardarDatos(elUsuario.getNombre(), elUsuario.getApellido(), elUsuario.getNickname(), elUsuario.getClave(), elUsuario.getAvatar(), elUsuario.getFechaNac());
                resultado = "TRUE:" + registro.getNombre() + ":" + registro.getApellido() + ":" + registro.getAvatar() + ":" + registro.getFechaNac();
                System.out.println("cadena = " + resultado);*/
                break;

            case 9:
                partidaExistente = Datos.obtenerPartidaExistente(elUsuario.getNickname());

                if (!Datos.getListaPiedrasPozo().getLaListaPiedras().isEmpty()) {
                    int numPiedrasPozo = Datos.getListaPiedrasPozo().getLaListaPiedras().size();
                    resultado = Integer.toString(numPiedrasPozo);                    
                } else {
                    resultado = "0";
                }

                System.out.println("Numero de piedras del pozo -> " + resultado);
                break;
        }
        return resultado;
    }
}
