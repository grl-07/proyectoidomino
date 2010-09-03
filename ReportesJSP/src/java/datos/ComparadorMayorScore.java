package datos;
import java.util.Comparator;

public class ComparadorMayorScore implements Comparator{

     /**
     * compare Este método hace la comparación entre dos números para determinar cual de ellos es mayor
     * @param usuario1 score del usuario1
     * @param usuario2 score del usuario2
     * @return 0: si los dos score son iguales, 1: si el score del usuario1 es mayor al score del usuario2,
      * y -1: si el score del usuario2 es mayor al del usuario1
     */
   public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        if (user1.getPuntaje() - user2.getPuntaje() == 0) {
            return 0;
        }

        if (user1.getPuntaje() - user2.getPuntaje() > 0) {
            return 1;
        }

        return -1;
    }
}
