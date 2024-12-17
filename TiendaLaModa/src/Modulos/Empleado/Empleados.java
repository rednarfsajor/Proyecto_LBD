
package Modulos.Empleado;

//Librerias necesarias para la conexion y lectura de datos de la base de datos
import Modulos.*;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //Para editar nuestro JTable
import Clases.EmpleadoU; //Lllamar a la clase Cliente para instanciar un objeti de tipo Cliente
import java.sql.Types;

public class Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Empleados() {
        initComponents();
        //Conexion
        //Conexion db= new Conexion();
        //database=db.getConnection();
    }

    //Atributos de conexion
    //Conexion db;
    //Connection database;
    
    //Atributo de consulta
    String SQL;
    
    //Atributo cedula que almacena la cedula buscada
    String ced=null;
    
    //Objeto cliente creado al consultar una cedula/cliente en especifico, es para transmitirlo al JFrame que modifica, en caso de que vaya a modificar un cliente
    EmpleadoU employee;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_CED = new javax.swing.JTextField();
        TODO = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        INSERTAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EMPLEADOS = new javax.swing.JTable();
        NombreDeTienda = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        TODO.setBackground(new java.awt.Color(255, 255, 204));
        TODO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TODO.setText("Ver Todo");
        TODO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TODOMouseClicked(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(255, 255, 204));
        BUSCAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BUSCAR.setText("Buscar");
        BUSCAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUSCARMouseClicked(evt);
            }
        });
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(255, 255, 204));
        MODIFICAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MODIFICAR.setText("Modificar");
        MODIFICAR.setVisible(false);
        MODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MODIFICARMouseClicked(evt);
            }
        });
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(255, 255, 204));
        ELIMINAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ELIMINAR.setText("Eliminar");
        ELIMINAR.setVisible(false);
        ELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELIMINARMouseClicked(evt);
            }
        });
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        INSERTAR.setBackground(new java.awt.Color(255, 255, 204));
        INSERTAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        INSERTAR.setText("Insertar");
        INSERTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INSERTARMouseClicked(evt);
            }
        });

        EMPLEADOS.setBackground(new java.awt.Color(0, 204, 204));
        EMPLEADOS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        EMPLEADOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Tipo", "Teléfono", "Dirección", "Correo", "Puesto", "Salario"
            }
        ));
        EMPLEADOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPLEADOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EMPLEADOS);

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

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("EMPLEADOS");

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

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cédula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_CED, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BUSCAR)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BACK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NombreDeTienda)
                            .addComponent(jLabel3))
                        .addGap(169, 169, 169)
                        .addComponent(EXIT)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MODIFICAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ELIMINAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(INSERTAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TODO)))
                        .addGap(18, 18, 18))))
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
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT_CED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MODIFICAR)
                    .addComponent(ELIMINAR)
                    .addComponent(INSERTAR)
                    .addComponent(TODO))
                .addGap(12, 12, 12))
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void TODOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TODOMouseClicked
        ced=null; //Cedula null al mostrar todos los clientes
        
        String []datos=new String[8]; //Vector/lista para insertarlas en el JTable
        try{
            //Creación del modelo del JTable
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cédula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Dirección");
            modelo.addColumn("Correo");
            modelo.addColumn("Puesto");
            modelo.addColumn("Salario");
            
            CallableStatement ver = General.database.prepareCall("{call VER_EMPLEADOS(?)}");
            ver.registerOutParameter(1, Types.REF_CURSOR);
            ver.execute();
            ResultSet rs=(ResultSet)ver.getObject(1);
            
            while(rs.next()){ //Se repite hasta que no haya clientes
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                modelo.addRow(datos); //Añadimos fila al modelo del Jtable
            }
            //Al finalizar bucle insertar el modelo en el Jtable
            EMPLEADOS.setModel(modelo);
            
            //Ocultamos los botones de modificar/eliminar ya que se muestran todos los clientes
            MODIFICAR.setVisible(false);
            ELIMINAR.setVisible(false);
            //Cierro lo utilizado
            rs.close();
            ver.close();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar tabla", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_TODOMouseClicked

    private void BUSCARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMouseClicked
        ced= TXT_CED.getText();
        
        String []datos=new String[8]; //Vector de datos
        try{
            //Jtable
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cédula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Dirección");
            modelo.addColumn("Correo");
            modelo.addColumn("Puesto");
            modelo.addColumn("Salario");
            
            CallableStatement buscar = General.database.prepareCall("{call BUSCAR_EMPLEADO(?,?)}");
            buscar.setInt(1, Integer.parseInt(ced));
            buscar.registerOutParameter(2, Types.REF_CURSOR);
            buscar.execute();
            ResultSet rs=(ResultSet)buscar.getObject(2);
            while(rs.next()){ 
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                //Creo objeto de clase Cliente con los datos obtenidos
                employee= new EmpleadoU(rs.getString(3), rs.getString(1), rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                modelo.addRow(datos); //Inserto fila al modelo
            }
            //Actualizo modelo de JTable
            EMPLEADOS.setModel(modelo);
            
            //Muestro botones de modificar/eliminar
            MODIFICAR.setVisible(true);
            ELIMINAR.setVisible(true);
            
            //Cierro lo utilizado
            rs.close();
            buscar.close();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar tabla", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BUSCARMouseClicked

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSCARActionPerformed

    private void MODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseClicked
        Modificar_Empleado ventana = new Modificar_Empleado(employee);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MODIFICARMouseClicked

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void ELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELIMINARMouseClicked
        int opt= JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar a este empleado?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION);
        if (opt==JOptionPane.YES_OPTION) {
            try{
            //Preparar consulta de eliminar usuario
           CallableStatement eliminar = General.database.prepareCall("{call ELIMINAR_EMPLEADO("+ced+")}");
           
           eliminar.executeUpdate(); //Ejecución de consulta
           JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");
           eliminar.close();
           this.TODOMouseClicked(evt); //Aplica lo que sucede al precionar mostrar todos
       }
       catch(Exception EX){
           System.out.println("ERROR AL ELIMINAR "+EX);
       }
        }
        
    }//GEN-LAST:event_ELIMINARMouseClicked

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void INSERTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INSERTARMouseClicked
        Insertar_Empleado ventana = new Insertar_Empleado();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_INSERTARMouseClicked

    private void EMPLEADOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPLEADOSMouseClicked
        try{
           ced=EMPLEADOS.getValueAt(EMPLEADOS.getSelectedRow(), 0).toString();
           
           CallableStatement buscar = General.database.prepareCall("{call BUSCAR_EMPLEADO(?,?)}");
           buscar.setInt(1, Integer.parseInt(ced));
           buscar.registerOutParameter(2, Types.REF_CURSOR);
           buscar.execute();
           ResultSet rs=(ResultSet)buscar.getObject(2);
           
           rs.next();
           employee= new EmpleadoU(rs.getString(3), rs.getString(1), rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
           MODIFICAR.setVisible(true);
           ELIMINAR.setVisible(true);
            }
            catch(Exception ex){
                System.out.println("fallo" + ex);
                MODIFICAR.setVisible(false);
                ELIMINAR.setVisible(false);
            }
    }//GEN-LAST:event_EMPLEADOSMouseClicked

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTable EMPLEADOS;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton INSERTAR;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JButton TODO;
    private javax.swing.JTextField TXT_CED;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
