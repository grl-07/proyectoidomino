package cliente.presentacion;
import java.util.Calendar;

import javax.swing.JFrame;
import cliente.logica.ConexionJsockets;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class VentanaMenu extends javax.swing.JFrame {

    javax.swing.JFrame ventanaPadre;

    /** Creates new form VentanaMenu */
    public VentanaMenu() {
        initComponents();
    }

    public VentanaMenu(JFrame ventanaPadre) {
        initComponents();
        this.ventanaPadre = ventanaPadre;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLavatar = new javax.swing.JLabel();
        jLNickname = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLBienvenida = new javax.swing.JLabel();
        jBCrearPartida = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLFechaNac = new javax.swing.JLabel();
        jLFechaNac2 = new javax.swing.JLabel();
        jLApellido2 = new javax.swing.JLabel();
        jLNombre2 = new javax.swing.JLabel();
        jLNickname2 = new javax.swing.JLabel();
        jBReporte = new javax.swing.JButton();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome to iDomino");

        jLavatar.setBounds(70, 100, 110, 100);
        jLayeredPane1.add(jLavatar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNickname.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNickname.setText("Nickname:");
        jLNickname.setBounds(70, 210, 70, 17);
        jLayeredPane1.add(jLNickname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre.setText("Name:");
        jLNombre.setBounds(90, 240, 40, 17);
        jLayeredPane1.add(jLNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLApellido.setFont(new java.awt.Font("Calibri", 1, 14));
        jLApellido.setText("LastName:");
        jLApellido.setBounds(70, 270, 62, 17);
        jLayeredPane1.add(jLApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLBienvenida.setFont(new java.awt.Font("Brush Script MT", 1, 40));
        jLBienvenida.setBounds(10, 20, 530, 50);
        jLayeredPane1.add(jLBienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBCrearPartida.setBackground(new java.awt.Color(255, 204, 153));
        jBCrearPartida.setFont(new java.awt.Font("Calibri", 1, 14));
        jBCrearPartida.setForeground(new java.awt.Color(153, 51, 0));
        jBCrearPartida.setText("New Game");
        jBCrearPartida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBCrearPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCrearPartida.setName("jBCrearPartida"); // NOI18N
        jBCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearPartidaActionPerformed(evt);
            }
        });
        jBCrearPartida.setBounds(340, 190, 110, 21);
        jLayeredPane1.add(jBCrearPartida, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBModificar.setBackground(new java.awt.Color(255, 204, 153));
        jBModificar.setFont(new java.awt.Font("Calibri", 1, 14));
        jBModificar.setForeground(new java.awt.Color(153, 51, 0));
        jBModificar.setText("Modify Info");
        jBModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        jBModificar.setBounds(340, 270, 110, 21);
        jLayeredPane1.add(jBModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLFechaNac.setFont(new java.awt.Font("Calibri", 1, 14));
        jLFechaNac.setText("Birth Date:");
        jLFechaNac.setBounds(70, 300, 70, 17);
        jLayeredPane1.add(jLFechaNac, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLFechaNac2.setFont(new java.awt.Font("Calibri", 1, 14));
        jLFechaNac2.setForeground(new java.awt.Color(255, 153, 0));
        jLFechaNac2.setMaximumSize(new java.awt.Dimension(64, 17));
        jLFechaNac2.setMinimumSize(new java.awt.Dimension(64, 17));
        jLFechaNac2.setPreferredSize(new java.awt.Dimension(64, 17));
        jLFechaNac2.setBounds(140, 300, 90, 20);
        jLayeredPane1.add(jLFechaNac2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLApellido2.setFont(new java.awt.Font("Calibri", 1, 14));
        jLApellido2.setForeground(new java.awt.Color(255, 153, 0));
        jLApellido2.setBounds(140, 270, 90, 20);
        jLayeredPane1.add(jLApellido2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre2.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre2.setForeground(new java.awt.Color(255, 153, 0));
        jLNombre2.setBounds(140, 240, 90, 20);
        jLayeredPane1.add(jLNombre2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNickname2.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNickname2.setForeground(new java.awt.Color(255, 153, 0));
        jLNickname2.setBounds(140, 210, 90, 20);
        jLayeredPane1.add(jLNickname2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBReporte.setBackground(new java.awt.Color(255, 204, 153));
        jBReporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jBReporte.setForeground(new java.awt.Color(153, 51, 0));
        jBReporte.setText("Show Report");
        jBReporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReporteActionPerformed(evt);
            }
        });
        jBReporte.setBounds(340, 230, 110, 21);
        jLayeredPane1.add(jBReporte, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Fondo-Madera1.jpg"))); // NOI18N
        jLFondo.setBounds(-6, -6, 570, 390);
        jLayeredPane1.add(jLFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * hace visible la mesa de juego "VentanaJuego"
     * @param evt
     */
    private void jBCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearPartidaActionPerformed
        // TODO add your handling code here:
        Calendar Calendario = Calendar.getInstance();
        String fecha = Calendario.get(Calendario.DATE) + "/" + (Calendario.get(Calendario.MONTH) + 1) + "/" + Calendario.get(Calendario.YEAR);

        String mensaje = ConexionJsockets.solicitudServidor2(jLNickname2, fecha);

        VentanaJuego ventanaJuego = new VentanaJuego(this, jLNickname2.getText(), mensaje);
        ventanaJuego.setVisible(true);
        ventanaJuego.setLocationRelativeTo(null);
        ventanaJuego.setDatosUsuarioJuego(jLNickname2.getText(), jLavatar);
    }//GEN-LAST:event_jBCrearPartidaActionPerformed

    /**
     * hace visible la ventana para modificar datos "VentanaModificar"
     * @param evt
     */
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        VentanaModificar ventana = new VentanaModificar(this);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        ventana.setDatosUsuarioModificar(password, jLNickname2.getText(),jLNombre2.getText(), jLApellido2.getText(), jLavatar.getText(),jLFechaNac2.getText());
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReporteActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI ("http://localhost:8080/ReportesJSP/Reporte"));
        }
        catch (URISyntaxException ex) {

            Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBReporteActionPerformed

    public void setDatosUsuario(String clave,String nickname, String nombre, String apellido, String avatar,String FechaNac) {
        jLNickname2.setText(nickname);
        jLNombre2.setText(nombre);
        jLApellido2.setText(apellido);
        jLFechaNac2.setText(FechaNac);
        password = clave;

        if (avatar.equalsIgnoreCase("Dog")) {
            jLavatar.setText(avatar);
            jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen10.jpg")));
        } else if (avatar.equalsIgnoreCase("Umbrella")) {
            jLavatar.setText(avatar);
            jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen8.png")));
        } else if (avatar.equalsIgnoreCase("Turtle")) {
            jLavatar.setText(avatar);
            jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen9.jpg")));
        } else if (avatar.equalsIgnoreCase("Butterfly")) {
            jLavatar.setText(avatar);
            jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen6.png")));
        } else if (avatar.equalsIgnoreCase("Bug")) {
            jLavatar.setText(avatar);
            jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen12.jpg")));
        } else if (avatar.equalsIgnoreCase("Domino")) {
            jLavatar.setText(avatar);
            jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen13.png")));
        }

        jLBienvenida.setText(" Welcome " + nickname + " to iDomino");

    }

    /**
     * setea el nuevo dato en la opción escogida por el cliente
     * @param dato, nuevo dato a ser seteado
     * @param op, opción a modificar
     */
    public void actualizarDato(String dato, String op) {
        if (op.equalsIgnoreCase("1")) {
            jLNombre2.setText(dato);
        } else if (op.equalsIgnoreCase("2")) {
            jLApellido2.setText(dato);
        } else if (op.equalsIgnoreCase("4")) {
            if (dato.equalsIgnoreCase("Dog")) {
                jLavatar.setText(dato);
                jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen10.jpg")));
            } else if (dato.equalsIgnoreCase("Umbrella")) {
                jLavatar.setText(dato);
                jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen8.png")));
            } else if (dato.equalsIgnoreCase("Turtle")) {
                jLavatar.setText(dato);
                jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen9.jpg")));
            } else if (dato.equalsIgnoreCase("Butterfly")) {
                jLavatar.setText(dato);
                jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen6.png")));
            } else if (dato.equalsIgnoreCase("Bug")) {
                jLavatar.setText(dato);
                jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen12.jpg")));
            } else if (dato.equalsIgnoreCase("Domino")) {
                jLavatar.setText(dato);
                jLavatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen13.png")));
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearPartida;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBReporte;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLApellido2;
    private javax.swing.JLabel jLBienvenida;
    private javax.swing.JLabel jLFechaNac;
    private javax.swing.JLabel jLFechaNac2;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLNickname;
    private javax.swing.JLabel jLNickname2;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLavatar;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables

    private String password;

}
