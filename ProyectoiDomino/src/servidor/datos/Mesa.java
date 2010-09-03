package servidor.datos;
import servidor.logica.Datos;
import java.util.*;

public class Mesa {

    private ListaPiedras elPozo;
    private int extremo1;
    private int extremo2;
    private ListaPiedras PiedrasMesa;
    private List<Piedra> listaDeExtremos;
    private Piedra matrizPiedrasMesa[][];

    /**
     * getMatrizPiedrasMesa para obtener la matriz que contiene las piedras de la mesa
     * @return Piedra[][] la matriz con las piedras de la mesa
     */
    public Piedra[][] getMatrizPiedrasMesa() {
        return matrizPiedrasMesa;
    }

    /**
     * setMatrizPiedrasMesa para setear la matriz que contiene las piedras de la mesa
     * @param matrizPiedrasMesa
     */
    public void setMatrizPiedrasMesa(Piedra[][] matrizPiedrasMesa) {
        this.matrizPiedrasMesa = matrizPiedrasMesa;
    }

    /**
     * getListaDeExtremos para obtener la lista de extremos que contiene las piedras que se encuentran en el extremo en la mesa
     * @return List con objetos tipo piedra
     */
    public List<Piedra> getListaDeExtremos() {
        return listaDeExtremos;
    }

    /**
     * setListaDeExtremos para setear la lista que contiene los extremos de la mesa
     * @param listaDeExtremos Coleccion tipo List formada por objetos tipo Piedra
     */
    public void setListaDeExtremos(List<Piedra> listaDeExtremos) {
        this.listaDeExtremos = listaDeExtremos;
    }

    /**
     * getPiedrasMesa para obtener las piedras que están en la mesa
     * @return una lista de piedras de la mesa
     */
    public ListaPiedras getPiedrasMesa() {
        return PiedrasMesa;
    }

    /**
     * setPiedrasMesa para setear las piedras de la mesa en la lista de piedras
     * @param PiedrasMesa tipo ListaPiedras,
     */
    public void setPiedrasMesa(ListaPiedras PiedrasMesa) {
        this.PiedrasMesa = PiedrasMesa;
    }

    /**
     * getElPozo para obtener la lista de piedras del pozo
     * @return la lista de piedras del pozo
     */
    public ListaPiedras getElPozo() {
        return elPozo;
    }

    /**
     * setElPozo para setear la lista de piedras del pozo
     * @param elPozo la lista de piedras del pozo
     */
    public void setElPozo(ListaPiedras elPozo) {
        this.elPozo = elPozo;
    }

    /**
     * getExtremo1 para obtener uno de los extremos de la mesa
     * @return un entero que es uno de los extremos de la mesa
     */
    public int getExtremo1() {
        return extremo1;
    }

    /**
     * setExtremo1 para setear un número como extremo de la mesa
     * @param extremo1 un entero que es uno de los extremos de la mesa
     */
    public void setExtremo1(int extremo1) {
        this.extremo1 = extremo1;
    }

    /**
     * getExtremo2 para obtener el otro extremo de la mesa
     * @return un entero que es otro de los extremos de la mesa
     */
    public int getExtremo2() {
        return extremo2;
    }

    /**
     * setExtremo2 para setear un número como extremo de la mesa
     * @param extremo2 un entero que es otro de los extremos de la mesa
     */
    public void setExtremo2(int extremo2) {
        this.extremo2 = extremo2;
    }

    /**
     * Constructor
     */
    public Mesa() {
        elPozo = new ListaPiedras();
        PiedrasMesa = new ListaPiedras();
        this.listaDeExtremos = new ArrayList();
    }

    /**
     * Constructor
     * @param elPozo tipo ListaPiedras para asignar la lista de piedras del pozo
     * @param extremo1 tipo entero para asignar uno de los extremos de la mesa
     * @param extremo2 tipo entero para asignar otro de los extremos de la mesa
     * @param matrizPiedrasMesa para asignar la matriz que contiene las piedras de la mesa
     */
    public Mesa(ListaPiedras elPozo, int extremo1, int extremo2, Piedra[][] matrizPiedrasMesa) {
        this.elPozo = elPozo;
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
        this.matrizPiedrasMesa = matrizPiedrasMesa;
        this.listaDeExtremos = new ArrayList();
    }

    /**
     * Constructor
     * @param extremo1 tipo entero para asignar uno de los extremos de la mesa
     * @param extremo2 tipo entero para asignar otro de los extremos de la mesa
     */
    public Mesa(int extremo1, int extremo2) {
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
        this.listaDeExtremos = new ArrayList();
    }

