package Modulos;

import static java.lang.System.exit;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        NombreDeTienda = new javax.swing.JLabel();
        Logotipo = new javax.swing.JLabel();
        LetraUsuario = new javax.swing.JLabel();
        TXT_USERNAME = new javax.swing.JTextField();
        LetraContraseña = new javax.swing.JLabel();
        TXT_PASSWORD = new javax.swing.JPasswordField();
        INGRESAR = new javax.swing.JButton();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("X");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        NombreDeTienda.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        NombreDeTienda.setForeground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeTienda.setText("Tienda La Moda");
        getContentPane().add(NombreDeTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        Logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(Logotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 200, 280));

        LetraUsuario.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        LetraUsuario.setForeground(new java.awt.Color(255, 255, 204));
        LetraUsuario.setText("Usuario");
        getContentPane().add(LetraUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        TXT_USERNAME.setBackground(new java.awt.Color(204, 204, 204));
        TXT_USERNAME.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        getContentPane().add(TXT_USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 210, -1));

        LetraContraseña.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        LetraContraseña.setForeground(new java.awt.Color(255, 255, 204));
        LetraContraseña.setText("Contraseña");
        getContentPane().add(LetraContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        TXT_PASSWORD.setBackground(new java.awt.Color(204, 204, 204));
        TXT_PASSWORD.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        getContentPane().add(TXT_PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 210, -1));

        INGRESAR.setBackground(new java.awt.Color(153, 153, 153));
        INGRESAR.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        INGRESAR.setText("INGRESAR");
        INGRESAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INGRESARMouseClicked(evt);
            }
        });
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(INGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        ImagenFondo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        ImagenFondo.setAlignmentY(0.0F);
        getContentPane().add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INGRESARActionPerformed

    private void INGRESARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INGRESARMouseClicked
        String user = TXT_USERNAME.getText();
        String pass = TXT_PASSWORD.getText();
        String passreal;
        try {
            
            Statement state = General.database.createStatement();
            //ResultSet almacena los datos generados de la consulta para extraer los datos
            ResultSet result = state.executeQuery("SELECT password FROM empleados WHERE (username='" + user + "')"); //Ejecución de consulta
            result.next();
            passreal = result.getString(1);
            result.close(); //HILOS PARA EVITAR ERROR

            if (pass.equals(passreal)) {
                Main_Menu ventana = new Main_Menu();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "AVISO", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception EX) {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "AVISO", JOptionPane.WARNING_MESSAGE);
            
        }

    }//GEN-LAST:event_INGRESARMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESAR;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel LetraContraseña;
    private javax.swing.JLabel LetraUsuario;
    private javax.swing.JLabel Logotipo;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JPasswordField TXT_PASSWORD;
    private javax.swing.JTextField TXT_USERNAME;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
