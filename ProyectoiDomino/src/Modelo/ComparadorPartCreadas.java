/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mis hijos
 */
import java.util.*;

public class ComparadorPartCreadas implements Comparator {

    public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        String numPartCreadas1 = Integer.toString(user1.getNumPartCreadas());
        String numPartCreadas2 = Integer.toString(user2.getNumPartCreadas());

        int resultado = numPartCreadas1.compareTo(numPartCreadas2);

        if (resultado == 0) {
            return 0;
        }
        if (resultado < 0) {
            return -1;
        }

        return 1;
    }
}
