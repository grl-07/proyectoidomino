/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servidor.datos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Sheryl
 */
public class ProcesarProperties {
//"D:\Documents and Settings\Sheryl\Mis documentos\NetBeansProjects\trunk\ProyectoiDomino\src\servidor\datos\valorPartida.properties";

    private static Properties properties;
    private static String archivo = "src/servidor/datos/valorPartida.properties";
//C:\Users\Alberly\Documents\NetBeansProjects\ProyectoiDomino\src\servidor\datos\valorPartida.properties
    /**
     * Constructor
     */
    private ProcesarProperties()
    {
        properties = new Properties();
    }

    /**
     * Inicializa el archivo .propierties
     */
    public static void inicializarProcesarProperties()
    {
        new ProcesarProperties();
    }

    /**
     * leer propiedad, lee el archivo propierties
     * @return retorna el entero con el puntaje de la jugada
     */
    public static int leerPropiedad()
    {
        String propiedad = "";
        int propiedadEntera = -1;
        
        try 
        {
            properties.load(new FileInputStream(archivo));
            propiedad = properties.getProperty("valorPartidaGanada");

            System.out.println(properties.getProperty("valorPartidaGanada"));

            propiedadEntera = Integer.parseInt(propiedad);
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        return propiedadEntera;
    }
}
