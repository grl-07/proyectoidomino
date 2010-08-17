/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente.logica;
import javax.swing.JRadioButton;
/**
 *
 * @author CASITA
 */
public class FuncionGeneral {
    public static void desmarcarRadioButton(JRadioButton elBoton)
    {
        elBoton.setSelected(false);
    }

    public static String asignarImagenAvatar(String avatar){
        if (avatar.equalsIgnoreCase("perro")){
            //jLDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/Imagen10.jpg")));
            return "perro";
        }
        return "";
    }
}
