package servidor.datos;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 01-Aug-2010 5:29:46 PM
 */
import java.util.*;

public class ListaUsuarios {

    private List<Usuario> listadoUsuarios;

    /**
     * getListadoUsuarios para saber cual es la lista de usuarios
     * @return retorna la lista de usuario
     */
    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    /**
     * setListadoUsuarios establece la lista de usuarios
     * @param listadoUsuarios una lista para asignarle a la lista usuarios
     */
    public void setListadoUsuarios(List<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    /**
     * Constructor que inicializa la lista de usuarios
     */
    public ListaUsuarios() {
        listadoUsuarios = new ArrayList();
    }

    /*public void finalize() throws Throwable {

    }*/
    
    /**
     * agregarUsuario agrega un usuario a la lista de los usuarios
     * @param elUsuario el objeto de tipo Usuario que se va a agregar en la lista
     * @return el resultado del add
     */
    public boolean agregarUsuario(Usuario elUsuario) {
        return (listadoUsuarios.add(elUsuario));
    }

    /**
     * getIterator para allar el iterador de la lista
     * @return el iterador de la lista usuarios
     */
    public Iterator getIterator(){
        return listadoUsuarios.iterator();
    }

    /**
     * mostrarUsuario para imprimir la lista de usuarios
     */
    public void mostrarUsuario() {
        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = listadoUsuarios.toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];

            System.out.println("Nombre: " + registro.getNombre());
            System.out.println("Apellido: " + registro.getApellido());
            System.out.println("Clave: " + registro.getClave());
            System.out.println("Nickname: " + registro.getNickname());
            System.out.println("Avatar: " + registro.getAvatar());
            System.out.println("Numero de Partidas Ganadas: " + registro.getNumPartidasGan());
            System.out.println("Numero de Ingresos: " + registro.getNumIngresos());
            System.out.println("Puntaje: " + registro.getPuntaje());
        }
    }

    /**
     * buscarNickname busca por nickname en la lista para saber si existe el usuario
     * @param elUsuario contiene el nickname para buscar con el de la lista
     * @return un booelan true para saber si el nicknae esta y false si no se encuentra
     */
    public boolean buscarNickname(Object elUsuario) {
        boolean encontrado = false;
        Usuario auxiliar = null;
        Iterator iterador = listadoUsuarios.iterator();

        while (!encontrado && iterador.hasNext()) {
            auxiliar = (Usuario) iterador.next();

            if (elUsuario.equals(auxiliar)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            return true;
        }
        return false;

    }
    
    /**
     * modificarUsuario para modificar la informacion del usuario, 
     * @param auxiliar 
     * @param elUsuario
     * @return
     */    
    public Usuario modificarUsuario(Usuario auxiliar,Usuario elUsuario) {

       auxiliar.setNickname(elUsuario.getNickname());
       auxiliar.setNombre(elUsuario.getNombre());
       auxiliar.setApellido(elUsuario.getApellido());
       auxiliar.setClave(elUsuario.getClave());
       auxiliar.setFechaNac(elUsuario.getFechaNac());
       auxiliar.setAvatar(elUsuario.getAvatar());
           
            return auxiliar;
    }



    public boolean comprobarDatos(String nickname, String password) {
        int i;
        Usuario registro;
        Object arreglo[];
        boolean confirm = false;

        arreglo = listadoUsuarios.toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];

            if ((registro.nickname.equalsIgnoreCase(nickname)) && (registro.clave.equalsIgnoreCase(password))) {
                confirm = true;
            }
        }
        return confirm;
    }

    /**
     * buscarDatos es para buscar los datos de un usuario
     * @param elUsuario contiene el nickname a buscar
     * @return retorna  el usuario con toda su informacion
     */
    public Usuario buscarDatos(Object elUsuario) {
        boolean encontrado = false;
        Usuario auxiliar = null;
        Iterator iterador = listadoUsuarios.iterator();

        while (!encontrado && iterador.hasNext()) {
            auxiliar = (Usuario) iterador.next();

            if (elUsuario.equals(auxiliar)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            return auxiliar;
        }
        return null;

    }

}