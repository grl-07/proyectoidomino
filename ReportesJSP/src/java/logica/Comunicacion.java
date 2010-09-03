package logica;

import datos.Archivo;
import java.io.PrintWriter;

public class Comunicacion
{
    /**
     * solicitar carga de datos, llama al archivo para cargar los datos en al lista
     */
    public static void solicitarCargaDeDatos()
    {
        Archivo.cargarDatosArchivoUsuario(Datos.getListaDeUsuarios());
    }

    /**
     * solicitar guardado de datos guarda en los archivos las listas ordenadas
     */
    public static void solicitarGuardadoDeDatos()
    {
        Archivo.guardarDatosArchivoUsuario(Datos.getListaDeUsuarios());
        Archivo.guardarDatosArchivoUsuario2(Datos.getListaDeUsuarios());
        Archivo.guardarDatosArchivoUsuario3(Datos.getListaDeUsuarios());
        Archivo.guardarDatosArchivoUsuario4(Datos.getListaDeUsuarios());
    }

    /**
     * solicitar impresion usuarios Jsp, llama a imprimir coleccion JSP para mostrar las listas en HTML
     * @param out
     */
    public static void solicitarImpresionUsuariosJSP(PrintWriter out)
    {
        Datos.getListaDeUsuarios().imprimirColeccionJSP(out);
    }
}
