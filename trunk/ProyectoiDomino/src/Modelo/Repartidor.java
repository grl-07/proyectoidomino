/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alberly
 */
import java.util.*;

public class Repartidor {

    private int cont;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    //Constructor
    public Repartidor() {
        cont = 0;
    }

    /*public void finalize() throws Throwable {

    }*/
    public int repartir(ListaPiedras lista, int num1, int num2, int cont) {
        //while (cont<7){
        //fichas para el jugador
            /*num1 = numAleatorios.nextInt(6);
        num2 = numAleatorios.nextInt(6);*/

        if (num1 >= num2) {
            Piedra laPiedra = new Piedra(0, 0);
            laPiedra.setNum1(num1);
            laPiedra.setNum2(num2);
            lista.agregarPiedra(laPiedra);
            cont++;
        }
        //}
        return cont;
    }

    public void repartirPiedras(Jugador J, Maquina M, Mesa P) {

        ControlJugadores elJugador = J.getElJugador();
        ListaPiedras PiedrasJ = elJugador.getPiedrasEnMano();

        ControlJugadores laMaquina = M.getLaMaquina();
        ListaPiedras PiedrasM = laMaquina.getPiedrasEnMano();

        ListaPiedras Pozo = P.getElPozo();

        Random numAleatorios = new Random();

        int num1;
        int num2;
        //Piedras del Jugador y la Maquina
        while (cont < 14) {
            num1 = numAleatorios.nextInt(6);
            num2 = numAleatorios.nextInt(6);
            cont = repartir(PiedrasJ, num1, num2, cont);
            cont = repartir(PiedrasM, num1, num2, cont);
        }

        cont = 0;
        //Piedras del Pozo
        while (cont < 14) {
            num1 = numAleatorios.nextInt(6);
            num2 = numAleatorios.nextInt(6);
            cont = repartir(Pozo, num1, num2, cont);
        }

        PiedrasJ.imprimirListaPiedras();
        PiedrasM.imprimirListaPiedras();
        Pozo.imprimirListaPiedras();
    }
}
