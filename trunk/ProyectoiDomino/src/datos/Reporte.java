/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;



/**
 *
 * @author Sheryl
 */
import java.util.*;

public class Reporte {

    private Set<Usuario> listaOrdenIn;
    private Set<Usuario> listaOrdenPartGan;
    private Set<Usuario> listaOrdenMayorScore;
    private Set<Usuario> listaOrdenCreadas;

    public Reporte() {
        listaOrdenIn = new TreeSet(new ComparadorIngresos());
        listaOrdenPartGan = new TreeSet(new ComparadorGanadas());
        listaOrdenMayorScore = new TreeSet(new ComparadorMayorScore());
        listaOrdenCreadas = new TreeSet(new ComparadorPartCreadas());
    }

    public void imprimirReporte(Set lista, int opcion) {
        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];

            switch (opcion) {
                case 1:
                    System.out.println("Nickname: " + registro.getNickname());
                    System.out.println("Numero de Ingresos: " + registro.getNumIngresos());
                    break;

                case 2:
                    System.out.println("Nickname: " + registro.getNickname());
                    System.out.println("Numero de Creadas : " + registro.getNumPartCreadas());
                    break;

                case 3:
                    System.out.println("Nickname: " + registro.getNickname());
                    System.out.println("Numero de Partidas Ganadas: " + registro.getNumPartidasGan());
                    break;

                case 4:
                    if ((i + 1) == arreglo.length) {
                        System.out.println("Nombre: " + registro.getNombre());
                        System.out.println("Apellido: " + registro.getApellido());
                        System.out.println("Clave: " + registro.getClave());
                        System.out.println("Nickname: " + registro.getNickname());
                        System.out.println("Avatar: " + registro.getAvatar());
                        System.out.println("Numero de Partidas Ganadas: " + registro.getNumPartidasGan());
                        System.out.println("Numero de Ingresos: " + registro.getNumIngresos());
                        System.out.println("Puntaje: " + registro.getPuntaje());
                        break;
                    }
            }
        }

    }

    /**
     *
     * @param Lista
     */
    public void ordenarPorIngresos(ListaUsuarios lista) {

        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.getListadoUsuarios().toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];
            listaOrdenIn.add(registro);
        }
        this.imprimirReporte(listaOrdenIn, 1);
    }

    public void ordenarPorPartidasCreadas(ListaUsuarios lista) {
        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.getListadoUsuarios().toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];
            listaOrdenCreadas.add(registro);
        }
        this.imprimirReporte(listaOrdenCreadas, 2);
    }

    public void ordenPartidasGanadas(ListaUsuarios lista) {
        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.getListadoUsuarios().toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];
            listaOrdenPartGan.add(registro);
        }
        this.imprimirReporte(listaOrdenPartGan,3);
      
    }

    public void usuarioMayorScore(ListaUsuarios lista) {
        int i;
        Usuario registro;
        Object arreglo[];

        arreglo = lista.getListadoUsuarios().toArray();

        for (i = 0; i < arreglo.length; i++) {
            registro = (Usuario) arreglo[i];
            listaOrdenMayorScore.add(registro); 
        }
        this.imprimirReporte(listaOrdenMayorScore, 4);
    }
}
