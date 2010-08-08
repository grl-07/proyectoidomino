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

        String numGan1 = Integer.toString(user1.getNumPartidasGan());
        String numGan2 = Integer.toString(user2.getNumPartidasGan());

        int resultado = numGan1.compareTo(numGan2);

        if (resultado == 0) {
            System.out.println("Resultado es = " + resultado);
            return 0;
        }
        if (resultado < 0) {
            System.out.println("Resultado es = " + resultado);
            return -1;
        }

    if (resultado == 0) {
        return 0;
    }
    if (resultado < 0) {
        return -1;
    }
        

        return 1;
    }
}
