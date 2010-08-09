    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import ve.edu.ucab.server.logica.Servidor;

/**
 *
 * @author CASITA
 */
public class ServidorApp {

    public static void main(String[] args) {
        String[] parametros = {"7687", "Logica.PruebaJsockets"};
        Servidor.main(parametros);
    }
}