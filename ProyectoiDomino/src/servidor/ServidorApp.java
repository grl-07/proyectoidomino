
package servidor;

import ve.edu.ucab.server.logica.Servidor;
import Logica.Conector;
import Logica.Datos;

/**
 *
 * @author CASITA
 */
public class ServidorApp {

    public static void main(String[] args) {

        Conector.inicializarEstructuras();
        Datos.inicializarListasDeDatos();
        Conector.solicitarCargaDeDatos();
        Conector.solicitarImpresionPiedras();

        String[] parametros = {"7687", "Logica.PruebaJsockets"};
        Servidor.main(parametros);
    }
}


