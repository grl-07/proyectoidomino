
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
        Conector.solicitarCargaDatosPiedras();
        //Conector.solicitarImpresionPiedras();

        Conector.solicitarCargaDatosPartidas();
        Conector.solicitarImpresionPartidas();
        Conector.solicitarGuardarDatosPartidas();

        String[] parametros = {"9999", "servidor.logica.PruebaJsockets"};
        Servidor.main(parametros);
    }
}