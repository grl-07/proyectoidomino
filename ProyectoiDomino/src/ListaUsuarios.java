package Modelo;
/**
 * @author Mis hijos
 * @version 1.0
 * @created 01-Aug-2010 5:29:46 PM
 */
/*import java.io.*/;
import java.util.*;

public class ListaUsuarios {

    private Set <Usuario> listadoUsuarios;

	public ListaUsuarios(){
            listadoUsuarios = new HashSet();
        }

	/*public void finalize() throws Throwable {

	}*/
        
	public boolean agregarUsuario(Usuario elUsuario){
            return (listadoUsuarios.add(elUsuario));
	}

        public void imprimir(){
            int i;
            Usuario registro;
            Object arreglo[];

            arreglo = listadoUsuarios.toArray();

            for (i=0;i<arreglo.length;i++){
                registro = (Usuario) arreglo[i];

                System.out.println("Nombre: " + registro.getNombre());
                System.out.println("Apellido: " + registro.getApellido());
                System.out.println("Clave: " + registro.getClave());
                System.out.println("Nickname: " + registro.getNickname());
                System.out.println("Avatar: " + registro.getAvatar());
                System.out.println("Numero de Partidas Ganadas: " + registro.getNumPartidasGan());
                System.out.println("Numero de Ingresos: " + registro.getNumIngresos());
            }
        }

	
	

}