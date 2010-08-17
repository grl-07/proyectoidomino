
package servidor;

import ve.edu.ucab.server.logica.Servidor;
import servidor.logica.Conector;
import servidor.logica.Datos;

/**
 *
 * @author CASITA
 */
public class ServidorApp {

    public static void main(String[] args) {

        //Conector.inicializarEstructuras();
        Datos.inicializarListasDeDatos();
        Conector.solicitarCargaDeDatos();
        Conector.solicitarImpresionPiedras();

        String[] parametros = {"7687", "servidor.logica.PruebaJsockets"};
        Servidor.main(parametros);
    }
}


