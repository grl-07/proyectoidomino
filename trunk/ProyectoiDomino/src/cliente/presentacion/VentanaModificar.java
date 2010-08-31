/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaModificar.java
 *
 * Created on 22/08/2010, 12:59:00
 */

package cliente.presentacion;
import cliente.logica.ConexionJsockets;
import javax.swing.*;
import com.toedter.calendar.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Sheryl
 */
public class VentanaModificar extends javax.swing.JFrame {

    /** Creates new form VentanaModificar */
    public VentanaModificar() {
        initComponents();
    }

    public VentanaModificar(JFrame ventanaPadre) {
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
        jLabel1 = new javax.swing.JLabel();
        jLNombre1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jBname = new javax.swing.JButton();
        jBlastName = new javax.swing.JButton();
        jTextApellido = new javax.swing.JTextField();
        jLNombre2 = new javax.swing.JLabel();
        jLNombre4 = new javax.swing.JLabel();
        jTextNickname = new javax.swing.JTextField();
        jLNombre3 = new javax.swing.JLabel();
        jPClave = new javax.swing.JPasswordField();
        jBclave = new javax.swing.JButton();
        jLNombre5 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jTextAvatar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jBOK = new javax.swing.JButton();
        jTextFechaNac = new javax.swing.JTextField();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User data");
        jLabel1.setBounds(110, 10, 180, 40);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre1.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre1.setText("Name:");
        jLNombre1.setBounds(60, 100, 50, 20);
        jLayeredPane1.add(jLNombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextNombre.setFont(new java.awt.Font("Calibri", 1, 14));
        jTextNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jTextNombre.setEnabled(false);
        jTextNombre.setBounds(120, 100, 160, 19);
        jLayeredPane1.add(jTextNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBname.setText("...");
        jBname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnameActionPerformed(evt);
            }
        });
        jBname.setBounds(290, 100, 27, 23);
        jLayeredPane1.add(jBname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBlastName.setText("...");
        jBlastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlastNameActionPerformed(evt);
            }
        });
        jBlastName.setBounds(290, 130, 27, 23);
        jLayeredPane1.add(jBlastName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextApellido.setFont(new java.awt.Font("Calibri", 1, 14));
        jTextApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jTextApellido.setEnabled(false);
        jTextApellido.setBounds(120, 130, 160, 19);
        jLayeredPane1.add(jTextApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre2.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre2.setText("Last Name:");
        jLNombre2.setBounds(40, 130, 70, 20);
        jLayeredPane1.add(jLNombre2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre4.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre4.setText("*Nickname:");
        jLNombre4.setBounds(40, 160, 70, 20);
        jLayeredPane1.add(jLNombre4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextNickname.setEditable(false);
        jTextNickname.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextNickname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jTextNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNicknameActionPerformed(evt);
            }
        });
        jTextNickname.setBounds(120, 160, 160, 20);
        jLayeredPane1.add(jTextNickname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre3.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre3.setText("Password:");
        jLNombre3.setBounds(40, 190, 70, 20);
        jLayeredPane1.add(jLNombre3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPClave.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jPClave.setEnabled(false);
        jPClave.setBounds(120, 190, 160, 20);
        jLayeredPane1.add(jPClave, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBclave.setText("...");
        jBclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclaveActionPerformed(evt);
            }
        });
        jBclave.setBounds(290, 190, 27, 23);
        jLayeredPane1.add(jBclave, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLNombre5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre5.setText("*Birth Date:");
        jLNombre5.setBounds(30, 220, 80, 20);
        jLayeredPane1.add(jLNombre5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLNombre.setFont(new java.awt.Font("Calibri", 1, 14));
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombre.setText("Avatar: ");
        jLNombre.setBounds(60, 250, 50, 20);
        jLayeredPane1.add(jLNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextAvatar.setEditable(false);
        jTextAvatar.setFont(new java.awt.Font("Calibri", 1, 14));
        jTextAvatar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jTextAvatar.setBounds(120, 250, 160, 19);
        jLayeredPane1.add(jTextAvatar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(290, 250, 27, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("*This fields cannot be change");
        jLabel2.setBounds(40, 290, 220, 16);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Note: Changes will show next time you login");
        jLabel3.setBounds(40, 310, 241, 16);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBCancelar.setFont(new java.awt.Font("Calibri", 1, 14));
        jBCancelar.setForeground(new java.awt.Color(153, 51, 0));
        jBCancelar.setText("Cancel");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jBCancelar.setBounds(190, 340, 80, 25);
        jLayeredPane1.add(jBCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBOK.setFont(new java.awt.Font("Calibri", 1, 14));
        jBOK.setForeground(new java.awt.Color(153, 51, 0));
        jBOK.setText("OK");
        jBOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOKActionPerformed(evt);
            }
        });
        jBOK.setBounds(90, 340, 70, 25);
        jLayeredPane1.add(jBOK, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextFechaNac.setEditable(false);
        jTextFechaNac.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextFechaNac.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jTextFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFechaNacActionPerformed(evt);
            }
        });
        jTextFechaNac.setBounds(120, 220, 160, 20);
        jLayeredPane1.add(jTextFechaNac, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Fondo-Madera1.jpg"))); // NOI18N
        jLFondo.setBounds(0, -10, 400, 410);
        jLayeredPane1.add(jLFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * modifica nombre, apellido, avatar y clave, dependiendo de la opcion de se le pase al sevidor
     * @param evt
     */
    private void jBOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOKActionPerformed
        // TODO add your handling code here:
        if (jTextNombre.getText().equalsIgnoreCase("")
                || jTextApellido.getText().equalsIgnoreCase("")
                || jTextNickname.getText().equalsIgnoreCase("")
                || jPClave.getText().equalsIgnoreCase("")
                || jTextAvatar.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "All fields must be written in.");
        } else {
            if (confirm1.equalsIgnoreCase("1")) {
                String mensaje = ConexionJsockets.solicitudServidor8(jTextNickname.getText(), jTextNombre.getText(), confirm1);
                String subArg[] = mensaje.split(":");
                System.out.println("Se modifico correctamente el nombre a = " + subArg[1]);
            }
            if (confirm1.equalsIgnoreCase("2")) {
                String mensaje = ConexionJsockets.solicitudServidor8(jTextNickname.getText(), jTextApellido.getText(), confirm1);
                String subArg[] = mensaje.split(":");
                System.out.println("Se modifico correctamente el apellido a = " + subArg[1]);
            }
            if (confirm1.equalsIgnoreCase("3")) {
                String mensaje = ConexionJsockets.solicitudServidor8(jTextNickname.getText(), jPClave.getText(), confirm1);
                String subArg[] = mensaje.split(":");
                System.out.println("Se modifico correctamente la clave a = " + subArg[1]);
            }
            if (confirm1.equalsIgnoreCase("4")) {
                String mensaje = ConexionJsockets.solicitudServidor8(jTextNickname.getText(), jTextAvatar.getText(), confirm1);
                String subArg[] = mensaje.split(":");
                System.out.println("Se modiifico correctamente el avatar a = " + subArg[1]);
            }
        }
        this.dispose();
}//GEN-LAST:event_jBOKActionPerformed

    /**
     * boton de cancelar hace que se destruya la ventana
     * @param evt
     */
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_jBCancelarActionPerformed

    /**
     * Modifica el avatar, este boton lleva a la ventana de imagenes para seleccionarla
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Imagenes ventanaImagenes;
        ventanaImagenes = new Imagenes(this, jTextAvatar);
        ventanaImagenes.setVisible(true);
        confirm1 = "4";
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Modifica la clave del usuario
     * @param evt
     */
    private void jBclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclaveActionPerformed
        // TODO add your handling code here:
        jPClave.enable(true);
        confirm1 = "3";
}//GEN-LAST:event_jBclaveActionPerformed

    private void jTextNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNicknameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextNicknameActionPerformed

    /**
     * Modifica el apellido del usuario
     * @param evt
     */
    private void jBlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlastNameActionPerformed
        // TODO add your handling code here:
        jTextApellido.enable(true);
        confirm1 = "2";
}//GEN-LAST:event_jBlastNameActionPerformed

    /**
     * modifica el nombre del usuario
     * @param evt
     */
    private void jBnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnameActionPerformed
        // TODO add your handling code here:
        jTextNombre.enable(true);
        confirm1 = "1";
}//GEN-LAST:event_jBnameActionPerformed

    private void jTextFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFechaNacActionPerformed

    /**
     * Es la accion del boton par modificar el avatar del usuario
     * @param evt
     */
    /**
     * El boton candelar destruye la ventana
     * @param evt
     */
    /**
     * El boton ok, modifica dependiendo de la opcion (confirm1) que se haya activado
     * @param evt
     */
    /**
     * El boton que modifica el nombre del usuario
     * @param evt
     */
    /**
     * el Boton para modificar el apellido del usuario
     * @param evt
     */
    /**
     * el Boton para modificar la clave
     * @param evt
     */
    /**
     * Para agarrar la fecha del Jcalendar con el formato establecido y pasarla a String
     * @param Jdc es del tipo de la libreria Jcalendar
     * @return retorna el string con la fecha
     */
    public static String getFecha(JDateChooser Jdc)
     {
        Calendar fechadate;
        fechadate=Jdc.getCalendar();
        SimpleDateFormat xlsDate;
        xlsDate = new SimpleDateFormat("dd/MM/yyyy");
        String auxiliar = xlsDate.format(fechadate.getTime());

        return auxiliar;

      }

    /**
     * Escribe en la ventana Modificar los datos actuales del usuario
     * @param clave es la clave actual del usuario
     * @param nickname es el nickname actual del usuario, el nickname no se modifica
     * @param nombre es el nombre actual del usuario
     * @param apellido es el apellido actual del usuario
     * @param avatar es el avatar actual del usuario
     * @param FechaNac es la fecha de nac actual del usuario
     */
    public void setDatosUsuarioModificar(String clave, String nickname, String nombre, String apellido, String avatar,String fechaNac) {

        jTextNombre.setText(nombre);
        jTextApellido.setText(apellido);
        jPClave.setText(clave);
        jTextAvatar.setText(avatar);
        jTextNickname.setText(nickname);
        jTextFechaNac.setText(fechaNac);

    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBOK;
    private javax.swing.JButton jBclave;
    private javax.swing.JButton jBlastName;
    private javax.swing.JButton jBname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLNombre2;
    private javax.swing.JLabel jLNombre3;
    private javax.swing.JLabel jLNombre4;
    private javax.swing.JLabel jLNombre5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPClave;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextAvatar;
    private javax.swing.JTextField jTextFechaNac;
    private javax.swing.JTextField jTextNickname;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

    static String confirm1 = "0";
    javax.swing.JFrame ventanaPadre;
}
