package Modelo;

/**
 * @author Mis hijos
 * @version 1.0
 * @created 01-Aug-2010 5:29:46 PM
 */
import java.util.*;
import java.io.*;

public class ListaUsuarios {

    private Set<Usuario> listadoUsuarios;

    public Set<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(Set<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    public ListaUsuarios() {
        listadoUsuarios = new HashSet();
    }

    /*public void finalize() throws Throwable {

    }*/
    public boolean agregarUsuario(Usuario elUsuario) {
        return (listadoUsuarios.add(elUsuario));
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

    public boolean modificarUsuario(Usuario elUsuario, String dato, int opcion) {
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
    }
}