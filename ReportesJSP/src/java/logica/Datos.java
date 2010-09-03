package logica;
import datos.*;


public class Datos {

    private static ListaReportes listaDeUsuarios = null;

    /**
     * Constructor
     */
    private Datos() {
    }

    /**
     * Inicializa la lista de datos de usuarios
     * @return true
     */
    public static boolean inicializarListasDeDatos() {  
            listaDeUsuarios = new ListaReportes();
            return true;
    }

    /**
     * getListaDeUsuarios obtiene la lista de usuarios
     * @return la lista de los reportes
     */
    public static ListaReportes getListaDeUsuarios() {
        return listaDeUsuarios;
    }
}

