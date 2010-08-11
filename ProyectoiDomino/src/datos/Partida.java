/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;
//import com.toedter.calendar.JCalendar;

/**
 *
 * @author Sheryl
 */
public class Partida {

    private Usuario elUsuario;
    /*private JCalendar fechaactual;
    private JCalendar fechaIni;*/
    private float IDPartida;
    //ListaUsuarios listadoUsuarios;

    public float getIDPartida() {
        return IDPartida;
    }

    public void setIDPartida(float IDPartida) {
        this.IDPartida = IDPartida;
    }

    public Usuario getElUsuario() {
        return elUsuario;
    }

    public void setElUsuario(Usuario elUsuario) {
        this.elUsuario = elUsuario;
    }

    //Constructor
    public Partida(Usuario elUsuario) {
        this.elUsuario = elUsuario;

    }

    public void cargarPartida() {
    }

    public void crearPartida(Usuario elUsuario) {
        int i = 0, j = 0;

        ListaPiedras laListaPiedras;
        laListaPiedras = new ListaPiedras();

        System.out.println("Partida creada por " + elUsuario.getNombre());
        this.setElUsuario(elUsuario);
        this.setIDPartida(1);



        Jugador elJugador = new Jugador(elUsuario.getNombre(), elUsuario.getApellido(), elUsuario.getClave(), elUsuario.getNickname(), elUsuario.getAvatar(), elUsuario.getNumPartidasGan(), elUsuario.getNumIngresos(), elUsuario.getNumPartCreadas(), elUsuario.getPuntaje());
        Maquina laMaquina = new Maquina();
        Mesa laMesa = new Mesa();

        for (i = 0; i <= 6; i++) {

            for (j = i; j <= 6; j++) {
                laListaPiedras.agregarPiedra(new Piedra(i, j));
            }

        }

        laListaPiedras.elRepartidor(elJugador, laMaquina, laMesa);
    }

    public void salirPartida() {
    }
}
