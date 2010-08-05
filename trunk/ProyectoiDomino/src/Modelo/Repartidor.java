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
    public boolean aprobarPiedra(ListaPiedras piedrasRepartidas, Piedra laPiedra) {

        boolean encontrado = false;
        Piedra piedraAux = null;

        Iterator iterador = piedrasRepartidas.iterator;

        while (!encontrado && iterador.hasNext()) {

            piedraAux = (Piedra) iterador.next();
            if (laPiedra.equals(piedraAux)) {
                return true;
            }
        }
        return false;
    }

    public int repartir(ListaPiedras lista, ListaPiedras piedrasRepartidas, int num1, int num2, int cont) {
        //while (cont<7){
        //fichas para el jugador
            /*num1 = numAleatorios.nextInt(6);
        num2 = numAleatorios.nextInt(6);*/
        boolean confirm;
        //Mesa elConfirm;
        //elConfirm = new Mesa();
        confirm = false;


        if (num1 >= num2) {
            Piedra laPiedra = new Piedra(0, 0);
            laPiedra.setNum1(num1);
            laPiedra.setNum2(num2);


            confirm = aprobarPiedra(piedrasRepartidas, laPiedra);

            if (confirm) {
                piedrasRepartidas.agregarPiedra(laPiedra);
                lista.agregarPiedra(laPiedra);
                cont++;
            }

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

        ListaPiedras piedrasRepartidas;
        piedrasRepartidas = new ListaPiedras();

        Random numAleatorios = new Random();

        int num1;
        int num2;


        //Piedras del Jugador
        while (cont < 7) {
            num1 = numAleatorios.nextInt(6);
            num2 = numAleatorios.nextInt(6);
            cont = repartir(PiedrasJ, piedrasRepartidas, num1, num2, cont);
        }

        cont = 0;
        //Piedras de la Máquina
        while (cont < 7) {
            num1 = numAleatorios.nextInt(6);
            num2 = numAleatorios.nextInt(6);
            cont = repartir(PiedrasM, piedrasRepartidas, num1, num2, cont);
        }


        cont = 0;
        //Piedras del Pozo
        while (cont < 14) {
            num1 = numAleatorios.nextInt(6);
            num2 = numAleatorios.nextInt(6);
            cont = repartir(Pozo, piedrasRepartidas, num1, num2, cont);
        }
        System.out.println("Lista del Jugador");
        PiedrasJ.imprimirListaPiedras();

        System.out.println("Lista de la Maquina");
        PiedrasM.imprimirListaPiedras();

        System.out.println("Lista del Pozo");
        Pozo.imprimirListaPiedras();
    }
}
