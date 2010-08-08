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
    public Partida() {
        elUsuario = new Usuario("Daniel", "Sierra", "123456", "danieluchin", "dani54", 0, 0, 0, 0);
    }

    /*public void finalize() throws Throwable {

    }*/
    public void cargarPartida() {
    }

    public void crearPartida() {
        int i = 0, j = 0;

        ListaPiedras laListaPiedras;
        laListaPiedras = new ListaPiedras();

        System.out.println("Partida creada por " + elUsuario.nombre);
        Jugador elJugador = new Jugador(elUsuario.nombre, elUsuario.apellido, elUsuario.clave, elUsuario.nickname, elUsuario.avatar, elUsuario.numPartidasGan, elUsuario.numIngresos, elUsuario.numPartidasGan, elUsuario.puntaje);
        Maquina laMaquina = new Maquina();
        Mesa laMesa = new Mesa();

        for (i = 0; i <= 6; i++) {

            for (j = i; j <= 6; j++) {
                laListaPiedras.agregarPiedra(new Piedra(i, j));
            }

        }

        laListaPiedras.elRepartidor(elJugador, laMaquina, laMesa);
    }

    public boolean guardarPartida() {
        return false;
    }

    public void salirPartida() {
    }
}