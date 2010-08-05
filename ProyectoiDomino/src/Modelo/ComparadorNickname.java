package Modelo;

import java.util.Comparator;

/**
 *
 * @author Hermanos
 */
public class ComparadorNickname implements Comparator {

    public int compare(Object primeraPersona, Object segundaPersona) {

       Usuario primera = (Usuario) primeraPersona,
               segunda = (Usuario) segundaPersona;


        int resultado = primera.getClave().compareTo(segunda.getClave());

       if (resultado == 0)
            return 0;

       if (resultado < 0)
            return -1;

       return 1;
    }

}
