/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

/**
 *
 * @author Alberly
 */

import java.util.*;
public class Mesa {

    private ListaPiedras elPozo;
    private int extremo1;
    private int extremo2;
    private ListaPiedras PiedrasMesa;


       private Set<Mesa> lasPiedrasMesa;

    public Set<Mesa> getLasPiedrasMesa() {
        return lasPiedrasMesa;
    }

    public void setLasPiedrasMesa(Set<Mesa> lasPiedrasMesa) {
        this.lasPiedrasMesa = lasPiedrasMesa;
    }






    public ListaPiedras getPiedrasMesa() {
        return PiedrasMesa;
    }

    public void setPiedrasMesa(ListaPiedras PiedrasMesa) {
        this.PiedrasMesa = PiedrasMesa;
    }

    public ListaPiedras getElPozo() {
        return elPozo;
    }

    public void setElPozo(ListaPiedras elPozo) {
        this.elPozo = elPozo;
    }

    public int getExtremo1() {
        return extremo1;
    }

    public void setExtremo1(int extremo1) {
        this.extremo1 = extremo1;
    }

    public int getExtremo2() {
        return extremo2;
    }

    public void setExtremo2(int extremo2) {
        this.extremo2 = extremo2;
    }

    //Constructor
    public Mesa() {
        elPozo = new ListaPiedras();
        PiedrasMesa = new ListaPiedras();
    }

    /*public void finalize() throws Throwable {

    }*/
    /**
     *
     * @param laPiedra
     */


   /* public boolean aprobarPiedra(Piedra laPiedra) {

        boolean encontrado = false;
        Piedra auxiliar = null;*/




        //PiedrasMesa = new ListaPiedras();

        //piedrasMesa = new ListaPiedras();

        /*
         * Se define un iterador inicializado con el iterador de la colecciÃ³n
         */
        //Iterator iterador = lasPiedrasMesa.iterator();

        /*
         * Mientras no se encuentre el elemento y existan mas elementos en la
         * colecciÃ³n, se sigue entrando en el ciclo
         */
        /*while (!encontrado && iterador.hasNext())
        {*/
            /*
             *  Se obtiene el siguiente objeto del iterador y se le hace un cast
             *  para asignarlo al objeto de tipo Nodo
             */
           // auxiliar = (Piedra) iterador.next();

            /*
             * Se invoca al mÃ©todo equals de la clase Nodo para determinar si son
             * iguales. En caso de serlo, se encontrÃ³ el elemento buscado
             */
            /*if (laPiedra.equals(auxiliar))
                encontrado = true;


        }
        return encontrado;

    }*/
}

