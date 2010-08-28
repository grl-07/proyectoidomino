package servidor.datos;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 01-Aug-2010 5:29:46 PM
 */
import java.util.*;

public class ListaUsuarios {

    private List<Usuario> listadoUsuarios;

    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(List<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    public ListaUsuarios() {
        listadoUsuarios = new ArrayList();
    }

    /*public void finalize() throws Throwable {

    }*/
    public boolean agregarUsuario(Usuario elUsuario) {
        return (listadoUsuarios.add(elUsuario));
    }

    public Iterator getIterator(){
        return listadoUsuarios.iterator();
    }

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

   /* public boolean modificarUsuario(Usuario elUsuario, String dato, int opcion) {
        boolean encontrado = false;
        Usuario auxiliar = null;
        Iterator iterador = listadoUsuarios.iterator();

        while (!encontrado && iterador.hasNext()) {
            auxiliar = (Usuario) iterador.next();

            if (elUsuario.equals(auxiliar)) {
                if (opcion == 1) {
                    auxiliar.nombre = dato;
                } else if (opcion == 2) {
                    auxiliar.apellido = dato;
                } else if (opcion == 3) {
                    auxiliar.clave = dato;
                } else if (opcion == 4) {
                    auxiliar.avatar = dato;
                }
                encontrado = true;
            }
        }

        if (encontrado) {
            return true;
        }
        return false;
    }*/

    public Usuario modificarUsuario(Usuario auxiliar,Usuario elUsuario) {

       //System.out.println(auxiliar.getNickname());
       auxiliar.setNickname(elUsuario.getNickname());
       auxiliar.setNombre(elUsuario.getNombre());
       auxiliar.setApellido(elUsuario.getApellido());
       auxiliar.setClave(elUsuario.getClave());
       auxiliar.setFechaNac(elUsuario.getFechaNac());
       auxiliar.setAvatar(elUsuario.getAvatar());


                /*auxiliar.clave = elUsuario.getNickname();
                auxiliar.nombre = elUsuario.getNombre();
                auxiliar.apellido = elUsuario.getApellido();
                auxiliar.nickname = elUsuario.getClave();
                auxiliar.fechaNac = elUsuario.getFechaNac();
                auxiliar.avatar = elUsuario.getAvatar();*/
           
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