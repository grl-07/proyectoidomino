package datos;

import java.util.Comparator;

/**
 *
 * @author Hermanos
 */
public class ComparadorGanadas implements Comparator {

    public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        if (user1.getNumPartidasGan() - user2.getNumPartidasGan() == 0) {
            return 0;
        }

        if (user1.getNumPartidasGan() - user2.getNumPartidasGan() > 0) {
            return 1;
        }

       /* if (user1.getNumIngresos() - user2.getNumIngresos() < 0) {
            return -1;
        }*/
        return -1;
    }
}
