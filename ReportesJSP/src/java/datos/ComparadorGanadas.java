package datos;
import java.util.Comparator;


public class ComparadorGanadas implements Comparator {

    /**
     * compare Este método hace la comparación entre dos números para determinar cual de ellos es mayor
     * @param usuario1 partidas ganadas del usuario1
     * @param usuario2 partidas ganadas del usuario2
     * @return 0: si los dos números de partidas ganadas son iguales, 1: si las partidas ganadas del usuario1
     * son mayores a las del usuario2, y -1: si las partidas ganadas del usuario2 son mayores a las del usuario1
     */
    public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        if (user1.getNumPartidasGan() - user2.getNumPartidasGan() == 0) {
            return 0;
        }

        if (user1.getNumPartidasGan() - user2.getNumPartidasGan() > 0) {
            return 1;
        }

        return -1;
    }
}
