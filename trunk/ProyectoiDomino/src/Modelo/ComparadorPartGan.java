/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mis hijos
 */
public class ComparadorPartGan {

    public int compare(Object usuario1, Object usuario2) {

        Usuario user1 = (Usuario) usuario1;
        Usuario user2 = (Usuario) usuario2;

        String numPartGan1 = Integer.toString(user1.getNumPartidasGan());
        String numPartGan2 = Integer.toString(user2.getNumPartidasGan());

        int resultado = numPartGan1.compareTo(numPartGan2);

        if (resultado == 0) {
            return 0;
        }
        if (resultado < 0) {
            return -1;
        }

        return 1;
    }
}