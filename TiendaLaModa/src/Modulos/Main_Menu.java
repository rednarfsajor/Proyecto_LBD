package Modulos;

import static java.lang.System.exit;
import Modulos.Cliente.*;
import Modulos.Empleado.*;
import Modulos.Producto.*;
import Modulos.Proveedor.*;
import Modulos.Venta.*;

public class Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Main_Menu() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        PRODUCTOS = new javax.swing.JButton();
        PROVEEDORES = new javax.swing.JButton();
        CLIENTES = new javax.swing.JButton();
        VENTAS = new javax.swing.JButton();
        EMPLEADOS = new javax.swing.JButton();
        NombreDeTienda = new javax.swing.JLabel();
        Logotipo = new javax.swing.JLabel();
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

        PRODUCTOS.setBackground(new java.awt.Color(204, 204, 204));
        PRODUCTOS.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        PRODUCTOS.setForeground(new java.awt.Color(0, 51, 51));
        PRODUCTOS.setText("PRODUCTOS");
        PRODUCTOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRODUCTOSMouseClicked(evt);
            }
        });
        PRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCTOSActionPerformed(evt);
            }
        });
        getContentPane().add(PRODUCTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 140, 40));

        PROVEEDORES.setBackground(new java.awt.Color(204, 204, 204));
        PROVEEDORES.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        PROVEEDORES.setForeground(new java.awt.Color(0, 51, 51));
        PROVEEDORES.setText("PROVEEDORES");
        PROVEEDORES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROVEEDORESMouseClicked(evt);
            }
        });
        PROVEEDORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROVEEDORESActionPerformed(evt);
            }
        });
        getContentPane().add(PROVEEDORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, 40));

        CLIENTES.setBackground(new java.awt.Color(204, 204, 204));
        CLIENTES.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        CLIENTES.setForeground(new java.awt.Color(0, 51, 51));
        CLIENTES.setText("CLIENTES");
        CLIENTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLIENTESMouseClicked(evt);
            }
        });
        CLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENTESActionPerformed(evt);
            }
        });
        getContentPane().add(CLIENTES, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 140, 40));

        VENTAS.setBackground(new java.awt.Color(204, 204, 204));
        VENTAS.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        VENTAS.setForeground(new java.awt.Color(0, 51, 51));
        VENTAS.setText("VENTAS");
        VENTAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VENTASMouseClicked(evt);
            }
        });
        VENTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENTASActionPerformed(evt);
            }
        });
        getContentPane().add(VENTAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 140, 40));

        EMPLEADOS.setBackground(new java.awt.Color(204, 204, 204));
        EMPLEADOS.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        EMPLEADOS.setForeground(new java.awt.Color(0, 51, 51));
        EMPLEADOS.setText("EMPLEADOS");
        EMPLEADOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPLEADOSMouseClicked(evt);
            }
        });
        EMPLEADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPLEADOSActionPerformed(evt);
            }
        });
        getContentPane().add(EMPLEADOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 140, 40));

        NombreDeTienda.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        NombreDeTienda.setForeground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeTienda.setText("Tienda La Moda");
        getContentPane().add(NombreDeTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        Logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(Logotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, 280));

        ImagenFondo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        ImagenFondo.setAlignmentY(0.0F);
        getContentPane().add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void CLIENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLIENTESMouseClicked
        Clientes ventana =  new Clientes();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CLIENTESMouseClicked

    private void CLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENTESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLIENTESActionPerformed

    private void EMPLEADOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPLEADOSMouseClicked
        Empleados ventana = new Empleados();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EMPLEADOSMouseClicked

    private void EMPLEADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPLEADOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMPLEADOSActionPerformed

    private void PROVEEDORESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROVEEDORESMouseClicked
        Proveedores ventana = new Proveedores();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PROVEEDORESMouseClicked

    private void PROVEEDORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROVEEDORESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROVEEDORESActionPerformed

    private void PRODUCTOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODUCTOSMouseClicked
        Productos ventana = new Productos();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PRODUCTOSMouseClicked

    private void PRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRODUCTOSActionPerformed

    private void VENTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VENTASMouseClicked
        Ventas ventana = new Ventas();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VENTASMouseClicked

    private void VENTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENTASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VENTASActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLIENTES;
    private javax.swing.JButton EMPLEADOS;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel Logotipo;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JButton PRODUCTOS;
    private javax.swing.JButton PROVEEDORES;
    private javax.swing.JButton VENTAS;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
