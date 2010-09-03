package servidor.datos;
import java.util.Calendar;

public class Partida {

    private Usuario elUsuario;
    private int IDPartida;
    private String fechaIni;
    private String fechaactual;
    private Juego elJuego;

    /**
     * getElJuego para obtener el juego actual
     * @return objeto tipo Juego con el juego actual
     */
    public Juego getElJuego() {
        return elJuego;
    }

    /**
     * setElJuego para setear el juego
     * @param elJuego objeto tipo Juego que contiene el juego a setear
     */
    public void setElJuego(Juego elJuego) {
        this.elJuego = elJuego;
    }

    /**
     * getFechaIni para obtener la fecha de inicio del juego
     * @return string con la fecha de inicio del juego
     */
    public String getFechaIni() {
        return fechaIni;
    }

    /**
     * setFechaIni para setear la fecha de inicio de la partida
     * @param fechaIni string con la fecha de inicio a setear
     */
    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    /**
     * getFechaactual para obtener la fecha actual del juego
     * @return string con la fecha actual del sistema
     */
    public String getFechaactual() {
        return fechaactual;
    }

    /**
     * setFechaactual setear la fecha actual del sistema a la partida
     * @param fechaactual string con la fecha actual del sistema
     */
    public void setFechaactual(String fechaactual) {
        this.fechaactual = fechaactual;
    }

    /**
     * getIDPartida para obtener el ID de la partida
     * @return entero con el número de identificación de la partida
     */
    public int getIDPartida() {
        return IDPartida;
    }

    /**
     * setIDPartida para setear el ID de la partida
     * @param IDPartida entero con el número de identificación
     */
    public void setIDPartida(int IDPartida) {
        this.IDPartida = IDPartida;
    }

    /**
     * getElUsuario para obtener un usuario
     * @return objeto tipo Usuario con el usuario
     */
    public Usuario getElUsuario() {
        return elUsuario;
    }

    /**
     * setElUsuario para setear el objeto elUsuario
     * @param elUsuario tipo Usuario con el usuario
     */
    public void setElUsuario(Usuario elUsuario) {
        this.elUsuario = elUsuario;
    }

    /**
     * Constructor
     */
    public Partida() {
    }

    /**
     * Constructor
     * @param elUsuario con el usuario
     */
    public Partida(Usuario elUsuario) {
        this.elUsuario = elUsuario;

    }

    /**
     * Constructor
     * @param elUsuario para asignar el usuario
     * @param IDPartida para asignar el ID de la partida
     * @param fechaIni para asignar la fecha de inicio de la partida
     * @param fechaactual para asignar la fecha actual del sistema
     * @param elJuego para asignar el juego con todos sus atributos
     */
    public Partida(Usuario elUsuario, int IDPartida, String fechaIni, String fechaactual, Juego elJuego) {
        this.elUsuario = elUsuario;
        this.fechaIni = fechaIni;
        this.fechaactual = fechaactual;
        this.elJuego = elJuego;
        this.IDPartida = IDPartida;
    }

    /**
     * Constructor
     * @param elUsuario para asignar el usuario
     * @param IDPartida para asignar el ID de la partida
     * @param fechaIni para asignar la fecha de inicio de la partida
     * @param fechaactual para asignar la fecha actual del sistema
     */
    public Partida(Usuario elUsuario, int IDPartida, String fechaIni, String fechaactual) {
        this.elUsuario = elUsuario;
        this.fechaIni = fechaIni;
        this.fechaactual = fechaactual;
        this.IDPartida = IDPartida;

    }

    /**
     * obtenerFechaDelSistema Obtener la fecha del sistema
     * @return un string con la fecha del sistema
     */
    public String obtenerFechaDelSistema() {
        Calendar Calendario = Calendar.getInstance();
        String fecha = Calendario.get(Calendario.DATE) + "/" + (Calendario.get(Calendario.MONTH) + 1) + "/" + Calendario.get(Calendario.YEAR);
        return (fecha);
    }

    /**
     * crearPartida Crea una partida para el usuario
     * @param nickname string con el nickname del usuario
     * @param listaDePiedras de tipo ListaPiedras con la lista de piedras del juego
     * @return objeto Partida con la información de la partida creada
     */
    public Partida crearPartida(String nickname, ListaPiedras listaDePiedras, String fechaInicio) {

        String fechaActual = obtenerFechaDelSistema();
        this.setIDPartida(1);
        this.setFechaIni(fechaInicio);
        this.setFechaactual(fechaActual);
       
        this.elJuego = new Juego(null, null, null);
        elJuego.setJugador1(new Jugador(nickname, "", 0, 0, 0, 0));
        elJuego.setJugador2(new Maquina());
        elJuego.setLaMesa(new Mesa(new ListaPiedras(), -1, -1, null));

        listaDePiedras.elRepartidor(elJuego.getJugador1(), elJuego.getJugador2(), elJuego.getLaMesa());

        Partida laPartida;
        elUsuario = new Usuario("", "", "", nickname, "", "");
        laPartida = new Partida(elUsuario, IDPartida, fechaIni, fechaactual, elJuego);

        return (laPartida);
    }
}
