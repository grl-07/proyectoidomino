package servidor.logica;

import servidor.datos.*;

public class Datos {

    private static ListaPiedras listaDePiedras = null;
    private static ListaPartidas listaDePartidas = null;
    private static ListaUsuarios listaDeUsuarios = null;
    private static Piedra[][] matrizPiedrasMesa = null;
    private static ListaPiedras listaPiedrasMaquina = null;
    private static ListaPiedras listaPiedrasJugador = null;
    private static ListaPiedras listaPiedrasPozo = null;
    private static ListaPiedras listaPiedrasMesa = null;

    /**
     * Constructor
     */
    private Datos() {
    }

    /**
     * inicializarListasDeDatos inicializa las listas usuarios, piedras, partidas, si están en null
     * @return
     */
    public static boolean inicializarListasDeDatos() {
        boolean confirm = false;
        if (listaDeUsuarios == null) {
            listaDeUsuarios = new ListaUsuarios();
            confirm = true;
        }
        if (listaDePiedras == null) {
            listaDePiedras = new ListaPiedras();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaDePartidas == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        return confirm;
    }

    /**
     * inicializarListasJuego inicializa las listas que se usarán durante el juego si estas están en null
     * @return un boolean, true o false
     */
    public static boolean inicializarListasJuego() {
        boolean confirm = false;
        if (listaPiedrasMaquina == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaPiedrasJugador == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaPiedrasPozo == null) {
            listaDePartidas = new ListaPartidas();
            confirm = true;
        } else {
            confirm = false;
        }
        if (listaPiedrasMesa == null) {
            listaPiedrasMesa = new ListaPiedras();
            confirm = true;
        } else {
            confirm = false;
        }
        return confirm;
    }

    /**
     * inicializarMatrizPiedras inicializa la matriz (si esta se encuentra en null) donde se insertarán las piedras jugadas.
     * @return un boolean true si se inicializo, false en caso contrario
     */
    public static boolean inicializarMatrizPiedras() {
        if (matrizPiedrasMesa == null) {
            matrizPiedrasMesa = new Mesa().inicializarMatrizPiedras();
            return true;
        }
        return false;
    }

    /**
     * getMatrizPiedrasMesa obtiene la matriz de piedras de la mesa
     * @return la matriz de piedras de la mesa
     */
    public static Piedra[][] getMatrizPiedrasMesa() {
        return matrizPiedrasMesa;
    }

    /**
     * setMatrizPiedrasMesa setea la matriz de piedras de la mesa
     * @param matrizPiedrasMesa la matriz que se va a setear
     */
    public static void setMatrizPiedrasMesa(Piedra[][] matrizPiedrasMesa) {
        Datos.matrizPiedrasMesa = matrizPiedrasMesa;
    }

    /**
     * getListaDeUsuarios obtiene la lista de usuarios
     * @return la lista de usuarios
     */
    public static ListaUsuarios getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    /**
     * getListaDePartidas obtiene la lista de partidas
     * @return la lista de partidas
     */
    public static ListaPartidas getListaDePartidas() {
        return listaDePartidas;
    }

    /**
     * getListaDePiedras obtiene la lista de piedras
     * @return la lista de piedras
     */
    public static ListaPiedras getListaDePiedras() {
        return listaDePiedras;
    }

    /**
     * getListaPiedrasJugador obtiene la lista de piedras del jugador
     * @return la lista de piedras en mano del jugador
     */
    public static ListaPiedras getListaPiedrasJugador() {
        return listaPiedrasJugador;
    }

    /**
     * getListaPiedrasMaquina obtiene la lista de piedras de la máquina
     * @return la lista de piedras en mano de la máquina
     */
    public static ListaPiedras getListaPiedrasMaquina() {
        return listaPiedrasMaquina;
    }

    /**
     * getListaPiedrasPozo obtiene la lista de piedras contenidas en el pozo
     * @return la lista de piedras del pozo
     */
    public static ListaPiedras getListaPiedrasPozo() {
        return listaPiedrasPozo;
    }

    /**
     * setListaPiedrasJugador setea la lista de piedras en mano del jugador
     * @param listaPiedrasJugador la lista de piedras a setear
     */
    public static void setListaPiedrasJugador(ListaPiedras listaPiedrasJugador) {
        Datos.listaPiedrasJugador = listaPiedrasJugador;
    }

    /**
     * setListaPiedrasMaquina setea la lista de piedras en mano de la máquina
     * @param listaPiedrasMaquina la lista de piedras a setear
     */
    public static void setListaPiedrasMaquina(ListaPiedras listaPiedrasMaquina) {
        Datos.listaPiedrasMaquina = listaPiedrasMaquina;
    }

    /**
     * setListaPiedrasPozo setea la lista de piedras contenidas en el pozo
     * @param listaPiedrasPozo la lista de piedras a setear
     */
    public static void setListaPiedrasPozo(ListaPiedras listaPiedrasPozo) {
        Datos.listaPiedrasPozo = listaPiedrasPozo;
    }

    /**
     * getListaPiedrasMesa obtiene la lista de piedras que están en la mesa
     * @return la lista que contiene las piedras que están en la mesa
     */
    public static ListaPiedras getListaPiedrasMesa() {
        return listaPiedrasMesa;
    }

    /**
     * setListaPiedrasMesa setea la lista de piedras contenidas en la mesa
     * @param listaPiedrasMesa la lista de piedras a setear
     */
    public static void setListaPiedrasMesa(ListaPiedras listaPiedrasMesa) {
        Datos.listaPiedrasMesa = listaPiedrasMesa;
    }

    /**
     * agregarLaPiedra llama al método que agrega una piedra a la lista de piedras
     * @param num1 uno de los números de la piedra
     * @param num2 el otro número de la piedra
     * @return true si agregó la piedra, false en caso contrario
     */
    public static boolean agregarLaPiedra(int num1, int num2) {
        return (listaDePiedras.agregarPiedra(new Piedra(num1, num2)));
    }

    /**
     * agregarUsuario llama al método que agrega un usuario a la lista de usuarios
     * @param elUsuario, usuario a ser agregado a la lista de usuarios
     * @return true si lo agregó, false en caso contrario
     */
    public static boolean agregarUsuario(Usuario elUsuario) {
        return listaDeUsuarios.agregarUsuario(elUsuario);
    }

    public static void imprimirListaPiedras() {
        listaDePiedras.imprimirListaPiedras();
    }

    /**
     * crearPartida llama a la función que crear una partida
     * @param nickname, cliente que está creando la partida
     * @return true si se creó la partida, false en caso contrario
     */
    public static boolean crearPartida(String nickname, String fechaInicio) {
        return listaDePartidas.crearPartida(nickname, listaDePiedras, fechaInicio);
    }

    /**
     * obtenerPartidaCreada llama al método que crea la partida y la inserta en la lista de partidas
     * @param nickname, usuario que está creando la partida
     * @return la partida creada
     */
    public static Partida obtenerPartidaCreada(String nickname, String fechaInicio) {
        Partida laPartida;
        laPartida = new Partida().crearPartida(nickname, listaDePiedras, fechaInicio);
        listaDePartidas.agregarPartida(laPartida);
        return laPartida;
    }

    /**
     * obtenerPartidaExistente llama al método que obtiene una partida existente en la lista de partidas
     * @param nickname dato por el cual se buscará una partida dentro de la lista partidas
     * @return la partida que se encuentra dentro de la lista partidas
     */
    public static Partida obtenerPartidaExistente(String nickname) {
        return listaDePartidas.buscarUsuario(new Usuario("", "", "", nickname, "", ""));
    }

    public static Usuario modificarDatosUsuario(Usuario elUsuario) {
        //Usuario usuariobuscado = new Usuario("","","",elUsuario.getNickname(),"","");
        System.out.println(elUsuario.getNickname());
        Usuario auxiliar = new Usuario("", "", "", "", "", "");
        auxiliar = Conector.obtenerDatosDeUsuario(elUsuario.getNickname());//listaDeUsuarios.buscarDatos(elUsuario);
        System.out.println(auxiliar.getNickname());

        return (listaDeUsuarios.modificarUsuario(auxiliar, elUsuario));
    }

    /**
     * guardarPartidaEnLista llama al método que guarda una partida en la lista partidas
     * @param laPartida a ser guardada
     * @param elUsuario, usuario que está guardando la partida
     * @return true si se guardó la partida, false en caso contrario
     */
    public static boolean guardarPartidaEnLista(Partida laPartida, Usuario elUsuario) {
        return (listaDePartidas.guardarPartida(laPartida, elUsuario));
    }
}
