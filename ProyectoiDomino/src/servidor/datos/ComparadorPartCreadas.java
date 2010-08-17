/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.datos;

/**
 *
 * @author Mis hijos
 */
import java.util.*;

public class ComparadorPartCreadas implements Comparator {

    public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        String numCreadas1 = Integer.toString(user1.getNumPartCreadas());
        String numCreadas2 = Integer.toString(user2.getNumPartCreadas());

        int resultado = numCreadas1.compareTo(numCreadas2);

        if (resultado == 0) {
            return 0;
        }
        if (resultado < 0) {
            return -1;
        }

        return 1;
    }
}
