package servidor.datos;

import java.util.*;

public class ListaPiedras {

    private List<Piedra> laListaPiedras;

    /**
     * obtiene una lista de piedras.
     * @return retorna un tipo List.
     */
    public List<Piedra> getLaListaPiedras() {
        return laListaPiedras;
    }

    /**
     * setea una lista de piedras.
     * @param laListaPiedras la lista que se le asignará al atributo local.
     */
    public void setLaListaPiedras(List<Piedra> laListaPiedras) {
        this.laListaPiedras = laListaPiedras;
    }

    /**
     * obtiene el iterador de la lista.
     * @return un iterador, tipo Iterator.
     */
    public Iterator getIterator() {
        return laListaPiedras.iterator();
    }

    /**
     * Constructor
     */
    public ListaPiedras() {
        laListaPiedras = new ArrayList();
    }

    /**
     * agrega una piedra dentro de una lista de piedras.
     * @param laPiedra - piedra que será insertada en la lista.
     * @return true
     */
    public boolean agregarPiedra(Piedra laPiedra) {
        return laListaPiedras.add(laPiedra);
    }

    /**
     * elimina una piedra de una lista de piedras.
     * @param laPiedra - piedra que será eliminada de la lista.
     * @return true
     */
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

    /**
     * se utiliza para obtener una cadena de 1 o más piedras con todos sus datos.
     * @return String de la cadena de piedras.
     */
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

    /**
     * remueve una piedra de una lista de piedras y la devuelve.
     * @return la piedra que fue removida.
     */
    public Piedra obtenerPiedraPozo() {
        return laListaPiedras.remove(0);
    }

    /**
     * se encarga de repartir las 7 piedras al jugador, a la máquina, y las 14 piedras restantes al pozo.
     * @param J el jugador1, representado por el usuario.
     * @param M el jugador2, representado por la máquina.
     * @param P la mesa, de donde posteriormente se extraerá el pozo para repartirle las piedras.
     */
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

    /**
     * busca una piedra (dados los dos numeros que la componen) en una lista de piedras, y la devuelve.
     * @param num1 el numero 1 de la piedra a buscar.
     * @param num2 el numero 2 de la piedra a buscar.
     * @return la piedra, si fue encontrada, si no, retorna null.
     */
    public Piedra buscarPiedra(int num1, int num2) {
        boolean confirm = false;
        Piedra piedra = null;

        Piedra piedraABuscar = new Piedra(num1, num2);
        Iterator iterador = laListaPiedras.iterator();


        while (confirm != true && iterador.hasNext()) {
            piedra = (Piedra) iterador.next();

            if (piedra.getNum1() == piedraABuscar.getNum1() && piedra.getNum2() == piedraABuscar.getNum2()) {
                return piedra;
            }
        }
        return piedra;
    }
}