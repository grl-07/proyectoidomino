/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaLogin.java
 *
 * Created on 08/08/2010, 10:04:23 AM
 */
package View;
import javax.swing.JOptionPane;
import Logica.*;

/**
 *
 * @author Alberly
 */
public class VentanaLogin extends javax.swing.JFrame {

    /** Creates new form VentanaLogin */
    public VentanaLogin() {
        initComponents();
        inicializarComponentesPropios();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbliDomino = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        txtNickname = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbliDomino.setFont(new java.awt.Font("Calibri", 0, 24));
        lbliDomino.setText("iDomino");

        lblPassword.setFont(new java.awt.Font("Calibri", 0, 14));
        lblPassword.setText("Password");

        lblNickname.setFont(new java.awt.Font("Calibri", 0, 14));
        lblNickname.setText("Nickname");

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOK.setText("Sign in");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnSignUp)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNickname)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbliDomino)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPassword, 0, 0, Short.MAX_VALUE)
                                    .addComponent(txtNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGap(17, 17, 17)
                                .addComponent(btnOK)))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbliDomino)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNickname)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(btnOK)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSignUp))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        new VentanaRegistro().setVisible(true);

    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String mensaje = ConexionJsockets.solicitudServidor1(txtNickname, txtPassword);
        if (mensaje.equals("TRUE")) {
            boolean confirm;
            confirm = false;
            confirm = Conector.comprobarDatos(txtNickname, txtPassword);

            if (confirm == true) {
                VentanaMenu ventanaMenu;
                ventanaMenu = new VentanaMenu(this);
                ventanaMenu.setVisible(true);

                ventanaMenu.setDatosUsuario(Conector.obtenerNombre(txtNickname),Conector.obtenerApellido(txtNickname),txtNickname.getText());

                //ventanaMenu.setDatosUsuario("SHERYL","RAVELO");
                //new VentanaMenu().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Nickname or Password. Please try again");
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void inicializarComponentesPropios() {
        Conector.inicializarEstructuras();
        Datos.inicializarListasDeDatos();
        Conector.solicitarCargaDeDatos();
        Conector.solicitarImpresionPiedras();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lbliDomino;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