    /**
     * inicializarMatrizPiedras para inicializar la matriz con una piedra null en todas su posiciones
     * @return la matriz inicializada
     */
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
        return matriz;

    }

    /**
     * pasarMatrizPiedrasMesaALista pasa las piedras que están en la matriz de la mesa a una lista de tipo ListPiedras
     * @param matriz la matriz de tipo Piedra que será pasada a la lista de piedras
     * @return la lista con las piedras de la mesa
     */
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

    /**
     * ponerPiedraEnMesaJugador coloca la piedra enviada por el jugador en caso de ser válida en la matriz que contiene las piedras de la mesa
     * @param laPiedra tipo Piedra, la piedra que se va a insertar en la matriz
     * @param posicion tipo String, la posición que ocupará la piedra en la matriz
     * @param matriz tipo Piedra donde se insertará la piedra. Es la matriz de la mesa.
     * @return la matriz que contiene las piedras de la mesa, con la nueva piedra agregada
     */
    private Piedra[][] ponerPiedraEnMesaJugador(Piedra laPiedra, String posicion, Piedra[][] matriz) {
        String[] subArg = posicion.split("-");
        int posX = Integer.parseInt(subArg[0]);
        int posY = Integer.parseInt(subArg[1]);
        matriz[posX][posY] = laPiedra;

        return matriz;

    }

    /**
     * matrizVacia para verificar si la matriz está vacía
     * @param matriz la matriz que se va a verificar
     * @return un boolean, true si está vacía, false en caso contrario
     */
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

    /**
     * obtenerExtremo0 para obtener uno de los extremos de la mesa
     * @return el número extremo de la mesa
     */
    public int obtenerExtremo0() {
        int ext0 = listaDeExtremos.get(0).getExtremo();
        return ext0;
    }

    /**
     * obtenerExtremo1 para obtener el otro de los extremos de la mesa
     * @return el otro número extremo de la mesa
     */
    public int obtenerExtremo1() {
        int ext1 = listaDeExtremos.get(1).getExtremo();
        return ext1;
    }

    /**
     * asignarImagenActual para asignar la imagen actual a una piedra
     * @param laPiedra la piedra a la cual se le va a asignar la imagen actual
     * @param posicion la posicion de la piedra
     * @param piedrasMesa la matriz de las piedras de la mesa
     * @return la piedra con la imagenActual asignada
     */
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
            if ((laPiedra.getNum1() == laPiedra.getNum2()) && (laPiedra.getNum1() == piedrasMesa[i][jAux].getNum1() || laPiedra.getNum1() == piedrasMesa[i][jAux].getNum2()) && jAux - 1 > -1) {                
                laPiedra.setImagenActual(laPiedra.getImagenAbajo());
                return laPiedra;
            }

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
            if ((laPiedra.getNum1() == laPiedra.getNum2()) && (laPiedra.getNum1() == piedrasMesa[iAux][j].getNum1() || laPiedra.getNum1() == piedrasMesa[iAux][j].getNum2()) && iAux - 1 > -1) {
                laPiedra.setImagenActual(laPiedra.getImagenDerecha());
                return laPiedra;
            }

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
            if ((laPiedra.getNum1() == laPiedra.getNum2()) && (laPiedra.getNum1() == piedrasMesa[i][jAux2].getNum1() || laPiedra.getNum1() == piedrasMesa[i][jAux2].getNum2()) && jAux2 + 1 < 10) {
                laPiedra.setImagenActual(laPiedra.getImagenAbajo());
                return laPiedra;
            }

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
            if ((laPiedra.getNum1() == laPiedra.getNum2()) && (laPiedra.getNum1() == piedrasMesa[iAux2][j].getNum1() || laPiedra.getNum1() == piedrasMesa[iAux2][j].getNum2()) && iAux2 + 1 < 7) {
                laPiedra.setImagenActual(laPiedra.getImagenDerecha());
                return laPiedra;
            }

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

    /**
     * validarPosicion para validar que la piedra está siendo puesta pegada al extremo por donde se quiere jugar
     * @param posicion string, la posicion de la piedra extremo
     * @param posicionAComparar string, la posicion de la piedra que se está jugando
     * @return un boolean true si es válida la posición donde el usuario intentó colocar la piedra, false en caso contrario
     */
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

    /**
     * validarJugada para validar si la piedra que quiere jugar el usuario coincide con alguno de los extremos de la mesa de juego
     * @param nickname string con el nickname del usuario
     * @param piedra string, la piedra que se quiere validar
     * @param posicion la posición donde se intenta colocar la piedra
     * @param imagenActual string, imagen actual de la piedra que se intenta jugar
     * @param laListaPiedras para buscar una piedra por sus dos números en esa lista y obtener toda la información de esa piedra
     * @param piedrasMesa matriz con las piedras de la mesa
     * @param listaPiedrasJugador Lista con las piedras del Jugador
     * @return si la piedra es válida para jugarla la retorna, en caso contrario retorna null
     */
    public Piedra validarJugada(String nickname, String piedra, String posicion, String imagenActual, ListaPiedras laListaPiedras, Piedra[][] piedrasMesa, ListaPiedras listaPiedrasJugador) {

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
        laPiedra.setImagenActual(imagenActual);
        
        confirm = matrizVacia(piedrasMesa);
        if (confirm == true) { //si el arreglo está vacío
   
            listaDeExtremos.add(new Piedra(num0, num1, laPiedra.getImagenActual(), num0, posicion));
            listaDeExtremos.add(new Piedra(num0, num1, laPiedra.getImagenActual(), num1, posicion));
            piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);

            Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
            return (laPiedra);
        }

        ext0 = obtenerExtremo0();
        ext1 = obtenerExtremo1();

        if (num0 == ext0) {
            confirm = validarPosicion(listaDeExtremos.get(0).getPosicion(), posicion);
  
  
            if (confirm == true) {
                laPiedra.setExtremo(num1);
                listaDeExtremos.set(0, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }

        if (num0 == ext1) {
            confirm = validarPosicion(listaDeExtremos.get(1).getPosicion(), posicion);
            
            if (confirm == true) {
                laPiedra.setExtremo(num1);
                listaDeExtremos.set(1, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }

        if (num1 == ext0) {
            confirm = validarPosicion(listaDeExtremos.get(0).getPosicion(), posicion);
          
            if (confirm == true) {
                laPiedra.setExtremo(num0);
                listaDeExtremos.set(0, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
          
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }

        if (num1 == ext1) {
            confirm = validarPosicion(listaDeExtremos.get(1).getPosicion(), posicion);
         
            if (confirm == true) {
                laPiedra.setExtremo(num0);
                listaDeExtremos.set(1, laPiedra);
                piedrasMesa = ponerPiedraEnMesaJugador(laPiedra, posicion, piedrasMesa);
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
            
                Datos.obtenerPartidaExistente(nickname).getElJuego().getJugador1().getElJugador().getPiedrasEnMano().eliminarPiedra(laPiedra);
                return (laPiedra);
            }
        }
        
        return null;
    }

    /**
     * ponerPiedraExtremo0Maquina colocar la piedra a jugar de la máquina en el extremo 0 de la mesa
     * @param extremoActual la piedra extremo actual de la mesa
     * @param laPiedra la piedra que se va a colocar
     * @param matrizMesa la matriz que contiene las piedras de la mesa
     * @param numeroExtremo el número extremo de la mesa
     * @return un string con la posición donde fue insertada la piedra
     */
    public String ponerPiedraExtremo0Maquina(Piedra extremoActual, Piedra laPiedra, Piedra[][] matrizMesa, int numeroExtremo) {
        
        int i, j, iAux, jAux, iAux2, jAux2;
        String PosicionInsertada = "";
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
                            
                            if (matrizMesa[iAux][j] == null) {
                                matrizMesa[iAux][j] = laPiedra;
                                PosicionInsertada = iAux + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            
                            if (matrizMesa[i][jAux] == null) {
                                matrizMesa[i][jAux] = laPiedra;
                                PosicionInsertada = i + "-" + jAux;
                                return PosicionInsertada;
                            }
                        }

                        if (iAux2 < 7 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            
                            if (matrizMesa[iAux2][j] == null) {
                                matrizMesa[iAux2][j] = laPiedra;
                                PosicionInsertada = iAux2 + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux2 < 11 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
                            
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
       
        return PosicionInsertada;
    }

    /**
     * ponerPiedraExtremo1Maquina colocar la piedra a jugar de la máquina en el extremo 0 de la mesa
     * @param extremoActual la piedra extremo actual de la mesa
     * @param laPiedra la piedra que se va a colocar
     * @param matrizMesa la matriz que contiene las piedras de la mesa
     * @param numeroExtremo el número extremo de la mesa
     * @return un string con la posición donde fue insertada la piedra
     */
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
                                matrizMesa[iAux2][j] = laPiedra;
                                PosicionInsertada = iAux2 + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux2 < 10 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
       
                            if (matrizMesa[i][jAux2] == null) {
                                matrizMesa[i][jAux2] = laPiedra;
                                PosicionInsertada = i + "-" + jAux2;
                                return PosicionInsertada;
                            }
                        }

                        if (iAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
       
                            if (matrizMesa[iAux][j] == null) {
                                matrizMesa[iAux][j] = laPiedra;
                                PosicionInsertada = iAux + "-" + j;
                                return PosicionInsertada;
                            }
                        }

                        if (jAux > -1 && (laPiedra.getNum1() == numeroExtremo || laPiedra.getNum2() == numeroExtremo)) {
       
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

    /**
     * realizarJugadaMaquina realiza la jugada de la máquina, busca si tiene piedras para jugar, toma del pozo, pasa.
     * @param listaPiedrasMaquina la lista de piedras de la máquina
     * @param piedrasMesa matriz de la mesa que contiene las piedras
     * @param listaPiedrasPozo la lista de las piedras del pozo
     * @return un string con la piedra a jugar de la máquina
     */
    public String realizarJugadaMaquina(ListaPiedras listaPiedrasMaquina, Piedra[][] piedrasMesa, ListaPiedras listaPiedrasPozo) {

       
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

        while (!piedraPuesta && iterador.hasNext()) {
            laPiedra = (Piedra) iterador.next();

            if (laPiedra.getNum1() == ext1) {
                posicion = ponerPiedraExtremo0Maquina(listaDeExtremos.get(0), laPiedra, piedrasMesa, listaDeExtremos.get(0).getExtremo());
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum2() == ext1) {
                posicion = ponerPiedraExtremo0Maquina(listaDeExtremos.get(0), laPiedra, piedrasMesa, listaDeExtremos.get(0).getExtremo());
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(0, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum1() == ext2) {
                posicion = ponerPiedraExtremo1Maquina(listaDeExtremos.get(1), laPiedra, piedrasMesa, listaDeExtremos.get(1).getExtremo());
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum2());
                listaDeExtremos.set(1, laPiedra);
                piedraPuesta = true;
            } else if (laPiedra.getNum2() == ext2) {
                posicion = ponerPiedraExtremo1Maquina(listaDeExtremos.get(1), laPiedra, piedrasMesa, listaDeExtremos.get(1).getExtremo());
                laPiedra = asignarImagenActual(laPiedra, posicion, piedrasMesa);
                laPiedra.setExtremo(laPiedra.getNum1());
                listaDeExtremos.set(1, laPiedra);
                piedraPuesta = true;
            } else {
                contPiedrasMaquina++;
            }


            if (contPiedrasMaquina == numeroPiedrasMaquina && !piedraPuesta && !listaPiedrasPozo.getLaListaPiedras().isEmpty()) {
                piedraPozo = listaPiedrasPozo.obtenerPiedraPozo();
                listaPiedrasMaquina.agregarPiedra(piedraPozo);
                iterador = listaPiedrasMaquina.getIterator();
                numeroPiedrasMaquina = listaPiedrasMaquina.getLaListaPiedras().size();
                contPiedrasMaquina = 0;
            }

        }

        if (piedraPuesta) {
            listaPiedrasMaquina.eliminarPiedra(laPiedra);
        }

       
        laPiedra.setPosicion(posicion);
        cadena = laPiedra.obtenerCadenaPiedraMaquina();
        return cadena;
    }

    /**
     * comprueba que el jugador no tenga piedras en la mano que pueda poner en la mesa.
     * @param piedrasEnMano - la lista de piedras del jugador.
     * @return false si el jugador no tiene piedras para poner.
     */
    public boolean comprobarPiedrasEnMano(ListaPiedras piedrasEnMano){
        Object arreglo[] = piedrasEnMano.getLaListaPiedras().toArray();
        Piedra piedra;
        int ext0 = obtenerExtremo0();
        int ext1 = obtenerExtremo1();        
        
        for (int i = 0; i < arreglo.length; i++) {
            piedra = (Piedra) arreglo[i];
            if (piedra.getNum1() == ext0 || piedra.getNum1() == ext1 || piedra.getNum2() == ext0 || piedra.getNum2() == ext1) {
                return true;
            }            
        }
        return false;        
    }
}
