package cliente.presentacion;
import javax.swing.*;
import cliente.logica.FuncionGeneral;


/**
 *
 * @author CASITA
 */
public class Imagenes extends javax.swing.JFrame {

    /** Creates new form Imagenes */
    /*public Imagenes(JFrame ventanaPadre, JTextField nombre, JTextField apellido, JTextField nickname, JTextField clave, JTextField avatar) {
        initComponents();
        this.username = nickname.getText();
        this.apellido = apellido.getText();
        this.nombre = nombre.getText();
        this.clave = nombre.getText();
        this.txtavatar = avatar;
        this.ventanaPadre = ventanaPadre;
    }*/

    /*public Imagenes(JTextField nickname, JTextField avatar){
        initComponents();
        this.username = nickname.getText();
        this.txtavatar = avatar;
    }*/

    public Imagenes(JFrame ventanaPadre){
        initComponents();
        this.ventanaPadre = ventanaPadre;
    }
    public Imagenes(JFrame ventanaPadre,JTextField avatar){
        initComponents();
        this.ventanaPadre = ventanaPadre;
        this.avatar = avatar;

    }

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

        jLabel7 = new javax.swing.JLabel();
        jRadioBMariposa = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioBDog = new javax.swing.JRadioButton();
        jRadioBCoco = new javax.swing.JRadioButton();
        jButtonAceptar = new javax.swing.JButton();
        jRadioBTortuga = new javax.swing.JRadioButton();
        jRadioBDomino = new javax.swing.JRadioButton();
        jRadioBSombrilla = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen13.png"))); // NOI18N

        jRadioBMariposa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBMariposaActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen12.jpg"))); // NOI18N

        jRadioBDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBDogActionPerformed(evt);
            }
        });

        jRadioBCoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBCocoActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("OK");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jRadioBTortuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBTortugaActionPerformed(evt);
            }
        });

        jRadioBDomino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBDominoActionPerformed(evt);
            }
        });

        jRadioBSombrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBSombrillaActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen10.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen8.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen9.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/presentacion/resources/Imagen6.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jRadioBMariposa)
                                .addGap(139, 139, 139)
                                .addComponent(jRadioBCoco)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jRadioBDomino))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButtonAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jRadioBDog)
                                .addGap(166, 166, 166)
                                .addComponent(jRadioBSombrilla)))
                        .addGap(94, 94, 94)
                        .addComponent(jRadioBTortuga)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioBDog)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioBTortuga))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioBSombrilla)))
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(jRadioBDomino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioBCoco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioBMariposa)))
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBMariposaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBMariposaActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        //System.out.println("avatar = " + avatar.getText());


    }//GEN-LAST:event_jRadioBMariposaActionPerformed

    private void jRadioBDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBDogActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        //System.out.println("avatar = " + avatar.getText());



    }//GEN-LAST:event_jRadioBDogActionPerformed

    private void jRadioBCocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBCocoActionPerformed
        // TODO add your handling code here:

        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        //System.out.println("avatar = " + avatar.getText());

    }//GEN-LAST:event_jRadioBCocoActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        ventanaPadre.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioBTortugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBTortugaActionPerformed
        // TODO add your handling code here:

        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        //System.out.println("avatar = " + avatar.getText());

    }//GEN-LAST:event_jRadioBTortugaActionPerformed

    private void jRadioBDominoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBDominoActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBSombrilla);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        //System.out.println("avatar = " + avatar.getText());

    }//GEN-LAST:event_jRadioBDominoActionPerformed

    private void jRadioBSombrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBSombrillaActionPerformed
        // TODO add your handling code here:
        FuncionGeneral.desmarcarRadioButton(jRadioBDog);
        FuncionGeneral.desmarcarRadioButton(jRadioBTortuga);
        FuncionGeneral.desmarcarRadioButton(jRadioBMariposa);
        FuncionGeneral.desmarcarRadioButton(jRadioBCoco);
        FuncionGeneral.desmarcarRadioButton(jRadioBDomino);

        setearAvatar(avatar,jRadioBDog, jRadioBSombrilla,jRadioBTortuga,jRadioBMariposa,jRadioBCoco,jRadioBDomino);
        //System.out.println("avatar = " + avatar.getText());
}//GEN-LAST:event_jRadioBSombrillaActionPerformed

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
        //avatar.setText("Dog");
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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