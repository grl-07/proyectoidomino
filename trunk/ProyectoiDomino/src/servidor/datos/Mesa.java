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
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra},
            {laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra, laPiedra}
        };
        //this.matrizPiedrasMesa = matriz;
        return matriz;

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

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 10; j++) {
                if (matriz[i][j] == null) {
                    confirm = true;
                } else return false;
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

    public Piedra validarJugada(String piedra, String posicion, ListaPiedras laListaPiedras, Piedra[][] piedrasMesa) {

        boolean confirm = false;
        int num0;
        int num1;
        int ext0, ext1;
        Piedra laPiedra;

        String[] subArg = piedra.split("-");
        num0 = Integer.parseInt(subArg[0]);
        num1 = Integer.parseInt(subArg[1]);

        laPiedra = laListaPiedras.buscarPiedra(num0, num1);
        laPiedra.setPosicion(posicion);

        confirm = matrizVacia(piedrasMesa);
        if (confirm == true) { //si el arreglo está vacío
        //insertar la piedra en la lista extremos en posicion 0 y 1
            System.out.println("MATRIZ VACIA::::: " + confirm);
            laPiedra.setExtremo(num0);
            listaDeExtremos.add(0, laPiedra);
            laPiedra.setExtremo(num1);
            listaDeExtremos.add(1, laPiedra);
            piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);

            return (laPiedra);
        }

        ext0 = obtenerExtremo0();
        ext1 = obtenerExtremo1();

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
                return (laPiedra);
            }
        }
        return null;
    }


    /*public String ponerPiedraEnMesaMaquina(Piedra extremoActual, Piedra laPiedra, Piedra[][] matrizMesa) {
        System.out.println("Extremo donde voy a insertar: " + extremoActual.getNum1() + "-" + extremoActual.getNum2());
        System.out.println("piedra a insertar: " + laPiedra.getNum1() + "-" + laPiedra.getNum2());

        int i, j, iAux, jAux, iAux2, jAux2;
        String PosicionInsertada = "";
        //if (matrizMesa != null) {
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 10; j++) {
                iAux = iAux2 = i;
                jAux = jAux2 = j;
                if (matrizMesa[i][j] != null) {
                    if (matrizMesa[i][j].getNum1() == extremoActual.getNum1() && matrizMesa[i][j].getNum2() == extremoActual.getNum2()) {
                        iAux--;
                        jAux--;
                        iAux2++;
                        jAux2++;
                        if (iAux > -1) {
                            if (matrizMesa[iAux][j] == null) {
                                matrizMesa[iAux][j] = laPiedra;
                                PosicionInsertada = iAux + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux > -1) {
                            if (matrizMesa[i][jAux] == null) {
                                matrizMesa[i][jAux] = laPiedra;
                                PosicionInsertada = i + "-" + jAux;
                                return PosicionInsertada;
                            }
                        }

                        if (iAux2 < 6) {
                            if (matrizMesa[iAux][j] == null) {
                                matrizMesa[iAux][j] = laPiedra;
                                PosicionInsertada = iAux + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux2 < 6) {
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

        //}
        return PosicionInsertada;
    }



    public String realizarJugadaMaquina(ListaPiedras listaPiedrasMaquina) {
        String cadena = "";
        Piedra laPiedra = null;
        Iterator iterador = listaPiedrasMaquina.getIterator();
        int ext1, ext2; //los dos extremos de la mesa
        //boolean confirm = false;
        ext1 = obtenerExtremo0();
        ext2 = obtenerExtremo1();
        String posicion = ""; //posicion en la que es insertada la piedra en la matriz.
        boolean piedraPuesta = false;

        while (!piedraPuesta && iterador.hasNext()) {
            laPiedra = (Piedra) iterador.next();

            if (laPiedra.getNum1() == ext1) {
                posicion = ponerPiedraEnMesaMaquina(listaDeExtremos.get(0), laPiedra);
                laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum2() == ext1) {
                posicion = ponerPiedraEnMesaMaquina(listaDeExtremos.get(0), laPiedra);
                laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum1() == ext2) {
                posicion = ponerPiedraEnMesaMaquina(listaDeExtremos.get(1), laPiedra);
                laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum2() == ext2) {
                posicion = ponerPiedraEnMesaMaquina(listaDeExtremos.get(1), laPiedra);
                laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            }

        }

        laPiedra.setPosicion(posicion);
        cadena = new ListaPiedras().obtenerCadenaPiedra(laPiedra);
        return cadena;
    }*/


}
