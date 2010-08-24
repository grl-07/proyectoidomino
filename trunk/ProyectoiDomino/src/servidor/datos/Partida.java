/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;
import java.util.Calendar;

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

    public Juego getElJuego() {
        return elJuego;
    }

    public void setElJuego(Juego elJuego) {
        this.elJuego = elJuego;
    }

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

    public int getIDPartida() {
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
        this.elJuego = elJuego;
        this.IDPartida = IDPartida;
    }

    public Partida(Usuario elUsuario, int IDPartida, String fechaIni, String fechaactual) {
        this.elUsuario = elUsuario;
        this.fechaIni = fechaIni;
        this.fechaactual = fechaactual;
        this.IDPartida = IDPartida;

    }

    public void cargarPartida() {
    }

   public String obtenerFechaDelSistema(){
   Calendar Calendario= Calendar.getInstance();
   String fecha = Calendario.get(Calendario.DATE)+"/"+(Calendario.get(Calendario.MONTH)+1)+"/"+Calendario.get(Calendario.YEAR);
   return (fecha);
    }

    public Partida crearPartida(String nickname, ListaPiedras listaDePiedras) {
        int i = 0, j = 0;

        //ListaPiedras laListaPiedras;
        //laListaPiedras = new ListaPiedras();
   String fechaInicioPartida = obtenerFechaDelSistema();
        String fechaActual = obtenerFechaDelSistema();
        System.out.println("Partida creada por " + nickname);
        //this.setElUsuario(elUsuario);
        this.setIDPartida(1);
        //this.fechaIni = "11-08-10";
        //this.setFechaIni(fechaIni);
        this.setFechaIni(fechaInicioPartida);
        //this.fechaactual = "11-08-10";
        this.setFechaactual(fechaActual);
        this.setFechaactual(fechaactual);

        System.out.println("FECHA INICIO PARTIDA::::"+this.getFechaIni());
        System.out.println("FECHA ACTUAL:::::"+this.getFechaactual());


        this.elJuego = new Juego(0, null, null, null);
        elJuego.setJugador1(new Jugador(nickname, "", 0, 0, 0, 0));
        elJuego.setJugador2(new Maquina());
        elJuego.setLaMesa(new Mesa(new ListaPiedras(), -1, -1,null));

        listaDePiedras.elRepartidor(elJuego.getJugador1(), elJuego.getJugador2(), elJuego.getLaMesa());

        Partida laPartida;
        elUsuario = new Usuario("", "", "", nickname, "", "");
        laPartida = new Partida(elUsuario, IDPartida, fechaIni, fechaactual, elJuego);


        return (laPartida);
    }

    public void salirPartida() {
    }
}
