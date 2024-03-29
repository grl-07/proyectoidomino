package cliente.presentacion;
import javax.swing.*;
import cliente.logica.FuncionGeneral;


public class Imagenes extends javax.swing.JFrame {

    /**
     * Constructor
     * @param ventanaPadre para establecer la ventana padre de Imagenes
     */
    public Imagenes(JFrame ventanaPadre){
        initComponents();
        this.ventanaPadre = ventanaPadre;
    }

    /**
     * Constructor
     * @param ventanaPadre para establecer la ventana padre de Imagenes
     * @param avatar para establecer el avatar
     */
    public Imagenes(JFrame ventanaPadre,JTextField avatar){
        initComponents();
        this.ventanaPadre = ventanaPadre;
        this.avatar = avatar;

    }

    /**
     * Constructor
     */
    public Imagenes(){
        initComponents();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioBTortuga = new javax.swing.JRadioButton();
        jRadioBSombrilla = new javax.swing.JRadioButton();
        jRadioBDog = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioBDomino = new javax.swing.JRadioButton();
        jRadioBCoco = new javax.swing.JRadioButton();
        jRadioBMariposa = new javax.swing.JRadioButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen10.jpg"))); // NOI18N
        jLabel9.setBounds(10, 10, 128, 128);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen8.png"))); // NOI18N
        jLabel10.setBounds(200, 10, 128, 128);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen9.jpg"))); // NOI18N
        jLabel11.setBounds(360, 10, 128, 128);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioBTortuga.setBackground(new java.awt.Color(153, 51, 0));
        jRadioBTortuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBTortugaActionPerformed(evt);
            }
        });
        jRadioBTortuga.setBounds(420, 160, 21, 21);
        jLayeredPane1.add(jRadioBTortuga, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioBSombrilla.setBackground(new java.awt.Color(153, 51, 0));
        jRadioBSombrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBSombrillaActionPerformed(evt);
            }
        });
        jRadioBSombrilla.setBounds(230, 160, 21, 21);
        jLayeredPane1.add(jRadioBSombrilla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioBDog.setBackground(new java.awt.Color(153, 51, 0));
        jRadioBDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBDogActionPerformed(evt);
            }
        });
        jRadioBDog.setBounds(70, 160, 21, 21);
        jLayeredPane1.add(jRadioBDog, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen6.png"))); // NOI18N
        jLabel12.setBounds(20, 220, 128, 128);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen12.jpg"))); // NOI18N
        jLabel8.setBounds(190, 230, 120, 119);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen13.png"))); // NOI18N
        jLabel7.setBounds(360, 230, 131, 98);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioBDomino.setBackground(new java.awt.Color(153, 51, 0));
        jRadioBDomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBDominoActionPerformed(evt);
            }
        });
        jRadioBDomino.setBounds(420, 380, 21, 21);
        jLayeredPane1.add(jRadioBDomino, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioBCoco.setBackground(new java.awt.Color(153, 51, 0));
        jRadioBCoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCocoActionPerformed(evt);
            }
        });
        jRadioBCoco.setBounds(240, 380, 21, 21);
        jLayeredPane1.add(jRadioBCoco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioBMariposa.setBackground(new java.awt.Color(153, 51, 0));
        jRadioBMariposa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBMariposaActionPerformed(evt);
            }
        });
        jRadioBMariposa.setBounds(70, 380, 21, 21);
        jLayeredPane1.add(jRadioBMariposa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonAceptar.setFont(new java.awt.Font("Calibri", 1, 14));
        jButtonAceptar.setForeground(new java.awt.Color(153, 51, 0));
        jButtonAceptar.setText("OK");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jButtonAceptar.setBounds(220, 440, 60, 25);
        jLayeredPane1.add(jButtonAceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Fondo-Madera1.jpg"))); // NOI18N
        jLabel1.setBounds(0, -6, 510, 490);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que marca el radio button de la tortuga y desmarca el resto. Llama a una función para setear el nombre del avatar seleccionado en el textField de "Avatar"
     * @param evt
     */
    private void jRadioBTortugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBTortugaActionPerformed
        // TODO add your handling code here:

        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
       
    }//GEN-LAST:event_jRadioBTortugaActionPerformed

    /**
     * Método que marca el radio button de la sombrilla y desmarca el resto. Llama a una función para setear el nombre del avatar seleccionado en el textField de "Avatar"
     * @param evt
     */
    private void jRadioBSombrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBSombrillaActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
       
}//GEN-LAST:event_jRadioBSombrillaActionPerformed

    /**
     * Método que marca el radio button del perro y desmarca el resto. Llama a una función para setear el nombre del avatar seleccionado en el textField de "Avatar"
     * @param evt
     */
    private void jRadioBDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBDogActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
      
    }//GEN-LAST:event_jRadioBDogActionPerformed


    /**
     * Método que marca el radio button del dominó y desmarca el resto. Llama a una función para setear el nombre del avatar seleccionado en el textField de "Avatar"
     * @param evt
     */
    private void jRadioBDominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBDominoActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        
    }//GEN-LAST:event_jRadioBDominoActionPerformed

    /**
     * Método que marca el radio button del coco y desmarca el resto. Llama a una función para setear el nombre del avatar seleccionado en el textField de "Avatar"
     * @param evt
     */
    private void jRadioBCocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBCocoActionPerformed
        // TODO add your handling code here:

        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
      
    }//GEN-LAST:event_jRadioBCocoActionPerformed


    /**
     * Método que marca el radio button de la mariposa y desmarca el resto. Llama a una función para setear el nombre del avatar seleccionado en el textField de "Avatar"
     * @param evt
     */
    private void jRadioBMariposaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBMariposaActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
       

    }//GEN-LAST:event_jRadioBMariposaActionPerformed


    /**
     * Este método cierra esta ventana de Imágenes y regresa a su ventana padre VentanaLogin
     * @param evt
     */
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        ventanaPadre.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButtonAceptarActionPerformed

    /**
     * Este método setea la imagen seleccionada al textField de Avatar "txtavatar"
     * @param txtavatar texfield donde se va a setear el nombre del avatar seleccionado
     * @param perro radiobutton
     * @param sombrilla radiobutton
     * @param tortuga radiobutton
     * @param mariposa radiobutton
     * @param coco radiobutton
     * @param domino radiobutton
     */
    public void setearAvatar(JTextField txtavatar,JRadioButton perro, JRadioButton sombrilla, JRadioButton tortuga, JRadioButton mariposa, JRadioButton coco, JRadioButton domino) {
       

        if (jRadioBDog.isSelected()) {
            txtavatar.setText("Dog");
            //setAvatar(txtavatar);
            jRadioBSombrilla.setSelected(false);
            jRadioBTortuga.setSelected(false);
            jRadioBMariposa.setSelected(false);
            jRadioBCoco.setSelected(false);
            jRadioBDomino.setSelected(false);
        }

        if (jRadioBSombrilla.isSelected()) {
            txtavatar.setText("Umbrella");
            jRadioBDog.setSelected(false);
            jRadioBTortuga.setSelected(false);
            jRadioBMariposa.setSelected(false);
            jRadioBCoco.setSelected(false);
            jRadioBDomino.setSelected(false);
        }

        if (jRadioBTortuga.isSelected()) {
            txtavatar.setText("Turtle");
            jRadioBDog.setSelected(false);
            jRadioBSombrilla.setSelected(false);
            jRadioBMariposa.setSelected(false);
            jRadioBCoco.setSelected(false);
            jRadioBDomino.setSelected(false);
        }

        if (jRadioBMariposa.isSelected()) {
            txtavatar.setText("Butterfly");
            jRadioBDog.setSelected(false);
            jRadioBSombrilla.setSelected(false);
            jRadioBTortuga.setSelected(false);
            jRadioBCoco.setSelected(false);
            jRadioBDomino.setSelected(false);
        }


        if (jRadioBCoco.isSelected()) {
            txtavatar.setText("Bug");
            jRadioBDog.setSelected(false);
            jRadioBSombrilla.setSelected(false);
            jRadioBTortuga.setSelected(false);
            jRadioBMariposa.setSelected(false);
            jRadioBDomino.setSelected(false);
        }

        if (jRadioBDomino.isSelected()) {
            txtavatar.setText("Domino");
            jRadioBDog.setSelected(false);
            jRadioBSombrilla.setSelected(false);
            jRadioBTortuga.setSelected(false);
            jRadioBMariposa.setSelected(false);
            jRadioBCoco.setSelected(false);
        }
    }

    public String setAvatar() {
        return avatar.getText();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imagenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioBCoco;
    private javax.swing.JRadioButton jRadioBDog;
    private javax.swing.JRadioButton jRadioBDomino;
    private javax.swing.JRadioButton jRadioBMariposa;
    private javax.swing.JRadioButton jRadioBSombrilla;
    private javax.swing.JRadioButton jRadioBTortuga;
    // End of variables declaration//GEN-END:variables


    JFrame ventanaPadre;
    static JTextField avatar;
}
