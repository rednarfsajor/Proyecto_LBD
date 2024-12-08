
package Modulos.Proveedor;

//Librerias para crear conexion y para insertar datos en la base de datos


import Modulos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static java.lang.System.exit;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;
public class Insertar_Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Insertar_Proveedor() {
        initComponents();
        //Lo siguiente siempre si va a hacer igual para cada JFrame que se conectará a la base de datos
        //Conexion db= new Conexion();
        //database=db.getConnection();
    }
    private boolean Validar(){
        try{
        String SQL = "SELECT codigo FROM proveedores WHERE (cedula='"+TXT_CED.getText()+"')";
        Statement state=General.database.createStatement();
        ResultSet result=state.executeQuery(SQL);
        result.next();
            if (result.getString(1).isBlank()) {
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception ex){
            return true;
        }
    }
    //Atributos de conexion utilizados al iniciar el JFrame
    //Conexion db;
    //Connection database;
  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_CED = new javax.swing.JTextField();
        TXT_NOMBRE = new javax.swing.JTextField();
        TXT_TELEFONO = new javax.swing.JTextField();
        TXT_CORREO = new javax.swing.JTextField();
        TXT_DIRECCION = new javax.swing.JTextField();
        COMBO_TIPO = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LIMPIAR = new javax.swing.JButton();
        CREAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TXT_PRODUCTOS = new javax.swing.JTextField();
        BACK = new javax.swing.JLabel();
        NombreDeTienda = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1124, 749));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        TXT_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOMBREActionPerformed(evt);
            }
        });

        COMBO_TIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisica", "Juridica" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Cédula");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Tipo de Persona");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Nombre Completo");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Dirección");

        LIMPIAR.setBackground(new java.awt.Color(255, 255, 204));
        LIMPIAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LIMPIAR.setText("Limpiar");
        LIMPIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LIMPIARMouseClicked(evt);
            }
        });
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        CREAR.setBackground(new java.awt.Color(255, 255, 204));
        CREAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CREAR.setText("Crear");
        CREAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREARMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Productos");

        BACK.setFont(new java.awt.Font("Bell MT", 0, 40)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 153));
        BACK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BACK.setText("«");
        BACK.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });

        NombreDeTienda.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        NombreDeTienda.setForeground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeTienda.setText("Tienda La Moda");

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("PROVEEDOR");

        EXIT.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 153));
        EXIT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EXIT.setText("X");
        EXIT.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BACK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EXIT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(NombreDeTienda)
                                    .addComponent(jLabel7))
                                .addGap(212, 212, 212)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_PRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LIMPIAR)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CREAR))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TXT_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(COMBO_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(TXT_CED, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(67, 67, 67))))))
                        .addGap(228, 228, 228))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreDeTienda)
                    .addComponent(EXIT)
                    .addComponent(BACK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_CED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMBO_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXT_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TXT_PRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIMPIAR)
                    .addComponent(CREAR))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOMBREActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREARMouseClicked
        if(TXT_CED.getText().length()==9&&!TXT_NOMBRE.getText().isBlank()&&!TXT_PRODUCTOS.getText().isBlank()){
            if(Validar()){
                try{
                    //Insertar sera la variable de tipo Prepared Statemnte obtenida de la conexin de base de datos con la consulta INSERT INTO
                   
                   CallableStatement insertar= General.database.prepareCall("{call INSERTAR_PROVEEDOR(" + Integer.parseInt(TXT_CED.getText()) + ",'" + TXT_NOMBRE.getText() + "','" + COMBO_TIPO.getSelectedItem().toString() +"','" + TXT_TELEFONO.getText() + "','" + TXT_DIRECCION.getText() + "','" + TXT_CORREO.getText() + "','" + TXT_PRODUCTOS.getText()+ "')}");
                   
                    
                   //Variable para saber si la ejecución se realiza correctamente
                   int A=insertar.executeUpdate(); //ExecuteUpdate() realiza la sentencia INSERT INTO + datos de TXT en la base de datos y la actualiza y retorna un valor de acuerdo al exito 
                   if (A>0) { //Si fue exitoso
                       insertar.close();
                       JOptionPane.showMessageDialog(null, "Registro exitoso");
                       this.BACKMouseClicked(evt);
                   }
                   else{//Si fallo el insertar proveedor
                       JOptionPane.showMessageDialog(null, "Registro fallido");
                   }
               }

               catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR PROVEEDOR (" + ex + ")", "AVISO", JOptionPane.ERROR_MESSAGE); 
               }
            }
            else{
                JOptionPane.showMessageDialog(null, "Ya existe un proveedor registrado con la cédula ingresada", "AVISO", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
        


        
    }//GEN-LAST:event_CREARMouseClicked

    private void LIMPIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPIARMouseClicked
        TXT_CED.setText("");
        TXT_NOMBRE.setText("");
        TXT_TELEFONO.setText("");
        TXT_DIRECCION.setText("");
        TXT_CORREO.setText("");
        COMBO_TIPO.setSelectedIndex(0);
        TXT_PRODUCTOS.setText("");
    }//GEN-LAST:event_LIMPIARMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        Main_Menu ventana = new Main_Menu();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BACKMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        exit(0);
    }//GEN-LAST:event_EXITMouseClicked

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
            java.util.logging.Logger.getLogger(Insertar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Insertar_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JComboBox<String> COMBO_TIPO;
    private javax.swing.JButton CREAR;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JTextField TXT_CED;
    private javax.swing.JTextField TXT_CORREO;
    private javax.swing.JTextField TXT_DIRECCION;
    private javax.swing.JTextField TXT_NOMBRE;
    private javax.swing.JTextField TXT_PRODUCTOS;
    private javax.swing.JTextField TXT_TELEFONO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
