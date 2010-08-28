/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

import servidor.logica.Datos;
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
    private List<Piedra> listaDeExtremos;
    //private Set<Mesa> lasPiedrasMesa;
    private Piedra matrizPiedrasMesa[][]; //las verdaderas piedras de la mesa.

    public Piedra[][] getMatrizPiedrasMesa() {
        return matrizPiedrasMesa;
    }

    public void setMatrizPiedrasMesa(Piedra[][] matrizPiedrasMesa) {
        this.matrizPiedrasMesa = matrizPiedrasMesa;
    }

    public List<Piedra> getListaDeExtremos() {
        return listaDeExtremos;
    }

    public void setListaDeExtremos(List<Piedra> listaDeExtremos) {
        this.listaDeExtremos = listaDeExtremos;
    }

    /*public Set<Mesa> getLasPiedrasMesa() {
    return lasPiedrasMesa;
    }

    public void setLasPiedrasMesa(Set<Mesa> lasPiedrasMesa) {
    this.lasPiedrasMesa = lasPiedrasMesa;
    }*/
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
        this.listaDeExtremos = new ArrayList();
    }

    public Mesa(ListaPiedras elPozo, int extremo1, int extremo2, Piedra[][] matrizPiedrasMesa) {
        this.elPozo = elPozo;
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
        this.matrizPiedrasMesa = matrizPiedrasMesa;
        this.listaDeExtremos = new ArrayList();
    }

    public Mesa(int extremo1, int extremo2) {
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
        this.listaDeExtremos = new ArrayList();
    }

    public Piedra[][] inicializarMatrizPiedras() {

        Piedra laPiedra = null;
        Piedra matriz[][] = {
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra,}
        };
        //this.matrizPiedrasMesa = matriz;
        return matriz;

    }

    public ListaPiedras pasarMatrizPiedrasMesaALista(Piedra matriz[][]) {
        int i, j;
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 10; j++) {
                if (matriz[i][j] != null) {
                    //System.out.print(matriz[i][j].getPosicion()+",");
                    Piedra laPiedra = (Piedra) matriz[i][j];
                    PiedrasMesa.agregarPiedra(laPiedra);
                }
            }

        }
        return PiedrasMesa;
    }

    private Piedra[][] ponerPiedraEnMesaJugador(Piedra laPiedra, String posicion, Piedra[][] matriz) {
        String[] subArg = posicion.split("-");
        int posX = Integer.parseInt(subArg[0]);
        int posY = Integer.parseInt(subArg[1]);
        matriz[posX][posY] = laPiedra;

        return matriz;

    }

    private boolean matrizVacia(Piedra matriz[][]) {
        int i, j;
        boolean confirm = false;

        for (i = 0; i < 7; i++) {
            for (j = 0; j < 10; j++) {
                if (matriz[i][j] == null) {
                    confirm = true;
                } else {
                    return false;
                }
            }
        }
        return confirm;
    }

    public int obtenerExtremo0() {
        int ext0 = listaDeExtremos.get(0).getExtremo();
        return ext0;
    }

    public int obtenerExtremo1() {
        int ext1 = listaDeExtremos.get(1).getExtremo();
        return ext1;
    }

    private Piedra asignarImagenActual(Piedra laPiedra, String posicion, Piedra[][] piedrasMesa) {

        String subArgPosicion[] = posicion.split("-");
        int i, j, iAux, jAux, iAux2, jAux2;

        //Coordenadas de la posicion a insertar.
        i = Integer.parseInt(subArgPosicion[0]);

        j = Integer.parseInt(subArgPosicion[1]);

        iAux = iAux2 = i;
        jAux = jAux2 = j;

        iAux--;
        jAux--;
        iAux2++;
        jAux2++;

        if (jAux > -1 && piedrasMesa[i][jAux] != null) {
            System.out.println("ENTRO EN EL IF DE LA IZQUIERDA");
            System.out.println(laPiedra.getNum1() + "-" + laPiedra.getNum2());
            /*if ((laPiedra.getNum1() == laPiedra.getNum2()) && (laPiedra.getNum1() == piedrasMesa[i][jAux].getNum1() || laPiedra.getNum1() == piedrasMesa[i][jAux].getNum2())){
            System.out.println("ENTRO EN EL IF DEL DOBLE");
            laPiedra.setImagenActual(laPiedra.getImagenAbajo());
            return laPiedra;
            }*/

            if (laPiedra.getNum1() == piedrasMesa[i][jAux].getNum1() || laPiedra.getNum1() == piedrasMesa[i][jAux].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenIzquierda());
                return laPiedra;
            }
            if (laPiedra.getNum2() == piedrasMesa[i][jAux].getNum1() || laPiedra.getNum2() == piedrasMesa[i][jAux].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenDerecha());
                return laPiedra;
            }
        }

        if (iAux > -1 && piedrasMesa[iAux][j] != null) {
            System.out.println("ENTRO EN EL IF DE ARRIBA");
            System.out.println(laPiedra.getNum1() + "-" + laPiedra.getNum2());
            /*if ((laPiedra.getNum1() == laPiedra.getNum2()) && laPiedra.getNum1() == piedrasMesa[iAux][j].getNum1() || laPiedra.getNum1() == piedrasMesa[iAux][j].getNum2()){
            System.out.println("ENTRO EN EL IF DEL DOBLE");
            laPiedra.setImagenActual(laPiedra.getImagenDerecha());
            return laPiedra;
            }*/

            if (laPiedra.getNum1() == piedrasMesa[iAux][j].getNum1() || laPiedra.getNum1() == piedrasMesa[iAux][j].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenArriba());
                return laPiedra;
            }
            if (laPiedra.getNum2() == piedrasMesa[iAux][j].getNum1() || laPiedra.getNum2() == piedrasMesa[iAux][j].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenAbajo());
                return laPiedra;
            }
        }

        if (jAux2 < 10 && piedrasMesa[i][jAux2] != null) {
            System.out.println("ENTRO EN EL IF DE LA DERECHA");
            System.out.println(laPiedra.getNum1() + "-" + laPiedra.getNum2());
            /*if ((laPiedra.getNum1() == laPiedra.getNum2()) && laPiedra.getNum1() == piedrasMesa[i][jAux2].getNum1() || laPiedra.getNum1() == piedrasMesa[i][jAux2].getNum2()){
            System.out.println("ENTRO EN EL IF DEL DOBLE");
            laPiedra.setImagenActual(laPiedra.getImagenAbajo());
            return laPiedra;
            }*/

            if (laPiedra.getNum1() == piedrasMesa[i][jAux2].getNum1() || laPiedra.getNum1() == piedrasMesa[i][jAux2].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenDerecha());
                return laPiedra;
            }
            if (laPiedra.getNum2() == piedrasMesa[i][jAux2].getNum1() || laPiedra.getNum2() == piedrasMesa[i][jAux2].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenIzquierda());
                return laPiedra;
            }
        }

        if (iAux2 < 7 && piedrasMesa[iAux2][j] != null) {
            System.out.println("ENTRO EN EL IF DE ABAJO");
            System.out.println(laPiedra.getNum1() + "-" + laPiedra.getNum2());
            /*if ((laPiedra.getNum1() == laPiedra.getNum2()) && laPiedra.getNum1() == piedrasMesa[iAux2][j].getNum1() || laPiedra.getNum1() == piedrasMesa[iAux2][j].getNum2()){
            System.out.println("ENTRO EN EL IF DEL DOBLE");
            laPiedra.setImagenActual(laPiedra.getImagenDerecha());
            return laPiedra;
            }*/

            if (laPiedra.getNum1() == piedrasMesa[iAux2][j].getNum1() || laPiedra.getNum1() == piedrasMesa[iAux2][j].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenAbajo());
                return laPiedra;
            }
            if (laPiedra.getNum2() == piedrasMesa[iAux2][j].getNum1() || laPiedra.getNum2() == piedrasMesa[iAux2][j].getNum2()) {
                laPiedra.setImagenActual(laPiedra.getImagenArriba());
                return laPiedra;
            }
        }
        return laPiedra;
    }

    public boolean validarPosicion(String posicion, String posicionAComparar) {
        boolean confirm = false;

        String[] subArg = posicion.split("-");
        int posXposicion = Integer.parseInt(subArg[0]);
        int posYposicion = Integer.parseInt(subArg[1]);

        String[] subArg2 = posicionAComparar.split("-");
        int posXposicionAComparar = Integer.parseInt(subArg2[0]);
        int posYposicionAComparar = Integer.parseInt(subArg2[1]);

        if ((posXposicionAComparar == posXposicion && posYposicionAComparar == posYposicion - 1)
                || (posXposicionAComparar == posXposicion && posYposicionAComparar == posYposicion + 1)
                || (posXposicionAComparar == posXposicion - 1 && posYposicionAComparar == posYposicion)
                || (posXposicionAComparar == posXposicion + 1 && posYposicionAComparar == posYposicion)) {
            confirm = true;
        }
        return confirm;

    }

    public Piedra validarJugada(String nickname, String piedra, String posicion, String imagenActual, ListaPiedras laListaPiedras, Piedra[][] piedrasMesa, ListaPiedras listaPiedrasJugador) {

        System.out.println("JUGADOR");
        boolean confirm = false;
        int num0;
        int num1;
        int ext0, ext1;
        Piedra laPiedra;

        String[] subArg = piedra.split("-");
        num0 = Integer.parseInt(subArg[0]);
        num1 = Integer.parseInt(subArg[1]);
        System.out.println("piedra: " + num0 + "-" + num1);

        laPiedra = laListaPiedras.buscarPiedra(num0, num1);
        laPiedra.setPosicion(posicion);
        laPiedra.setImagenActual(imagenActual);
        System.out.println("IMAGEN ACTUAL::::::::::" + laPiedra.getImagenActual());

        confirm = matrizVacia(piedrasMesa);
        if (confirm == true) { //si el arreglo está vacío
            //insertar la piedra en la lista extremos en posicion 0 y 1
            System.out.println("MATRIZ VACIA::::: " + confirm);
            listaDeExtremos.add(new Piedra(num0, num1, laPiedra.getImagenActual(), num0, posicion));
            listaDeExtremos.add(new Piedra(num0, num1, laPiedra.getImagenActual(), num1, posicion));
            piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
            //Elimino la piedra de la lista piedras en mano
            Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
            return (laPiedra);
        }

        ext0 = obtenerExtremo0();
        ext1 = obtenerExtremo1();

        System.out.println("extremo 1= " + ext0);
        System.out.println("extremo 2= " + ext1);

        if (num0 == ext0) {
            //confirmar posicion
            confirm = validarPosicion(listaDeExtremos.get(0).getPosicion(), posicion);
            //si confirma entonces
            System.out.println("CONFIRM 1 VALE::::: " + confirm);
            if (confirm == true) {
                //insertar la piedra en la lista extremos en posicion 0 y 1
                laPiedra.setExtremo(num1);
                listaDeExtremos.set(0, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                //Elimino la piedra de la lista piedras en mano
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }

        if (num0 == ext1) {
            //confirmar posicion
            confirm = validarPosicion(listaDeExtremos.get(1).getPosicion(), posicion);
            //si confirma entonces
            System.out.println("CONFIRM 2 VALE::::: " + confirm);
            if (confirm == true) {
                //buscar piedra e insertarla en el extremo 1, con nuevo extremo num1
                laPiedra.setExtremo(num1);
                listaDeExtremos.set(1, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                //Elimino la piedra de la lista piedras en mano
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }

        if (num1 == ext0) {
            //confirmar posicion
            confirm = validarPosicion(listaDeExtremos.get(0).getPosicion(), posicion);
            //si confirma entonces
            System.out.println("CONFIRM 3 VALE::::: " + confirm);
            if (confirm == true) {
                //insertarla en el extremo 0, con nuevo extremo num0
                laPiedra.setExtremo(num0);
                listaDeExtremos.set(0, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                //Elimino la piedra de la lista piedras en mano
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }

        if (num1 == ext1) {
            //confirmar posicion
            confirm = validarPosicion(listaDeExtremos.get(1).getPosicion(), posicion);
            //si confirma entonces
            System.out.println("CONFIRM 4 VALE::::: " + confirm);
            if (confirm == true) {
                //insertarla en el extremo 1, con nuevo extremo num0
                laPiedra.setExtremo(num0);
                listaDeExtremos.set(1, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                //Elimino la piedra de la lista piedras en mano
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }
        System.out.println("nuevo extremo 1 = " + this.obtenerExtremo0());
        System.out.println("nuevo extremo 2 = " + this.obtenerExtremo1());
        return null;
    }

    public String ponerPiedraExtremo0Maquina(Piedra extremoActual, Piedra laPiedra, Piedra[][] matrizMesa, int numeroExtremo) {
        System.out.println("Extremo donde voy a insertar: " + extremoActual.getNum1() + "-" + extremoActual.getNum2());
        System.out.println("piedra a insertar: " + laPiedra.getNum1() + "-" + laPiedra.getNum2());

        int i, j, iAux, jAux, iAux2, jAux2;
        String PosicionInsertada = "";
        //if (matrizMesa != null) {
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 10; j++) {
                iAux = iAux2 = i;
                jAux = jAux2 = j;
                if (matrizMesa[i][j] != null) {
                    if (matrizMesa[i][j].getNum1() == extremoActual.getNum1() && matrizMesa[i][j].getNum2() == extremoActual.getNum2()) {
                        iAux--;
                        jAux--;
                        iAux2++;
                        jAux2++;


                        if (iAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("ENTRO EN IF 1");
                            if (matrizMesa[iAux][j] == null) {
                                matrizMesa[iAux][j] = laPiedra;
                                PosicionInsertada = iAux + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("ENTRO EN IF 2");
                            if (matrizMesa[i][jAux] == null) {
                                matrizMesa[i][jAux] = laPiedra;
                                PosicionInsertada = i + "-" + jAux;
                                return PosicionInsertada;
                            }
                        }

                        if (iAux2 < 7 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("ENTRO EN IF 3");
                            if (matrizMesa[iAux2][j] == null) {
                                matrizMesa[iAux2][j] = laPiedra;
                                PosicionInsertada = iAux2 + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux2 < 11 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("ENTRO EN IF 4");
                            if (matrizMesa[i][jAux2] == null) {
                                matrizMesa[i][jAux2] = laPiedra;
                                PosicionInsertada = i + "-" + jAux2;
                                return PosicionInsertada;
                            }
                        }
                    }
                }
            }
        }
        //};
        return PosicionInsertada;
    }

    public String ponerPiedraExtremo1Maquina(Piedra extremoActual, Piedra laPiedra, Piedra[][] matrizMesa, int numeroExtremo) {
        int i, j, iAux, jAux, iAux2, jAux2;
        String PosicionInsertada = "";
        //if (matrizMesa != null) {
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 10; j++) {
                iAux = iAux2 = i;
                jAux = jAux2 = j;
                if (matrizMesa[i][j] != null) {
                    if (matrizMesa[i][j].getNum1() == extremoActual.getNum1() && matrizMesa[i][j].getNum2() == extremoActual.getNum2()) {
                        iAux--;
                        jAux--;
                        iAux2++;
                        jAux2++;

                        if (iAux2 < 7 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {

                            if (matrizMesa[iAux2][j] == null) {
                                System.out.println("ABAJO NO SE SALE DE LA MATRIZ");
                                matrizMesa[iAux2][j] = laPiedra;
                                PosicionInsertada = iAux2 + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux2 < 10 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("A LA DERECHA NO SE SALE DE LA MATRIZ");
                            if (matrizMesa[i][jAux2] == null) {
                                matrizMesa[i][jAux2] = laPiedra;
                                PosicionInsertada = i + "-" + jAux2;
                                return PosicionInsertada;
                            }
                        }

                        if (iAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("ARRIBA NO SE SALE DE LA MATRIZ");
                            if (matrizMesa[iAux][j] == null) {
                                matrizMesa[iAux][j] = laPiedra;
                                PosicionInsertada = iAux + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            System.out.println("A LA IZQUIERDA NO SE SALE DE LA MATRIZ");
                            if (matrizMesa[i][jAux] == null) {
                                matrizMesa[i][jAux] = laPiedra;
                                PosicionInsertada = i + "-" + jAux;
                                return PosicionInsertada;
                            }
                        }
                    }
                }
            }
        }
        //};
        return PosicionInsertada;
    }

    public String realizarJugadaMaquina(ListaPiedras listaPiedrasMaquina, Piedra[][] piedrasMesa, ListaPiedras listaPiedrasPozo) {

        System.out.println("\nMAQUINA");
        String cadena = "";
        String posicion = ""; //posicion en la que es insertada la piedra en la matriz.
        Piedra laPiedra = null;
        Piedra piedraPozo = null;
        int ext1, ext2, numeroPiedrasMaquina; //los dos extremos de la mesa
        int contPiedrasMaquina = 0;
        boolean piedraPuesta = false;
        matrizPiedrasMesa = piedrasMesa;

        Iterator iterador = listaPiedrasMaquina.getIterator();
        numeroPiedrasMaquina = listaPiedrasMaquina.getLaListaPiedras().size();

        ext1 = obtenerExtremo0();
        ext2 = obtenerExtremo1();

        System.out.println("extremo1 = " + ext1);
        System.out.println("extremo2 = " + ext2);

        while (!piedraPuesta && iterador.hasNext()) {
            laPiedra = (Piedra) iterador.next();

            if (laPiedra.getNum1() == ext1) {
                /*laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(0, laPiedra);*/
                posicion = ponerPiedraExtremo0Maquina(listaDeExtremos.get(0), laPiedra, piedrasMesa, listaDeExtremos.get(0).getExtremo());
                System.out.println("posicion: " + posicion);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum2() == ext1) {
                /*laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(0, laPiedra);*/
                posicion = ponerPiedraExtremo0Maquina(listaDeExtremos.get(0), laPiedra, piedrasMesa, listaDeExtremos.get(0).getExtremo());
                System.out.println("posicion: " + posicion);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum1() == ext2) {
                /*laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(1, laPiedra);*/
                posicion = ponerPiedraExtremo1Maquina(listaDeExtremos.get(1), laPiedra, piedrasMesa, listaDeExtremos.get(1).getExtremo());
                System.out.println("posicion: " + posicion);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(1, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum2() == ext2) {
                /*laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(1, laPiedra);*/
                posicion = ponerPiedraExtremo1Maquina(listaDeExtremos.get(1), laPiedra, piedrasMesa, listaDeExtremos.get(1).getExtremo());
                System.out.println("posicion: " + posicion);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(1, laPiedra);
                piedraPuesta = true;
            } else {
                contPiedrasMaquina++;
            }


            if (contPiedrasMaquina == numeroPiedrasMaquina && !piedraPuesta && !listaPiedrasPozo.getLaListaPiedras().isEmpty()) {
                piedraPozo = listaPiedrasPozo.obtenerPiedraPozo();
                System.out.println("Piedra a insertar del Pozo: " + piedraPozo.getNum1() + "-" + piedraPozo.getNum2());
                listaPiedrasMaquina.agregarPiedra(piedraPozo);
                iterador = listaPiedrasMaquina.getIterator();
                numeroPiedrasMaquina = listaPiedrasMaquina.getLaListaPiedras().size();
                contPiedrasMaquina = 0;
            }

        }

        if (piedraPuesta) {
            listaPiedrasMaquina.eliminarPiedra(laPiedra);
        }

        /*if (listaPiedrasMaquina.getLaListaPiedras().isEmpty()){

        }*/

        /*if (listaPiedrasMaquina == null) {
        return cadena;
        }*/

        System.out.println("nuevo extremo 1 = " + this.obtenerExtremo0());
        System.out.println("nuevo extremo 2 = " + this.obtenerExtremo1());
        System.out.println("numero de Piedras en Mano: " + listaPiedrasMaquina.getLaListaPiedras().size());

        laPiedra.setPosicion(posicion);
        cadena = laPiedra.obtenerCadenaPiedraMaquina();
        System.out.println("PIEDRA A JUGAR DE LA MAQUINA: " + cadena);
        return cadena;
    }
}
