
package Modulos.Producto;

//Librerias para crear conexion y para insertar datos en la base de datos

import Modulos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static java.lang.System.exit;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insertar_Producto extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Insertar_Producto() {
        initComponents();
        //Lo siguiente siempre si va a hacer igual para cada JFrame que se conectará a la base de datos
        //Conexion db= new Conexion();
        //database=db.getConnection();
    }

    private boolean Validar(){
        try{
        String SQL = "SELECT codigo FROM productos WHERE (codigo='"+TXT_COD.getText()+"')";
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_COD = new javax.swing.JTextField();
        TXT_PRECIO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LIMPIAR = new javax.swing.JButton();
        CREAR = new javax.swing.JButton();
        TXT_CANT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXT_NOMBRE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXT_DESCRIPCION = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        NombreDeTienda = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1124, 749));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Cantidad en Inventario");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Precio");

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Nombre");

        TXT_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOMBREActionPerformed(evt);
            }
        });

        TXT_DESCRIPCION.setColumns(20);
        TXT_DESCRIPCION.setRows(5);
        jScrollPane1.setViewportView(TXT_DESCRIPCION);

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("PRODUCTO");

        NombreDeTienda.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        NombreDeTienda.setForeground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeTienda.setText("Tienda La Moda");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXT_COD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_CANT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LIMPIAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CREAR)))
                .addGap(162, 162, 162))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_COD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT_CANT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIMPIAR)
                    .addComponent(CREAR))
                .addContainerGap(185, Short.MAX_VALUE))
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

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREARMouseClicked
        if(TXT_COD.getText().length()==5&&!TXT_NOMBRE.getText().isBlank()&&!TXT_CANT.getText().isBlank()&&!TXT_PRECIO.getText().isBlank()){
            if(Validar()){
               try{
                    //Insertar sera la variable de tipo Prepared Statemnte obtenida de la conexin de base de datos con la consulta INSERT INTO
                   PreparedStatement insertar= General.database.prepareStatement("INSERT INTO productos(codigo,nombre,descripcion,cantidad,precio) VALUES (?,?,?,?,?)");
                   //Tomo los datos de cada TXT para insertarlo en la base de datos junto con la sentencia SQL
                   insertar.setString(1, TXT_COD.getText());
                   insertar.setString(2, TXT_NOMBRE.getText());
                   insertar.setString(3, TXT_DESCRIPCION.getText());
                   insertar.setString(4,  TXT_CANT.getText());
                   insertar.setString(5, TXT_PRECIO.getText());
                   //Variable para saber si la ejecución se realiza correctamente
                   int A=insertar.executeUpdate(); //ExecuteUpdate() realiza la sentencia INSERT INTO + datos de TXT en la base de datos y la actualiza y retorna un valor de acuerdo al exito 
                   if (A>0) { //Si fue exitoso
                       insertar.close();
                       JOptionPane.showMessageDialog(null, "Registro exitoso");
                       this.BACKMouseClicked(evt);
                   }
                   else{//Si fallo el insertar cliente
                       JOptionPane.showMessageDialog(null, "Registro fallido");
                   }
               }

               catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR PRODUCTO (" + ex + ")", "AVISO", JOptionPane.ERROR_MESSAGE);
               }
            }
            else{
                JOptionPane.showMessageDialog(null, "Ya existe un producto registrado con el código ingresado", "AVISO", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos", "AVISO", JOptionPane.WARNING_MESSAGE);
        }


        
        
    }//GEN-LAST:event_CREARMouseClicked

    private void LIMPIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPIARMouseClicked
        TXT_COD.setText("");
        TXT_DESCRIPCION.setText("");
        TXT_CANT.setText("");
        TXT_PRECIO.setText("");
    }//GEN-LAST:event_LIMPIARMouseClicked

    private void TXT_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOMBREActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Insertar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JButton CREAR;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JTextField TXT_CANT;
    private javax.swing.JTextField TXT_COD;
    private javax.swing.JTextArea TXT_DESCRIPCION;
    private javax.swing.JTextField TXT_NOMBRE;
    private javax.swing.JTextField TXT_PRECIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}