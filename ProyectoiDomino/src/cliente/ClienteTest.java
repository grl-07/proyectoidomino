package cliente;
import cliente.presentacion.VentanaLogin;


public class ClienteTest {

    /**
     * main, método que dispara la ventana inicial del juego al cliente, la ventana para loguearse o registrarse.
     * @param args
     */
    public static void main(String[] args) {

         VentanaLogin ventana = new VentanaLogin();
         ventana.setVisible(true);
         ventana.setLocationRelativeTo(null);
    }
}