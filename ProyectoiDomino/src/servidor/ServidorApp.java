package servidor;
import ve.edu.ucab.server.logica.Servidor;
import servidor.logica.Conector;
import servidor.logica.Datos;

public class ServidorApp {

    /**
     * Main del servidor, donde se ejecuta el servidor y se inicializan todas las listas y se carga la información contenida en los archivos
     * @param args
     */
    public static void main(String[] args) {

        Datos.inicializarListasDeDatos();
        Conector.solicitarCargaDatosUsuario();
        Conector.solicitarCargaDatosPiedras();
        Conector.solicitarCargaDatosPartidas();
        
        String[] parametros = {"9999", "servidor.logica.PruebaJsockets"};
        Servidor.main(parametros);
    }
}
