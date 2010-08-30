package cliente.logica;

import javax.swing.JRadioButton;

public class FuncionGeneral {

    /**
     * desmarca un boton de tipo JRadioButton.
     * @param elBoton boton a ser desmarcado.
     */
    public static void desmarcarRadioButton(JRadioButton elBoton) {
        elBoton.setSelected(false);
    }
}