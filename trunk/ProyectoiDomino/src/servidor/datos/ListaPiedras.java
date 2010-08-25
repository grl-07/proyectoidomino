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

public class ListaPiedras {

    private List<Piedra> laListaPiedras;

    public List<Piedra> getLaListaPiedras() {
        return laListaPiedras;
    }

    public void setLaListaPiedras(List<Piedra> laListaPiedras) {
        this.laListaPiedras = laListaPiedras;
    }

    public Iterator getIterator() {
        return laListaPiedras.iterator();
    }

    //Constructor
    public ListaPiedras() {
        laListaPiedras = new ArrayList();
    }

    public boolean agregarPiedra(Piedra laPiedra) {
        return laListaPiedras.add(laPiedra);
    }

    public boolean eliminarPiedra(Piedra laPiedra) {
        return laListaPiedras.remove(laPiedra);
    }

    public void imprimirListaPiedras() {

        int i;
        Object[] arregloPiedras;
        arregloPiedras = laListaPiedras.toArray();
        Piedra registro;
        //System.out.println("PIEDRAS DEL JUEGO");
        for (i = 0; i < arregloPiedras.length; i++) {
            registro = (Piedra) arregloPiedras[i];
            System.out.println("Piedra " + (i + 1) + ": " + registro.getNum1() + "-" + registro.getNum2());
            /*System.out.println("Arriba: " + registro.getImagenArriba());
            System.out.println("Derecha: " + registro.getImagenDerecha());
            System.out.println("Abajo: " + registro.getImagenAbajo());
            System.out.println("Izquierda: " + registro.getImagenIzquierda());
            System.out.println("ID: " + registro.getID());*/
        }

    }

    public String obtenerPiedras() {

        int i;
        Object[] arregloPiedras;
        arregloPiedras = laListaPiedras.toArray();
        Piedra registro;
        String cadena;
        String cadenaAcum = "";
        String dosPuntos = "";
        for (i = 0; i < arregloPiedras.length; i++) {
            registro = (Piedra) arregloPiedras[i];
            cadena = registro.getID() + "-" + registro.getNum1() + "-" + registro.getNum2()
                    + "-" + registro.getImagenArriba() + "-" + registro.getImagenAbajo()
                    + "-" + registro.getImagenIzquierda()
                    + "-" + registro.getImagenDerecha();
            if (i != 0) {
                dosPuntos = ":";
            }
            cadenaAcum = cadena + dosPuntos + cadenaAcum;

            //System.out.println("CadenaAcum =  " + cadenaAcum);
        }
        return cadenaAcum;

    }

    public Piedra obtenerPiedraPozo() {
        return laListaPiedras.remove(0);
    }

    /*public boolean aprobarPiedra(Piedra laPiedra) {

    boolean encontrado = false;
    Piedra piedraAux = null;

    Iterator iterador = laListaPiedras.iterator();

    while (!encontrado && iterador.hasNext()) {

    piedraAux = (Piedra) iterador.next();

    if (laPiedra.getNum1() == piedraAux.getNum1() && laPiedra.getNum2() == piedraAux.getNum2()) {
    return true;
    }
    }
    return false;
    }*/
    public void elRepartidor(Jugador J, Maquina M, Mesa P) {
        int cont;

        ControlJugadores elJugador = J.getElJugador();
        ListaPiedras PiedrasJ = elJugador.getPiedrasEnMano();

        ControlJugadores laMaquina = M.getLaMaquina();
        ListaPiedras PiedrasM = laMaquina.getPiedrasEnMano();

        ListaPiedras Pozo = P.getElPozo();

        Collections.shuffle(laListaPiedras);  //MEZCLA LAS PIEDRAS DE LA LISTA DE PIEDRAS

        Object[] arregloPiedrasARepartir;    //CONVIERTE LA LISTA DE PIEDRAS EN UN ARREGLO
        arregloPiedrasARepartir = laListaPiedras.toArray();
        Piedra laPiedra;

        cont = 0;
        //Piedras del Jugador
        while (cont < 7) {
            laPiedra = (Piedra) arregloPiedrasARepartir[cont];
            PiedrasJ.agregarPiedra(laPiedra);
            cont++;
        }
        J.getElJugador().setPiedrasEnMano(PiedrasJ);

        //Piedras de la Máquina
        while (cont < 14) {
            laPiedra = (Piedra) arregloPiedrasARepartir[cont];
            PiedrasM.agregarPiedra(laPiedra);
            cont++;
        }
        M.getLaMaquina().setPiedrasEnMano(PiedrasM);

        //Piedras del Pozo
        while (cont < 28) {
            laPiedra = (Piedra) arregloPiedrasARepartir[cont];
            Pozo.agregarPiedra(laPiedra);
            cont++;
        }
        P.setElPozo(Pozo);

        /*System.out.println("PIEDRAS DEL JUGADOR");
        PiedrasJ.imprimirListaPiedras();*/
        System.out.println("PIEDRAS DE LA MÁQUINA");
        PiedrasM.imprimirListaPiedras();
        /*System.out.println("PIEDRAS EN EL POZO");
        Pozo.imprimirListaPiedras();*/
    }




    public Piedra buscarPiedra(int num1, int num2) {
        boolean confirm = false;
        Piedra piedra = null;

        Piedra piedraABuscar = new Piedra(num1,num2);
        Iterator iterador = laListaPiedras.iterator();


        while (confirm != true && iterador.hasNext()) {
            piedra = (Piedra) iterador.next();

            if (piedra.getNum1() == piedraABuscar.getNum1() && piedra.getNum2() == piedraABuscar.getNum2()) {
                return piedra;
            }
        }
        return piedra;
    }


/*public String obtenerCadenaPiedra(Piedra laPiedra) {
        String cadena = "";

        cadena = laPiedra.getNum1() + "-" + laPiedra.getNum2()
                + ":" + laPiedra.getPosicion()
                + ":" + laPiedra.getImagenArriba() + "-" + laPiedra.getImagenAbajo()
                + "-" + laPiedra.getImagenIzquierda() + "-" + laPiedra.getImagenDerecha()
                + ":" + laPiedra.getImagenActual();

        return cadena;
    }*/
}
