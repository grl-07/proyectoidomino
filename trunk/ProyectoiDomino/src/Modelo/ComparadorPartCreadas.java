/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.util.Comparator;

/**
 *
 * @author Sheryl
 */
public class ComparadorPartCreadas implements Comparator{
    public int compare(Object usuario1, Object usuario2){
    Usuario user1 = (Usuario) usuario1;
    Usuario user2 = (Usuario) usuario2;

    String numIn1 = Integer.toString(user1.getNumPartCreadas());
    String numIn2 = Integer.toString(user2.getNumPartCreadas());

    int resultado = numIn1.compareTo(numIn2);

    if (resultado == 0)
        return 0;
    if (resultado < 0)
        return -1;

    return 1;
    }

}
