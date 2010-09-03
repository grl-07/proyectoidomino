package datos;
import java.util.*;

public class ComparadorIngresos implements Comparator {

     /**
     * compare Este método hace la comparación entre dos números para determinar cual de ellos es mayor
     * @param usuario1 ingresos del usuario1
     * @param usuario2 ingresos del usuario2
     * @return 0: si la cantidad de ingreso es igual en los dos usuarios. 1: si los ingresos del usuario1
     * son mayores a los del usuario2, y -1: si los ingresos del usuario2 son mayores a los del usuario1
     */
    public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        if (user1.getNumIngresos() - user2.getNumIngresos() == 0) {
            return 0;
        }

        if (user1.getNumIngresos() - user2.getNumIngresos() > 0) {
            return 1;
        }

        return -1;
    }
}
