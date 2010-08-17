/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

//import java.util.*;
//import com.toedter.calendar.JCalendar;

/**
 *
 * @author Sheryl
 */
public class Partida {

    private Usuario elUsuario;
    /*private JCalendar fechaactual;
    private JCalendar fechaIni;*/
    private int IDPartida;
    //ListaUsuarios listadoUsuarios;
    private String fechaIni;
    private String fechaactual;
    private Juego elJuego;

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaactual() {
        return fechaactual;
    }

    public void setFechaactual(String fechaactual) {
        this.fechaactual = fechaactual;
    }

    public float getIDPartida() {
        return IDPartida;
    }

    public void setIDPartida(int IDPartida) {
        this.IDPartida = IDPartida;
    }

    public Usuario getElUsuario() {
        return elUsuario;
    }

    public void setElUsuario(Usuario elUsuario) {
        this.elUsuario = elUsuario;
    }

    //Constructor
    public Partida() {

    }

    public Partida(Usuario elUsuario) {
        this.elUsuario = elUsuario;

    }

    public Partida(Usuario elUsuario, int IDPartida, String fechaIni, String fechaactual, Juego elJuego) {
        this.elUsuario = elUsuario;
        this.fechaIni = fechaIni;
        this.fechaactual = fechaactual;
    }

    public Partida(Usuario elUsuario, int IDPartida, String fechaIni, String fechaactual) {
        this.elUsuario = elUsuario;
        this.fechaIni = fechaIni;
        this.fechaactual = fechaactual;
        this.IDPartida = IDPartida;

    }

    public void cargarPartida() {
    }

    public void/*Partida*/ crearPartida(String nickname) {
        int i = 0, j = 0;

        ListaPiedras laListaPiedras;
        laListaPiedras = new ListaPiedras();

        System.out.println("Partida creada por " + nickname);
        //this.setElUsuario(elUsuario);
        this.setIDPartida(1);
        this.fechaIni = "11-08-10";
        this.setFechaIni(fechaIni);
        this.fechaactual = "11-08-10";
        this.setFechaactual(fechaactual);

        this.elJuego = new Juego(0, null, null, null);
        elJuego.setJugador1(new Jugador("", "", "", nickname, "", 0,0,0,0));
        elJuego.setJugador2(new Maquina());
        elJuego.setLaMesa(new Mesa());

        for (i = 0; i <= 6; i++) {

            for (j = i; j <= 6; j++) {
                laListaPiedras.agregarPiedra(new Piedra(i, j));
            }

        }

        laListaPiedras.elRepartidor(elJuego.getJugador1(), elJuego.getJugador2(), elJuego.getLaMesa());

        Partida laPartida;
        //laPartida = new Partida(elUsuario, elJuego, 1);
        laPartida = new Partida(elUsuario, IDPartida, fechaIni, fechaactual);
        System.out.println("se creo");

        //return (laPartida);
    }

    public void salirPartida() {
    }
}

