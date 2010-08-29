/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Mis hijos
 */
import java.util.*;

public class ComparadorPartCreadas implements Comparator {

     public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        if (user1.getNumPartCreadas() - user2.getNumPartCreadas() == 0) {
            return 0;
        }

        if (user1.getNumPartCreadas() - user2.getNumPartCreadas() > 0) {
            return 1;
        }

       /* if (user1.getNumIngresos() - user2.getNumIngresos() < 0) {
            return -1;
        }*/
        return -1;
    }
}
