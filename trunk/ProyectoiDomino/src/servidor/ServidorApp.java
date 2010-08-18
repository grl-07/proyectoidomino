
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

         Datos.inicializarListasDeDatos();
        Conector.solicitarCargaDatosUsuario();
        Conector.solicitarCargaDeDatos();
        //Conector.solicitarImpresionPiedras();

        String[] parametros = {"9999", "servidor.logica.PruebaJsockets"};
        Servidor.main(parametros);
    }
}