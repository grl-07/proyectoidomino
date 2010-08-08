/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;
/**
 *
 * @author Alberly
 */
public class Archivo {
 public static boolean cargarDatosDeArchivo(ListaUsuarios listaUsuarios)
    {
      //Agregar usuario
        listaUsuarios.agregarUsuario(new Usuario("Daniel", "Sierra", "123456", "danieluchin", "dani54", 0, 5, 9, 0));
        listaUsuarios.agregarUsuario(new Usuario("Alberly", "Martinez", "654321", "alberlykida12", "abe28", 0, 6, 5, 0));
        listaUsuarios.agregarUsuario(new Usuario("Sheryl", "Ravelo", "135790", "shishi348", "shi8", 0, 8, 1, 0));
        return true;
    }

 public static void guardarDatosArchivo(ListaUsuarios listaUsuarios){
        listaUsuarios.mostrarUsuario();
    }
}
