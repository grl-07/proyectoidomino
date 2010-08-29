package logica;

import datos.*;

/**
 *
 * @author Alberly
 */
public class Datos {

    private static ListaReportes listaDeUsuarios = null;

    private Datos() {
    }

    public static boolean inicializarListasDeDatos() {
        if (listaDeUsuarios == null)
        {
            listaDeUsuarios = new ListaReportes();
            return true;
        }

        return false;
    }

    public static ListaReportes getListaDeUsuarios() {
        return listaDeUsuarios;
    }
}

